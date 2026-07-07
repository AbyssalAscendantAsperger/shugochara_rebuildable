@echo off
setlocal
cd /d "%~dp0"
set ECJ=lib\ecj-4.6.1.jar
set BOOT=lib\cldc-1.1-stub-1.0.1.jar;lib\midp-2.0-stub-1.0.jar
set CP=base_classes;lib\optional-stubs.jar
if exist build rmdir /s /q build
if exist dist rmdir /s /q dist
mkdir build\classes build\jarroot dist
xcopy /e /i /q base_classes build\classes >nul
for /r src_patch %%f in (*.java) do echo %%f>> build\sources_patch.txt
if exist build\sources_patch.txt (
  java -jar "%ECJ%" -encoding UTF-8 -1.4 -target cldc1.1 -bootclasspath "%BOOT%" -classpath "%CP%" -d build\classes @build\sources_patch.txt
)
xcopy /e /i /q res build\jarroot >nul
xcopy /e /i /q build\classes build\jarroot >nul
where jar >nul 2>nul
if errorlevel 1 (
  echo Khong thay lenh jar. Hay cai JDK hoac chay build.sh tren Linux/WSL co python3.
  exit /b 1
)
cd build\jarroot
jar cfm ..\..\dist\shugochara_rebuild.jar META-INF\MANIFEST.MF .
cd ..\..
echo Done: dist\shugochara_rebuild.jar
endlocal
