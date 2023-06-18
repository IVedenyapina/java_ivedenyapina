package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.awt.geom.Point2D.distance;

public class PointTests {
  @Test

  public void testArea() {
    Point p1 = new Point(-1, 0);
    Point p2 = new Point(-1, 0);

    Assert.assertEquals(p1.distance(p2), 12.041594578792296);

    p1 = new Point(-1, 0);
    p2 = new Point(-3, -5);

    Assert.assertEquals(p1.distance(p2), 5.385164807134504);
  }
}
