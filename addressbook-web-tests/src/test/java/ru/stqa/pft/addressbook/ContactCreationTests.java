package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {
  @Test
  public void testContactCreation() throws Exception {
    gotoAddNewPage();
    fillContactForm(new ContactData("Ирина", "Веденяпина", "+79273712441", "ivedenyapina@yandex.ru"));
    submitContactCreation();
    returnToHomePage();
  }

}
