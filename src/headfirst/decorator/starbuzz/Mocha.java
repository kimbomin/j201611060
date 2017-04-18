package headfirst.decorator.starbuzz;

public abstract class Mocha extends CondimentDecorator {
  Beverage beverage;
  //String description="Unknown Beverage";
  
  public Mocha(Beverage b) {
    this.beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription()+" adding Mocha";
  }
  public double cost() {
    return beverage.cost()+.20;
  }
}