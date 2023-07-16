package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

import java.util.List;

public class ContactModificationTests extends TestBase {
  @Test
  public void testContactModification() {
    List<ContactData> before = app.getContactHelper().getContactList();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoAddNewPage();
      app.getContactHelper().createContact(new ContactData("Ирина", "Веденяпина", "+79273712441", "ivedenyapina@yandex.ru", "Test111"));
    }
    app.getContactHelper().returnToHomePage();
    app.getContactHelper().selectContact(before.size() -1);
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Мария", "Веденяпина", "+79273713569", "mvedenyapina@yandex.ru", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
    List<ContactData> after = app.getContactHelper().getContactList();
    Assert.assertEquals(after.size(), before.size());
  }
}
