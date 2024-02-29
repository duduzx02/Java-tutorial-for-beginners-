package MinhaInterface;

import javax.swing.*;
import java.awt.*;

public class MinhaInterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(420, 420);
        frame.setTitle("Minha janela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(0x123456));

    }
}
