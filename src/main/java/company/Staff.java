package company;

import java.util.Objects;

public class Staff extends Employee {
  private int days;

  public Staff(int id, String name, int days) {
    super(id, name);
    this.days = days;
  }

}