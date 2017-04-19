package com.sd.address.v0;

public interface Observable {
    public void registObserver(Observer o);
    public void deleteObserver(Observer o);
}