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



    Point p1 = new Point(-3, 0);
    Point p2 = new Point(6, -8);

        out.println("Расстояние между точками с координатами " + p1.x + ", " + p1.y + " и " + p2.x + ", " + p2.y + " = " + p1.distance(p2));
  }

  public static void hello(String somebody) {
    out.println("Hello, " + somebody + " ! ");
  }

}
