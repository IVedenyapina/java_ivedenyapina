package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
  @Test

  public void testArea() {
    Point p1 = new Point();
    p1.x1 = 6;
    p1.y1 = 2;

    Point p2 = new Point();
    p2.x2 = -5;
    p2.y2 = 1;

    Point d = new Point();
    Assert.assertEquals(d.distance(p1, p2), 11.045361017187261);
  }
}
