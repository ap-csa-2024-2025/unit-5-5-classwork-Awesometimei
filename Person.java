public class Person(String firstName, String lastName, int age, int socialSecurityNumber)
{
    private String firstName;
    private String lastName;
    private int age;
    private int socialSecurityNumber;

    public void toString();
    {
        System.out.println("SSN: " + socialSecurityNumber);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }
}

