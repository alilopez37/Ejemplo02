package main.model;

import java.util.Observable;

public class Suma extends Observable {
    private int elemento01;
    private int elemento02;

    public int getElemento01() {
        return elemento01;
    }

    public void setElemento01(int elemento01) {
        this.elemento01 = elemento01;
        this.setChanged();
        this.notifyObservers("Soy suma: elemento01");
    }

    public int getElemento02() {
        return elemento02;
    }

    public void setElemento02(int elemento02) {
        this.elemento02 = elemento02;
        this.setChanged();
        this.notifyObservers("Cambio el valor de elemment02");
    }
}
