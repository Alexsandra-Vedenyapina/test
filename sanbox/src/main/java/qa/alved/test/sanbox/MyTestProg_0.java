package qa.alved.test.sanbox;

public class MyTestProg_0 {

  public static void main(String[] args) {
    hello("user");
    hello("Alex");

    double l = 5;
    System.out.println("Площадь квадрата: " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Area of a Rectangle with sides " + a + " and " + b + " = " + area(a, b));

  }

  public static void  hello(String nameHello) {
    System.out.println("Hello, " + nameHello + "!");
  }

  public static double area(double len ) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a*b;
  }
}