package javax.wireless.messaging;

import java.io.IOException;
import javax.microedition.io.Connection;

public interface MessageConnection extends Connection {
    public static final String TEXT_MESSAGE = "text";
    public static final String BINARY_MESSAGE = "binary";
    public Message newMessage(String type) throws IOException;
    public Message newMessage(String type, String address) throws IOException;
    public void send(Message message) throws IOException;
    public Message receive() throws IOException;
    public void setMessageListener(MessageListener listener) throws IOException;
    public int numberOfSegments(Message message);
}
