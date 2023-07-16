package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class ContactDeletionTests extends TestBase{
  @Test
  public void testContactDeletion() {
    List<ContactData> before = app.getContactHelper().getContactList();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoAddNewPage();
      app.getContactHelper().createContact(new ContactData("Ирина", "Веденяпина", "+79273712441", "ivedenyapina@yandex.ru", "Test11"));
    }
    app.getContactHelper().selectContact(before.size() -1);
    app.getContactHelper().acceptNextAlert = true;
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().confirmDeletion();
    app.getContactHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size() - 1);

    before.remove(before.size() -1);
    Assert.assertEquals(before, after);
  }
}
