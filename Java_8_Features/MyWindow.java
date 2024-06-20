package Java_8_Features;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyWindow {
    public static void main(String[] args) {
        // to create window using object jframe
        JFrame frame = new JFrame("My Window");

        // set the window height and width
        frame.setSize(400,400);
        frame.setLayout(new FlowLayout());

        // create button  and add jframe
        JButton button = new JButton("Click Me!");

        // to perform action on clicking button using Action method which consist only one method

        button.addActionListener((e)->{
            System.out.println("Button Click");
            JOptionPane.showMessageDialog(null,"Button Was Clicked");
        });

        button.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {

            }
        });
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
