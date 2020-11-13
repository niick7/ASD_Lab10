package miu.asd.lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Manager extends Hire {
  List<Hire> hires = new ArrayList<>();
  public Manager(double salary, String name) {
    super(salary, name);
  }

  public void addHire(Hire hire) {
    hires.add(hire);
  }

  @Override
  public double getTotalSalary() {
    double total = getSalary();
    for (Hire hire : hires) {
      total += hire.getSalary();
    }
    return total;
  }

  @Override
  public int getTotalHires(Visitor<Hire> v) {
    int total = 1;
    for(Hire hire : hires) {
      total += v.getTotalHires(hire);
    }
    return total;
  }

  @Override
  void accept(Consumer<Hire> action) {
    action.accept(this);
  }
}
