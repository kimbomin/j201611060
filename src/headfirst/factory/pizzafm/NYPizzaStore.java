package headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("Cheese")) {
      pizza = new NYStyleCheesePizza();
    }
    return pizza;
  }
}