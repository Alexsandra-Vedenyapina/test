package qa.alved.test.sanbox;

public class MyTestProg_0 {

  public static void main(String[] args) {
    hello("user");
    hello("Alex");

    Squer s = new Squer(5);
    System.out.println("Площадь квадрата: " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
    System.out.println("Area of a Rectangle with sides " + r.a + " and " + r.b + " = " + r.area());

    Point p =new Point(1,1,2,2);
    System.out.println("Дистанция между точкой P1 (" + p.x1 + " , " + p.y1 + ") " + " и точкой P2 (" + p.x1 + " , " + p.y1 + ") = " + p.distance());

  }

  public static void  hello(String Hello) {
   System.out.println("Hello, " + Hello + "!");
  }



}