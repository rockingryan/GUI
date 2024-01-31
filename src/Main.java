import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Fortnite best weapons");
        frame.setSize(500,500);

        // 2 - create panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(41, 171, 255));

        // 3 - create components
        JLabel label = new JLabel("""
                Menu:
                 1 = Oscar's Frenzy Auto Shotgun
                 2 =  Montague's Nemesis Assault Rifle
                 3 = Valeria's Hyper SMG
                 4 = Nisha's Striker Assault Rifle
                 5 = Peter Griffin's Hammer Pump Shotgun""");
        label.setSize(200,500);
        JButton button = new JButton("Press");
        JTextField textField = new JTextField(10);

        // add image
        // image must be in the same folder as the project or you
        // need to spedify the class path
        ImageIcon icon = new ImageIcon("");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));
        // Creating a Label with an icon on it
        JLabel picLabel = new JLabel(icon);


        // 4 - add components to panel
        panel.add(label);
        panel.add(button);
        panel.add(textField);
        panel.add(picLabel);

        // 5 - add panel to frame
        frame.add(panel);

        // 6 - set frame visible
        frame.setVisible(true);

        // listeners
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String blah = textField.getText();


                    if (blah.equalsIgnoreCase("1")) {
                        ImageIcon icon = new ImageIcon("Images/oscar.jpg");
                        icon.setImage(icon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
                        picLabel.setIcon(icon);
                    }
                    else if (blah.equalsIgnoreCase("2")) {
                        ImageIcon icon = new ImageIcon("Images/montague.jpg");
                        icon.setImage(icon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
                        picLabel.setIcon(icon);
                    }
                    else if (blah.equalsIgnoreCase("3")) {
                        ImageIcon icon = new ImageIcon("Images/valeria.jpg");
                        icon.setImage(icon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
                        picLabel.setIcon(icon);
                    }
                    else if (blah.equalsIgnoreCase("4")) {
                        ImageIcon icon = new ImageIcon("Images/nisha.jpg");
                        icon.setImage(icon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
                        picLabel.setIcon(icon);
                    }
                    else if (blah.equalsIgnoreCase("5")) {
                        ImageIcon icon = new ImageIcon("Images/petergriffin.jpg");
                        icon.setImage(icon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
                        picLabel.setIcon(icon);
                    }
                    textField.setText("");

            }
        });
    }
}