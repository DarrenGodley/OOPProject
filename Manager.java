import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Manager extends JFrame implements ActionListener { // Start class

    JMenu fileMenu,customerMenu;
    static ArrayList <Person> customers;

    public static void main( String[] args ) {
        Manager frame = new Manager();
        frame.setVisible(true);
    }

    public Manager( ) {
        newSystem();
        setTitle ( "Account manager" );
        setSize ( 400,200 );
        setLocation ( 800,200 );
        Container cPane = getContentPane();
        setDefaultCloseOperation (EXIT_ON_CLOSE);

        createFileMenu();
        createCustomerMenu();
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        menuBar.add(customerMenu);

        cPane.setLayout(new FlowLayout());
        JButton jbCustomer = new JButton("Login");
        jbCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainGUI mg = new MainGUI();
                mg.setVisible(true);
            }
        });
        cPane.add(jbCustomer);
    }

    public void newSystem() {
        customers = new ArrayList <Person>();
    }

    public void save() throws IOException {
        ObjectOutputStream os;
        os = new ObjectOutputStream(new FileOutputStream("customers.dat"));
        os.writeObject(customers);
        os.close();
    }

    public void open() {
        try {
            ObjectInputStream is;
            is = new ObjectInputStream(new FileInputStream("customers.dat"));
            customers = (ArrayList<Person>) is.readObject();
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
        String accname = JOptionPane.showInputDialog("Enter account name: ");
        String password = JOptionPane.showInputDialog("Enter account password: ");
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Balance: "));
        Person p = new Person(name,age,accname,password,balance);
        customers.add(p);

        JOptionPane.showMessageDialog(null,name + "'s account has been created");

        MainGUI.currentCustomer = p;

    }

    public void display() {
        JTextArea area = new JTextArea();
        int numCustomers = customers.size();
        if(numCustomers > 0){
            area.setText("Account Holders: \n\n");
            for (int i = 0; i<numCustomers; i++)
                area.append("customer number: " + i + " " + customers.get(i).toString()+"\n");
            showMessage(area);
        }
        else
            showMessage("No customers in the system");
    }

    public void display2(){
        int numCustomers = customers.size();
        if(numCustomers < 1)
            showMessage("No customers in the system");
        else {
            JTextArea area = new JTextArea();
            Iterator <Person> iterator = customers.iterator();
            while ( iterator.hasNext())
                area.append(iterator.next() + "\n");
            showMessage(area);
        }
    }

    public void actionPerformed (ActionEvent e) {
        if (e.getActionCommand().equals("Logout")) {
            showMessage("Shutting down the system");
            System.exit(0);
        }
        else if (e.getActionCommand().equals("Add")) {
            addCustomer();
        }
        else if (e.getActionCommand().equals("Display")) {
            display();
        }
        else if (e.getActionCommand().equals("New File")) {
            newSystem();
        }
        else if (e.getActionCommand().equals("Save")) {
            try {
                save();
                showMessage("Data saved successfully");
            } // try
            catch (IOException f) {
                showMessage("Not able to save the file:\n" +
                        "Check the console printout for clues to why ");
                f.printStackTrace();
            }
        }
        else if (e.getActionCommand() .equals("Open")) {
            open();
            display();
        }
        else
            showMessage("Nothing happened");
    }

    public void createFileMenu(){
    fileMenu = new JMenu("File");

    JMenuItem item;
    item = new JMenuItem("Save");
    item.addActionListener(this);
    fileMenu.add(item);
    item = new JMenuItem("Open");
    item.addActionListener(this);
    fileMenu.add(item);
    item = new JMenuItem("New File");
    item.addActionListener(this);
    fileMenu.add(item);
    fileMenu.addSeparator();
    item = new JMenuItem("Log Out");
    item.addActionListener(this);
    fileMenu.add(item);
    }

    private void createCustomerMenu(){
        customerMenu = new JMenu("Accounts");

        JMenuItem item;
        item = new JMenuItem("Add");
        item.addActionListener(this);
        customerMenu.add(item);

        item = new JMenuItem("Display");
        item.addActionListener(this);
        customerMenu.add(item);
    }

    public void showMessage (String s){
        JOptionPane.showMessageDialog(null,s);
    }

    public void showMessage (JTextArea s){
        JOptionPane.showMessageDialog(null,s);
    }
    } //End class
