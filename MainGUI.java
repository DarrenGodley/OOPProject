import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainGUI extends JFrame implements ActionListener { // Start class

    JLabel welcomeLabel, usernameLabel, passwordLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    ArrayList <Person> customers;

    public static void main(String[] args) {
        MainGUI gui = new MainGUI();
        gui.setVisible(true);
    }

    public MainGUI(){
        setTitle ("ATM Machine");
        setSize (600,550);
        setLocation (500,100);
        setResizable (false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container cpane = getContentPane();
        cpane.setLayout(null);

        welcomeLabel = new JLabel("Welcome customer");
		welcomeLabel.setBounds(250,5,300,50);
		cpane.add(welcomeLabel);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(200,102,300,50);
		cpane.add(usernameLabel);

		usernameField = new JTextField(10);
		usernameField.setBounds(270,118,100,20);
		cpane.add(usernameField);

		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(200,150,300,50);
		cpane.add(passwordLabel);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
} // End class