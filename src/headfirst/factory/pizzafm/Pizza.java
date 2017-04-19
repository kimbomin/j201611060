package headfirst.factory.pizzafm;

import java.util.ArrayList;

public abstract class Pizza {
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<String>();
  public void prepare() {
    System.out.println("Preparing "+name);
  }
  public void bake() {
    System.out.println("Baking "+name);
  }
  public void cut() {
    System.out.println("Cuting "+name);
  }
  public void box() {
    System.out.println("Boxing "+name);
  }
}