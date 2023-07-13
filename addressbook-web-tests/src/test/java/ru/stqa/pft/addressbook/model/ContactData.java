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
  public boolean equals(Object obj) {
    if (obj == this) return true;
    if (obj == null || obj.getClass() != this.getClass()) return false;
    var that = (ContactData) obj;
    return Objects.equals(this.firstname, that.firstname) &&
            Objects.equals(this.lastname, that.lastname) &&
            Objects.equals(this.mobilephone, that.mobilephone) &&
            Objects.equals(this.email, that.email) &&
            Objects.equals(this.group, that.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname, mobilephone, email, group);
  }

  @Override
  public String toString() {
    return "ContactData[" +
            "firstname=" + firstname + ", " +
            "lastname=" + lastname + ", " +
            "mobilephone=" + mobilephone + ", " +
            "email=" + email + ", " +
            "group=" + group + ']';
  }

}
