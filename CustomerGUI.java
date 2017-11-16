import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerGUI extends JFrame implements ActionListener {

    public CustomerGUI() {

        Container cPane;

        setTitle("ATM Machine");
        setSize(1000, 550);
        setResizable(false);
        setLocation(400, 100);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        cPane = getContentPane();
        cPane.setLayout(new FlowLayout());

        JButton showBalance = new JButton("Show balance");

        Container cpane = getContentPane();

        cpane.setLayout(new FlowLayout());

        cpane.add(showBalance);

        showBalance.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                MainGUI atmMachine = new MainGUI();
                atmMachine.setVisible(true);
            }
        });

        JButton withdraw = new JButton("Withdraw");

        cpane = getContentPane();

        cpane.setLayout(new FlowLayout());

        cpane.add(withdraw);

        withdraw.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton deposit = new JButton("Deposit");

        cpane = getContentPane();

        cpane.setLayout(new FlowLayout());

        cpane.add(deposit);

        deposit.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                MainGUI atmMachine = new MainGUI();
                atmMachine.setVisible(true);
            }
        });

        JButton statements = new JButton("Statements");

        cpane = getContentPane();

        cpane.setLayout(new FlowLayout());

        cpane.add(statements);

        statements.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                MainGUI atmMachine = new MainGUI();
                atmMachine.setVisible(true);
            }
        });

        JButton logout = new JButton("Logout");

        cpane = getContentPane();

        cpane.setLayout(new FlowLayout());

        cpane.add(logout);

        logout.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                MainGUI atmMachine = new MainGUI();
                atmMachine.setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    //public double withdraw(double amount){
    //    if(amount <= balance)
    //        balance -= amount;
    //    return balance;
    //}
}