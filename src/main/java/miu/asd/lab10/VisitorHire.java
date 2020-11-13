package miu.asd.lab10;

public class VisitorHire implements Visitor {
  @Override
  public int getTotalHires(Hire hire) {
    return hire.getTotalHires(this);
  }
}
