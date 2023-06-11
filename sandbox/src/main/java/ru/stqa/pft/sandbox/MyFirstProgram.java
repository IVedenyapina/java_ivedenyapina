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

  }

  public static void hello(String somebody) {
    out.println("Hello, " + somebody + " ! ");
  }

}
