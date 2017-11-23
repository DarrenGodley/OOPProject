public class Person {
    private String name;
    private int age;
    private char gender;
    private Account account;

    //Accessor Method
    public Account getAccount()
    {
        return account;
    }
    //Accessor Method
    public int getAge()
    {
        return age;
    }
    //Accessor Method
    public char getGender()
    {
        return gender;
    }
    //Accessor Method
    public String getName()
    {
        return name;
    }
    //Mutator Method
    public void setAge (int age) {
        this.age = age;
    }
    //Mutator Method
    public void setName( String name) {
        this.name = name;
    }
    //Mutator Method
    public void setGender(char gender) {
        this.gender = gender;
    }

    //No agrument constructor
    public Person()
    {
        name = "Unknown";
        age = 0;
        gender = 'u';
    }

    //Multi argument constructor
    public Person(String name,int age,char gender,String username,String password,double balance ) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //toString Mthod which also makes a call to the toString method from the Account class
    public String toString() {
        return "\nName: " + getName() +
                "\nAge: " + getAge() + "\nGender: "+ getGender() + "\n" + account.toString()+"\n\n";
    }
}
