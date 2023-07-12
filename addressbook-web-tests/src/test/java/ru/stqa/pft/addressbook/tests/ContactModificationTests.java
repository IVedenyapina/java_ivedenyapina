package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
  @Test
  public void testGroupModification() {
    int before = app.getContactHelper().getContactCount();
    if (! app.getContactHelper().isThereAContact()) {
      app.getNavigationHelper().gotoAddNewPage();
      app.getContactHelper().createContact(new ContactData("Ирина", "Веденяпина", "+79273712441", "ivedenyapina@yandex.ru", "Test44"), true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Мария", "Веденяпина", "+79273713569", "mvedenyapina@yandex.ru", null), false);
    app.getContactHelper().submitContactModification();
    app.getContactHelper().returnToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before);
  }
}
