package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public final class GroupData {
  public void setId(int id) {
    this.id = id;
  }

  private int id;
  private final String name;
  private final String header;
  private final String footer;

  public int getId() {
    return id;
  }



  public GroupData(String name, String header, String footer) {
    this.id = Integer.MAX_VALUE;
    this.name = name;
    this.header = header;
    this.footer = footer;
  }

  @Override
  public String toString() {
    return "GroupData{" +
            "id=" + id +
            ", name='" + name + '\'' +
            '}';
  }

  public GroupData(int id, String name, String header, String footer) {
    this.id = id;
    this.name = name;
    this.header = header;
    this.footer = footer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GroupData groupData = (GroupData) o;
    return Objects.equals(name, groupData.name);
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }

  public String name() {
    return name;
  }

  public String header() {
    return header;
  }

  public String footer() {
    return footer;
  }

}