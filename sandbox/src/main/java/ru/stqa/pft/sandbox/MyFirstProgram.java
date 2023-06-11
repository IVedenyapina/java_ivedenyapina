package ru.stqa.pft.sandbox;

import static java.lang.System.*;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Irina");
  }
  public static void hello(String somebody) {
    out.println("Hello, " + somebody + " ! ");
  }
}
