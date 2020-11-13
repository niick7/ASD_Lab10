package miu.asd.lab10;

import java.util.function.Consumer;

public class Application {
  public static void main(String[] args) {
    Manager ceo = new Manager(10000, "Ceo of the company");

    Employee e1 = new Employee(5000, "John");
    Employee e2 = new Employee(6000, "Joe");
    Manager m1 = new Manager(7000, "Jill");

    m1.addHire(e1);
    m1.addHire(e2);
    ceo.addHire(m1);

    System.out.println(ceo.getTotalSalary());

    Visitor<Hire> v = new VisitorHire();
    System.out.println(v.getTotalHires(ceo));

    Consumer<Hire> consumer = new HireCounterConsumer();
    consumer.accept(ceo);
  }
}
