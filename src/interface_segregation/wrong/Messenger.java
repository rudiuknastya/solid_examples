package interface_segregation.wrong;

import java.awt.*;

public interface Messenger {
    void sendText(String text);
    void sendImage(Image image);
    void sendVideo(String video);
    void sendEmoji(String emoji);
}
