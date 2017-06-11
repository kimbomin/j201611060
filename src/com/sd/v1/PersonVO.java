package com.sd.address.v1;

public class PersonVO {
    private int id;
    private String name;
    private String address;
    private int phone;
    public PersonVO() {}
    public void setAddress(String address) {
      this.address=address;
    }
    public String getAddress() {
      return address;
    }
    public int getPhone() {
      return phone;
    }
    public void setPhone(int phone) {
      this.phone=phone;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name=name;
    }
    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id=id;
    }
    public String toString() {
      return "ID : "+id+" NAME : "+name+" ADDRESS : "+address+" PHONE-NUMBER : "+phone;
    }
}