package headfirst.factory.pizzaaf.small;

public class NYPizzaStore extends PizzaStore {
  public Pizza createPizza(String type) {
    Pizza pizza = null;
    PizzaIngredientFactory inFac = new NYPizzaIngredientFactory();
    if (type.equals("Cheese")) {
      pizza = new CheesePizza(inFac);
    }
    return pizza;
  }
}