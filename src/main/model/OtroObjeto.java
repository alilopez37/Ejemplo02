package main.model;

import java.util.Observable;
import java.util.Observer;

public class OtroObjeto implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Soy OtroObjeto");
    }
}
