package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

public class ContactDeletionTests extends TestBase{
  @Test
  public void testContactDeletion() throws Exception {
    int before = app.getContactHelper().getContactCount();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoAddNewPage();
      app.getContactHelper().createContact(new ContactData("Ирина", "Веденяпина", "+79273712441", "ivedenyapina@yandex.ru", "Test44"), true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().acceptNextAlert = true;
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().confirmDeletion();
    app.getContactHelper().returnToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before - 1);
  }
}
