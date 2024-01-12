package interface_segregation.right;

import java.awt.*;

public interface Messenger {
    void sendText(String text);
    void sendImage(Image image);
    void sendVideo(String video);
}
