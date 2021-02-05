package qa.alved.test.sanbox;

public class MyTestProg_0 {

  public static void main(String[] args) {
    hello("user");
    hello("Alex");

    Squer s = new Squer(5);
    System.out.println("Площадь квадрата: " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4,6);
        System.out.println("Area of a Rectangle with sides " + r.a + " and " + r.b + " = " + r.area());

    double x1 = 1;
    double y1 = 1;
    double x2 = 3;
    double y2 = 4;
    System.out.println("Дистанция между точкой P1 (" + x1 + " , " + y1 + ") " + " и точкой P2 (" + x1 + " , " + y1 + ") " + distance(x1,y1,x2,y2));

  }

  public static void  hello(String Hello) {
   System.out.println("Hello, " + Hello + "!");
  }

  public static double distance(
          double x1,
          double y1,
          double x2,
          double y2) {
    return Math.sqrt((y2 - y1) *  (y2 - y1) + (x2 - x1) *  (x2 - x1));
  }


}