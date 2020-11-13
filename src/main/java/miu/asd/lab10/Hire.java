package miu.asd.lab10;

import java.util.function.Consumer;

public abstract class Hire {
  private double salary;
  private String name;

  public Hire(double salary, String name) {
    this.salary = salary;
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  abstract double getTotalSalary();

  abstract int getTotalHires(Visitor<Hire> v);

  abstract void accept(Consumer<Hire> action);
}
