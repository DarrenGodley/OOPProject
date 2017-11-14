import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;
import java.util.ArrayList;

    public class Admin extends JFrame implements ActionListener {

        //array
        ArrayList<Customer> customer;

        //customer
        String accNum;
        double balance;

        public Admin() {

            Container cPane;

            setTitle     ("ATM Machine");
            setSize      (500,550);
            setResizable (false);
            setLocation  (500,100);

            setDefaultCloseOperation(EXIT_ON_CLOSE);

            cPane = getContentPane( );
            cPane.setLayout(new FlowLayout());

            JButton newCustomer = new JButton("Create new customer");

            Container cpane = getContentPane();

            cpane.setLayout(new FlowLayout());

            cpane.add(newCustomer);

            newCustomer.addActionListener(new ActionListener() {


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


        /*@Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals("Browse"))
            {
                JOptionPane.showMessageDialog(null,"Hello Test");
            }
        }*/
    }
