package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreation() {
    int before = app.getContactHelper().getContactCount();
    app.getNavigationHelper().gotoAddNewPage();
    app.getContactHelper().createContact(new ContactData("Ирина", "Веденяпина", "+79273712441", "ivedenyapina@yandex.ru", "Test44"), true);
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before + 1);
      }
}
