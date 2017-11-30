public class Account { //start class
    private String name;
    private String password;
    private double balance;

    //Accessor methods
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }
    //End accessor

    //Mutator methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //End mutator

    //No argument constructor
    public Account()
    {
        this("Known","Known",0);
    }

    //Multi argument constructor
    public Account(String username,String password,double balance)
    {
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    //toString method
    public String toString()
    {
        return  "Username: " + getName() +
                "\nPassword " + getPassword() + "\nBalance: €" +
                String.format("%.2f",getBalance());
    }
} //end class
