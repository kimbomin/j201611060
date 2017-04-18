package headfirst.strategy;

public class MallardDuck extends Duck {
  public MallardDuck() {
    //flyBehavior=new FlyWithWings();
    setFlyBehavior(new FlyWithWings());
  }
  public void display() {
    System.out.println("I'm a mallard duck..");
  }
}
