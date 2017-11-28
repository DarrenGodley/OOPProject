import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainGUI extends JFrame implements ActionListener { // Start class

    //Setting names for gui interface
    JLabel welcomeLabel, usernameLabel, passwordLabel, loginLabel;
    JTextField usernameField;
    JPasswordField passwordField;
    JButton submit;
    //Creating ArrayList
    ArrayList <Person> customers;

    public static void main(String[] args) {
        MainGUI gui = new MainGUI();
        gui.setVisible(true);
    }

    public MainGUI(){
        setTitle ("ATM Machine");
        setSize (500,400);
        setLocation (500,100);
        setResizable (false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Container cpane = getContentPane();
        cpane.setLayout(null);

        loginLabel = new JLabel("Welcome customer");
        loginLabel.setBounds(200,5,300,50);
		cpane.add(loginLabel);

        welcomeLabel = new JLabel("Please enter your login details to continue");
        welcomeLabel.setBounds(150,40,300,50);
        cpane.add(welcomeLabel);

        usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(160,102,300,50);
		cpane.add(usernameLabel);

		usernameField = new JTextField(10);
		usernameField.setBounds(230,118,100,20);
		cpane.add(usernameField);

		passwordLabel = new JLabel("Password:");
		passwordLabel.setBounds(160,150,300,50);
		cpane.add(passwordLabel);

        passwordField = new JPasswordField(10);
        passwordField.setBounds(230,165,100,20);
        cpane.add(passwordField);

        submit = new JButton("Enter");
        submit.setBounds(200,210,100,20);
        cpane.add(submit);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CustomerGUI bankCustomer = new CustomerGUI();
                bankCustomer.setVisible(true);
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    }
} // End class