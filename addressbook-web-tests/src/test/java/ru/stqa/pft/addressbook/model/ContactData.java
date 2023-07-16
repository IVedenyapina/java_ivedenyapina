package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public final class ContactData {
  private final String firstname;
  private final String lastname;
  private final String mobilephone;
  private final String email;
  private final String group;

  public ContactData(String firstname, String lastname, String mobilephone, String email, String group) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.mobilephone = mobilephone;
    this.email = email;
    this.group = group;
  }

  public String firstname() {
    return firstname;
  }

  public String lastname() {
    return lastname;
  }

  public String mobilephone() {
    return mobilephone;
  }

  public String email() {
    return email;
  }

  public String group() {
    return group;
  }

  @Override
  public String toString() {
    return "ContactData{" +
            "firstname='" + firstname + '\'' +
            ", lastname='" + lastname + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ContactData that = (ContactData) o;
    return Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname);
  }

}
