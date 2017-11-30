public class Person {
    private String name;
    private int age;
    private Account account;

    //Accessor method
    public Account getAccount()
    {
        return account;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    //Mutator method
    public void setAge (int age) {
        this.age = age;
    }

    public void setName( String name) {
        this.name = name;
    }

    //No argument constructor
    public Person()
    {
        name = "Unknown";
        age = 0;
    }

    //Multi argument constructor
    public Person(String name,int age,String username,String password,double balance ) {
        this.name = name;
        this.age = age;
    }

    //toString method which calls the toString method from the Account class
    public String toString() {
        return "\nName: " + getName() +
                "\nAge: " + getAge() + "\n" + account.toString()+"\n\n";
    }
}
