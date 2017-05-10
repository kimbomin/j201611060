package headfirst.singleton.chocolate;

public class ChocolateControler {
  public static void main(String args[]) {
    ChocolateBoiler boiler=ChocolateBoiler.getInstance();
    boiler.fill();
    boiler.drain();
    boiler.boil();
    ChocolateBoiler boiler2=ChocolateBoiler.getInstance();
  }
}