package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTestEqual {
  @Test

  public void testArea() {
    Point p1 = new Point(-1, 0);
    Point p2 = new Point(-1, 0);

    Assert.assertEquals(p1.distance(p2), 0);
  }
}
