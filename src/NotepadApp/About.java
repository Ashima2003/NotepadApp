package NotepadApp;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About(){
        setBounds(100,100, 500, 700);
        setTitle("About Notepad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon icon = new ImageIcon(getClass().getResource("img.png"));
        setIconImage(icon.getImage());

        setLayout(null);
        JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("img.png")));
        iconLabel.setBounds(100, 50, 400, 300);
        add(iconLabel);

        JLabel textLabel = new JLabel("<html>Welcome to my App<br>I made this.</html>");
        textLabel.setBounds(100, 50, 400, 700);
        textLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
        add(textLabel);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
