package miu.asd.lab10;

import java.util.function.Consumer;

public class Employee extends Hire {
  public Employee(double salary, String name) {
    super(salary, name);
  }

  @Override
  public double getTotalSalary() {
    return this.getSalary();
  }

  @Override
  public int getTotalHires(Visitor<Hire> v) {
    return 1;
  }

  @Override
  void accept(Consumer<Hire> action) {
    action.accept(this);
  }
}
