package interface_segregation.wrong;

import java.awt.*;

public class SecondMessenger implements Messenger{
    @Override
    public void sendText(String text) {

    }

    @Override
    public void sendImage(Image image) {

    }

    @Override
    public void sendVideo(String video) {

    }

    @Override
    public void sendEmoji(String emoji) {
        // no implementation
    }
}
