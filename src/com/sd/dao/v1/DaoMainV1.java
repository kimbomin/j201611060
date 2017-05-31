package com.sd.dao.v1;

public class DaoMainV1 {
  public static void main(String[] args) {
    Person p;
    PersonDao pd=new PersonDaoImpl();
    p=new Person(0, "kbm");
    pd.insert(p);
    p=new Person(1, "kth");
    pd.insert(p);
    for (Person p1:pd.findAll()) {
      System.out.println(p1.getId());
    }
  }
}