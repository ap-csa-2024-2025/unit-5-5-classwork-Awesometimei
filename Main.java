import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Point2D p1 = new Point2D();
    Point2D p2 = new Point2D();
    
    p1.setX(0);
    p1.setY(4);
    p1.setX(3);
    p1.setY(2);

    Dog dog1 = new Dog();

    Person justin = new Person("Justin", "Vu", 16, 121232);
    justin.toString();
  }
}
