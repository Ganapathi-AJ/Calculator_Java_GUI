import javax.swing.*;
import java.awt.*;


public class App {
    public static void main(String[] args) throws Exception {

        JFrame window = new JFrame("Calculator");
        window.setSize(500,500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField User_Input = new JTextField();
        User_Input.setSize(500,120);
        User_Input.setFont(new Font("Arial", Font.PLAIN, 25));



        JPanel panel = new JPanel(new GridLayout(4,3));
        panel.setSize(100,100);

        String[] btnlabels = {"1", "2", "3", "4", "5", "6", "7","8","9", "0", ".", "="};

        for(String label : btnlabels){

            JButton btn = new JButton(label);
            btn.setSize(50,50);
            panel.add(btn);
        }

        window.add(User_Input, BorderLayout.NORTH);
        window.add(panel, BorderLayout.CENTER);
        window.setVisible(true);
    }
}
