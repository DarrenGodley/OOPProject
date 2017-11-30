import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerGUI extends JFrame implements ActionListener { // Start class

    public CustomerGUI() {
        //Creating JButton names
        JButton showBalance, withdraw, deposit, statements, logout;

        Container cPane;
        //Creating content pane
        setTitle("Select an Option");
        setSize(500, 500);
        setResizable(false);
        setLocation(400, 100);
        getContentPane().setBackground(Color.PINK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Show balance button
        showBalance = new JButton("Show balance");
        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        cPane.add(showBalance);
        showBalance.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, String.format("Your balance is: %s", MainGUI.currentCustomer.getAccount().getBalance()));
            }
        });

        //withdraw button
        withdraw = new JButton("Withdraw");
        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        cPane.add(withdraw);
        withdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double amount = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount you want to withdraw: "));
                MainGUI.currentCustomer.getAccount().setBalance(MainGUI.currentCustomer.getAccount().getBalance()-amount);

                JOptionPane.showMessageDialog(null,MainGUI.currentCustomer.toString());
            }
        });

        //deposit button
        deposit = new JButton("Deposit");
        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        cPane.add(deposit);
        deposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount you want to deposit: "));
                MainGUI.currentCustomer.getAccount().setBalance(MainGUI.currentCustomer.getAccount().getBalance() + amount);

                JOptionPane.showMessageDialog(null,MainGUI.currentCustomer.toString());
            }
        });

        //statements button
        statements = new JButton("Statements");
        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        cPane.add(statements);
        statements.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //logout button
        logout = new JButton("Logout");
        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        cPane.add(logout);
        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Shutting down the system","Shutting down", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
} // End class