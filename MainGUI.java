import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame implements ActionListener { // Start class
    public static void main(String[] args) {
        MainGUI gui = new MainGUI();
        gui.setVisible(true);
    }

    public MainGUI(){
        setTitle     ("Welcome");
        setSize      (600,550);
        setResizable (false);
        setLocation  (500,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton managerButton = new JButton("Manager");
        JButton customerButton = new JButton("Customer");
        Container cpane = getContentPane();
        cpane.setLayout(new FlowLayout());
        cpane.add(managerButton);
        cpane.add(customerButton);

        managerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Manager atmMachine = new Manager();
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

    @Override
    public void actionPerformed(ActionEvent e) {
    }
} // End class