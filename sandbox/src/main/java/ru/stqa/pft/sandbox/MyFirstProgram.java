package ru.stqa.pft.sandbox;

import static java.lang.System.*;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Irina");

    Square s = new Square(5);
    out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());


    Rectangle r = new Rectangle(4, 6);
    out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());



    Point p1 = new Point();
    p1.x1 = 6;
    p1.y1 = 2;

    Point p2 = new Point();
    p2.x2 = -5;
    p2.y2 = 1;

    Point d = new Point();

        out.println("Расстояние между точками p1 и p2 = " + d.distance(p1, p2));
  }

  public static void hello(String somebody) {
    out.println("Hello, " + somebody + " ! ");
  }

}
