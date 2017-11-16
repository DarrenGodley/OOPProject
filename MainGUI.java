import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame {
    public static void main(String[] args) {
        MainGUI gui = new MainGUI();
        gui.setVisible(true);
    }

    public MainGUI(){
        setTitle     ("Main GUI");
        setSize      (600,550);
        setResizable (true);
        setLocation  (500,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton adminButton = new JButton("Admin");
        JButton customerButton = new JButton("Customer");

        Container cpane = getContentPane();

        cpane.setLayout(new FlowLayout());

        cpane.add(adminButton);
        cpane.add(customerButton);

        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin atmMachine = new Admin();
                atmMachine.setVisible(true);
            }
        });

        customerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CustomerGUI atmMachine = new CustomerGUI();
                atmMachine.setVisible(true);
            }
        });

    }
}