import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Fortnite best weapons");
        frame.setSize(500,500);

        // 2 - create panel
        JPanel panel = new JPanel();
        panel.setBackground(new Color(41, 171, 255));

        // 3 - create components
        JLabel label = new JLabel("Menu:" + "\n" + " 1 = Oscar's Frenzy Auto Shotgun" + "\n" + " 2 =  Montague's Enforcer Assult Rifle" + "\n" + "3 = Valeria's Hyper SMG" + "\n" + "4 = Nisha's Striker Assault Rifle" + "\n" + "5 = Peter Griffin's Hamer Pump Shotgun");
        label.setSize(200,500);
        JButton button = new JButton("Press");
        JTextField textField = new JTextField(10);

        // add image
        // image must be in the same folder as the project or you
        // need to spedify the class path
        ImageIcon icon = new ImageIcon("images/PNG/2C.png");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
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
    }
}