import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class EmojiSoundGUI extends Frame implements ActionListener {
    JButton button1 = new JButton("Bamboo Hit sfx");
    JButton button2 = new JButton("Censor beep sfx");
    JButton button3 = new JButton("gmod Metal clanking sfx");

    EmojiSoundGUI() {
        ImageIcon[] images = getImages();


        c.gridx = 0;
        c.gridy = 0;
        button1.setIcon(images[0]);
        button1.addActionListener(this);
        panel.add(button1, c);

        c.gridx = 0;
        c.gridy = 1;
        button2.setIcon(images[1]);
        button2.addActionListener(this);
        panel.add(button2, c);

        c.gridx = 0;
        c.gridy = 2;
        button3.setIcon(images[2]);
        button3.addActionListener(this);
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

    public static void playSound(String filename) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(filename).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == button1)
            playSound("sounds/Bamboo Hit Sound Effect.wav");
        else if (source == button2)
            playSound("sounds/censor-beep-01.wav");
        else if (source == button3)
            playSound("sounds/sfx_metal_clanging_gmod_garrys_mod_source_half_life.wav");
    }
}
