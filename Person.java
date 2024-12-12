public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private int socialSecurityNumber;

    public void setInfo()
    {
        System.out.println("Last Name: ");
        firstName = Main.sc.nextLine();
        System.out.println("First Name: ");
        lastName = Main.sc.nextLine();
        System.out.println("Age Name: ");
        age = Main.sc.nextInt();
        System.out.println("Social Security #: ");
        SSN = Main.sc.nextInt();
    }   

    public String getFirstName()
    {
        return firstName;
    }

     public String getlastName()
    {
        return lastName;
    }

     public int getAge()
    {
        return age;
    }

     public int getSSN()
    {
        return socialSecurityNumber;
    }
}

