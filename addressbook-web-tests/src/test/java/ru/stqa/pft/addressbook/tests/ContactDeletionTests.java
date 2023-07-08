package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class ContactDeletionTests extends TestBase{
  @Test
  public void testContactDeletion() throws Exception {
    app.getContactHelper().returnToHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().acceptNextAlert = true;
    app.getContactHelper().deleteSelectedContact();
    app.getContactHelper().confirmDeletion();
  }
}
