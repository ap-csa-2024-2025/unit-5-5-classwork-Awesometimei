public class Person
{
    private String firstName;
    private String lastName;
    private int age;
    private int socialSecurityNumber;

    public void setInfo(String nameFirst, String nameLast, int lifetime, int SSN)
    {
        firstName = nameFirst;
        lastName = nameLast;
        age = lifetime;
        socialSecurityNumber = SSN;
    }   

    public void printInfo()
    {
        System.out.println("SSN: " + socialSecurityNumber);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }
}

