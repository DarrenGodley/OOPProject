import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class Manager extends JFrame implements ActionListener { // Start class

    JMenu fileMenu,customerMenu;
    ArrayList <Person> customer;

    public static void main( String[] args ) {
        Manager frame = new Manager();
        frame.setVisible(true);
    }

    public Manager( ) {
        newSystem();
        //set the frame default properties
        setTitle     ( "Bike repair shop system" );
        setSize      ( 400,200 );
        setLocation  ( 100,100 );
        Container pane = getContentPane();
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        createFileMenu();
        createCustomerMenu();
        //and add them to the menubar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(customerMenu);
    }

    public void newSystem() {
        customer = new ArrayList <Person>();
    }

    public void save() throws IOException {
        ObjectOutputStream os;
        os = new ObjectOutputStream(new FileOutputStream("user.dat"));
        os.writeObject(customer);
        os.close();
    }

    public void open() {
        try {
            ObjectInputStream is;
            is = new ObjectInputStream(new FileInputStream("user.dat"));
            customer = (ArrayList<Person>) is.readObject();
            is.close();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "open didn't work");
            e.printStackTrace();
        }
    }

    public void addCustomer(){
        String name = JOptionPane.showInputDialog("Enter customer name: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter customer age: "));
        String gender = JOptionPane.showInputDialog("Enter customer Gender: ");
        char g = gender.charAt(0);
        String accname = JOptionPane.showInputDialog("Enter account name: ");
        String password = JOptionPane.showInputDialog("Enter account password: ");
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Balance: "));
        Person p = new Person(name,age,g,accname,password,amount);
        customer.add(p);

        JOptionPane.showMessageDialog(null,name + "s account has successfully created");
    }

    public void display() {
        JTextArea area = new JTextArea();
        int numCustomers = customer.size();
        if(numCustomers > 0){

        }
    }

    public void actionPerformed(ActionEvent e) {
        }
    } //End class
