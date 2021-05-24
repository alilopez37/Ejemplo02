package main.model;

import java.util.Observable;

public class Resta extends Observable {
    OtroObjeto o = new OtroObjeto();

    @Override
    public String toString() {
        return "Resta{" +
                "o=" + o +
                '}';
    }

    public void evento(){
        this.setChanged();
        this.notifyObservers(o);
    }
}
