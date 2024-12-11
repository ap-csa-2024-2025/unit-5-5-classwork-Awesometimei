import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();
    
    p1.setX(0);
    p1.setY(4);
    p2.setX(3);
    p2.setY(2);
    System.out.println("Point 1: (" + p1.getX() + "," + p1.getY() + ")");
    System.out.println("Point 2: (" + p2.getX() + "," + p2.getY() + ")");

    Dog dog1 = new Dog();
    dog1.bark();

    Person justin = new Person();
    justin.setInfo("Justin", "Vu", 16, 121232);
    justin.printInfo();
  }
}
