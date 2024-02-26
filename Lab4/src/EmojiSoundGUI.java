import javax.imageio.ImageIO;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class EmojiSoundGUI extends Frame{
    JButton button1 = new JButton("Mike");
    JButton button2 = new JButton("Dog");
    JButton button3 = new JButton("Cat");

    EmojiSoundGUI() {
        ImageIcon images[] = getImages();


        c.gridx = 0;
        c.gridy = 0;
        button1.setIcon(images[0]);
        panel.add(button1, c);

        c.gridx = 0;
        c.gridy = 1;
        button2.setIcon(images[1]);
        panel.add(button2, c);

        c.gridx = 0;
        c.gridy = 2;
        button3.setIcon(images[2]);
        panel.add(button3, c);

        setVisible(true);
    }

    public static void main(String[] args) {
        EmojiSoundGUI run = new EmojiSoundGUI();
    }

    public static ImageIcon[] getImages() {

        BufferedImage bufferedImage;
        Image image;
        try {bufferedImage = ImageIO.read(new File("images/Mike.jpg"));}
        catch (IOException e) {throw new RuntimeException(e);}
        image = bufferedImage.getScaledInstance(150,150, Image.SCALE_DEFAULT);
        ImageIcon mike = new ImageIcon(image);

        try {bufferedImage = ImageIO.read(new File("images/dog.png"));}
        catch (IOException e) {throw new RuntimeException(e);}
        image = bufferedImage.getScaledInstance(150,150, Image.SCALE_DEFAULT);
        ImageIcon cat = new ImageIcon(image);

        try {bufferedImage = ImageIO.read(new File("images/cat.png"));}
        catch (IOException e) {throw new RuntimeException(e);}
        image = bufferedImage.getScaledInstance(150,150, Image.SCALE_DEFAULT);
        ImageIcon dog = new ImageIcon(image);

        ImageIcon[] iconArray = {mike, dog, cat};

        return iconArray;
    }

    public static Clip[] getSounds() {
        File file;
        AudioInputStream stream;
        AudioFormat format;
        DataLine.Info info;
        Clip[] clips;


    }

}
