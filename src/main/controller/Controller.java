package main.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import main.model.Aritmetica;
import main.model.OtroObjeto;
import main.model.Resta;
import main.model.Suma;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {
    private Suma suma;
    private Resta resta;

    @FXML
    private Button btnSumar;

    @FXML
    private TextField element01;

    @FXML
    private TextField element02;

    @FXML
    private Label element03;

    @FXML
    void btnSumarOnMouseClicked(MouseEvent event) {
        element03.setText(element01.getText() + element02.getText());
    }

    @FXML
    void element01OnReleased(KeyEvent event) {
        suma.setElemento01(Integer.parseInt(element01.getText()));
    }

    @FXML
    void element02OnReleased(KeyEvent event) {
        resta.evento();
    }

    @FXML
    public void initialize(){
        suma = new Suma();
        suma.addObserver(this);

        resta = new Resta();
        resta.addObserver(this);

        Aritmetica aritmetica = new Aritmetica();
        suma.addObserver(aritmetica);

        OtroObjeto oo = new OtroObjeto();
        suma.addObserver(oo);
    }

    @Override
    public void update(Observable o, Object arg) {


        if (o instanceof Resta) {
            OtroObjeto msn = (OtroObjeto) arg;
            System.out.println(msn);
        }
        else
            System.out.println((String)arg);

    }
}
