package headfirst.iterator.dinermerger.before;

import java.util.ArrayList;

public class PancakeHouseMenu {
  ArrayList menuItems;
  public PancakeHouseMenu() {
    menuItems = new ArrayList();
    addItem("BLT 1","Bacon, Lettuce, Tomato", true, 2.99);
    addItem("BLT 2","Bacon 2, Lettuce 2, Tomato 2", true, 2.99);
  }
  public void addItem(String n, String d, boolean v, double p) {
    MenuItem m=new MenuItem(n,d,v,p);
    menuItems.add(m);
  }
  public ArrayList getMenuItems() {
    return menuItems;
  }
}