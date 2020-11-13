package miu.asd.lab10;

import java.util.function.Consumer;

public class HireCounterConsumer implements Consumer<Hire> {
  @Override
  public void accept(Hire hire) {
    Visitor<Hire> v = new VisitorHire();
    hire.accept(h -> System.out.println(v.getTotalHires(h)));
  }
}
