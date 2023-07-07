package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreation() throws Exception {
    app.gotoAddNewPage();
    app.getContactHelper().fillContactForm(new ContactData("Ирина", "Веденяпина", "+79273712441", "ivedenyapina@yandex.ru"));
    app.getContactHelper().submitContactCreation();
    app.getGroupHelper().returnToHomePage();
  }

}
