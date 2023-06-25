package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class ContactDeletionTests extends TestBase{
  @Test
  public void testContactDeletion() throws Exception {
    returnToHomePage();
    selectContact();
    acceptNextAlert = true;
    deleteSelectedContact();
    confirmDeletion();
  }

}
