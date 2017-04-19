package headfirst.factory.pizzafm;

public class SMPizzaStore extends PizzaStore {
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("Cheese")) {
      pizza = new SMStyleCheesePizza();
    }
    else if (type.equals("Potato")) {
      pizza = new SMStylePotatoPizza();
    }
    return pizza;
  }
}