package headfirst.strategy;

public class FlyNoWay implements FlyBehavior {
  public void nofly() {
    System.out.println("I can't fly..");
  }
}