package main.model;

import java.util.Observable;
import java.util.Observer;

public class Aritmetica implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Recibiendo status de Suma");
    }
}
