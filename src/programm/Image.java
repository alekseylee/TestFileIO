package programm;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Image {

    public static void imageIoWrite() {
        BufferedImage bImage = null;
        try {
            URL url = new URL("https://assets-global.website-files.com/5f3c19f18169b62a0d0bf387/60d33beacf4ba7263a23cd79_qh6ImC4NPdyPbvn-7ns8FYsgOskDPDWLnX31mLCOgSwpX_SQgmo8krqdg4e6XAnSbqRAtZMYqlf7UTvlHiXgt5YtMwbt9IRY1fAbOjyq5hARui-xEQUgI48EOjhJGuIsSFDg90L6.jpeg");
            bImage = ImageIO.read(url);

            ImageIO.write(bImage, "jpeg", new File("FromAlexeyToJoey/image.jpeg"));

        } catch (IOException e) {
            System.out.println("Exception occurred :" + e.getMessage());
        }
        System.out.println("Images were written successfully.");

        JFrame frame = new JFrame();
        frame.setSize(1920, 1080);
        JLabel label = new JLabel(new ImageIcon(bImage));
        frame.add(label);
        frame.setVisible(true);
    }

}