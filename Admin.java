import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class Admin extends JFrame implements ActionListener { // Start class
        String admin;
        double pinNumber;

        public Admin() {

            Container cPane;

            setTitle("Admin");
            setSize(500, 550);
            setResizable(false);
            setLocation(500, 100);

            setDefaultCloseOperation(EXIT_ON_CLOSE);

            //New customer button
            cPane = getContentPane();

            cPane.setLayout(new FlowLayout());

            JButton newCustomer = new JButton("Create new customer");

            Container cpane = getContentPane();

            cpane.setLayout(new FlowLayout());

            cpane.add(newCustomer);

            newCustomer.addActionListener(new ActionListener() {

              @Override
               public void actionPerformed(ActionEvent e) {
                  Account[] acc = new Account[6];
                  int count = 0;
                  do {
                      acc[count] = new Account();
                      acc[count].setName(JOptionPane.showInputDialog("Account name: "));
                      acc[count].setPassword(JOptionPane.showInputDialog("Password: "));
                      acc[count].setBalance(Double.parseDouble(JOptionPane.showInputDialog("starting balance: ")));
                      count++;
                  }
                  while (JOptionPane.showConfirmDialog(null, "More accounts? ") == JOptionPane.YES_OPTION
                          && count < acc.length);
              }
            }

            );

            //Back Button
            cpane = getContentPane();

            cpane.setLayout(new FlowLayout());

            JButton back = new JButton("Back");

            cpane.add(back);

            back.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    MainGUI atmMachine = new MainGUI();
                    atmMachine.setVisible(true);
                }
            });
        }

        public void actionPerformed(ActionEvent e) {
        }
    } //End class
