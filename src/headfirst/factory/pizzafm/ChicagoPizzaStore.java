package headfirst.factory.pizzafm;

public class ChicagoPizzaStore extends PizzaStore {
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    if (type.equals("Cheese")) {
      pizza = new ChicagoStyleCheesePizza();
    }
    return pizza;
  }
}