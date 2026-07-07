package javax.wireless.messaging;

public interface Message {
    public String getAddress();
    public void setAddress(String address);
    public java.util.Date getTimestamp();
}
