package com.sd.address.v1;

import java.util.List;

public interface PersonDao {
  public void insert(PersonVO P);
  public List<PersonVO> findAll();
  public PersonVO findById(int id);
  public void update(PersonVO p);
  public void delete(int id);
}