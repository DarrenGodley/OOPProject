import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerGUI extends JFrame implements ActionListener { // Start class

    public CustomerGUI() {
        JButton showBalance, withdraw, deposit, statements, logout;

        Container cPane;

        setTitle("Select an Option");
        setSize(500, 501);
        setResizable(false);
        setLocation(400, 100);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //balance button
        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());
        showBalance = new JButton("Show balance");
        showBalance.setBounds(1,1,250,167);
        Container cpane = getContentPane();
        cpane.setLayout(new FlowLayout());

        cpane.add(showBalance);
        showBalance.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println();
            }
        });

        //withdraw button
        withdraw = new JButton("Withdraw");
        cpane = getContentPane();
        cpane.setLayout(new FlowLayout());
        cpane.add(withdraw);
        withdraw.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //deposit button
        deposit = new JButton("Deposit");
        cpane = getContentPane();
        cpane.setLayout(new FlowLayout());
        cpane.add(deposit);
        deposit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //statements button
        statements = new JButton("Statements");
        cpane = getContentPane();
        cpane.setLayout(new FlowLayout());
        cpane.add(statements);
        statements.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //logout button
        logout = new JButton("Logout");
        cpane = getContentPane();
        cpane.setLayout(new FlowLayout());
        cpane.add(logout);
        logout.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
} // End class