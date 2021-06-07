// what is swing?
// toolkit or API provides ready-made components like buttons to build java GUI
// java swing library built with AWT
// container class: has other components
// GUI

// import javax.swing.*;
// class gui{
//     public static void main(String args[]){
//        JFrame frame = new JFrame("My First GUI");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(200,200);
//        JButton button = new JButton("Press");
//        frame.getContentPane().add(button); // Adds Button to content pane of frame
//        frame.setVisible(true);
//     }
// }

// import javax.swing.*;
//    class gui{
//       public static void main(String args[]){
//         JFrame frame = new JFrame("My First GUI");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setSize(300,300);
//        JButton button1 = new JButton("Press");
//        frame.getContentPane().add(button1);
//        frame.setVisible(true);
//      }
// }

// import javax.swing.*;
// class gui{
//       public static void main(String args[]){
//            JFrame frame = new JFrame("My First GUI");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            frame.setSize(300,300);
//           JButton button1 = new JButton("Button 1");
//           JButton button2 = new JButton("Button 2");
//           frame.getContentPane().add(button1);
//           frame.getContentPane().add(button2);
//           frame.setVisible(true);
//      }
// }

// java layout manager
// borderLayout
// java flowlayout
// java gridbaglayout

import javax.swing.*;
import java.awt.*;

class guiSample {
    public static void main(String[] args) {
        
        // creating the frame
        JFrame frame = new JFrame("chat frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);

        // creating the menubar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m2.add(m22);

        // creating the panel at bottom and adding components
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Enter Text");
        JButton send = new JButton("send");
        JTextField tf = new JTextField(10);
        JButton reset = new JButton("Reset");
        panel.add(label);
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // test area at the center
        JTextArea ta = new JTextArea();

        // adding components to the frame
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}