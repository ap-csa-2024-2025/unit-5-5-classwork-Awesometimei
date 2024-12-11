public class Dog
{
    private String breed;
    private double size;
    private String furColor;

    public void bark()
    {
        System.out.println("Bark!");        
    }

    public void changeSize(int newSize)
    {
        size = newSize;
    }

    public void dogInfo()
    {
        System.out.println("Breed: " + breed);
        System.out.println("Size: " + size);
        System.out.println("Fur Color: " + furColor);
    }
}
