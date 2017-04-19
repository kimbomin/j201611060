package headfirst.factory.pizzas;

public class PotatoPizza extends Pizza {
  public PotatoPizza() {
    name="Potato Pizza";
    dough="Regular Crust";
    sauce="Hot Sauce";
    toppings.add("Fresh Mozzarella");
    toppings.add("Potato");
  }
}