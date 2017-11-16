import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Admin extends JFrame implements ActionListener {
        private String admin;
        private double pinNumber;
        private String custName;
        private int custID;
        private double balance;

        public String getCustName() {
            return custName;
        }

        public int getCustID() {
            return custID;
        }

        public double getBalance() {
            return balance;
        }

        public void setCustName(String custName) {
            this.custName = custName;
        }

        public void setCustID(int custID) {
            this.custID = custID;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }



        public Admin() {

            Container cPane;

            setTitle     ("ATM Machine");
            setSize      (500,550);
            setResizable (false);
            setLocation  (500,100);

            setDefaultCloseOperation(EXIT_ON_CLOSE);

            admin = JOptionPane.showInputDialog("Please enter your username");
            pinNumber = Double.parseDouble(JOptionPane.showInputDialog("Please enter your pin number"));

            if (admin == "darren"){
                if (pinNumber == 12345){
                    JOptionPane.showMessageDialog(null,"Welcome", "Welcome admin", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Wrong username or password, goodbye", "Wrong admin", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }

            String custName;
            int custID;
            double balance;

            cPane = getContentPane( );
            cPane.setLayout(new FlowLayout());

            JButton newCustomer = new JButton("Create new customer");

            Container cpane = getContentPane();

            cpane.setLayout(new FlowLayout());

            cpane.add(newCustomer);

            newCustomer.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
