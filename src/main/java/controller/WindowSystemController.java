package controller;

import builds.PathSystemCommands;
import effects.ReducingEffect;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class WindowSystemController {

    @FXML
    private Button botonEstadoFicherosWin;

    @FXML
    private Button botonRepararFicherosWin;

    @FXML
    private Button botonComprobarImgWin;

    @FXML
    private Button botonRepararImgWin;

    @FXML
    private Button botonRepararEstructuraWin;

    @FXML
    private Button botonInformacionSistema;


    @FXML
    private void pulsarBotonComprobarFicherosWin(MouseEvent event) {
        PathSystemCommands comprobarFicherosWin = new PathSystemCommands();
        comprobarFicherosWin.ejecutarComandosComprobarSistemaFicherosWin();
    }

    @FXML
    private void pulsarBotonRepararrFicherosWin(MouseEvent mouseEvent) {
        PathSystemCommands repararFicherosWin = new PathSystemCommands();
        repararFicherosWin.ejecutarComandosRepararFicherosWin();
    }

    @FXML
    private void initialize() {
       ReducingEffect.addReducingEffect(botonEstadoFicherosWin);
       ReducingEffect.addReducingEffect(botonRepararFicherosWin);
       ReducingEffect.addReducingEffect(botonRepararFicherosWin);
       ReducingEffect.addReducingEffect(botonComprobarImgWin);
       ReducingEffect.addReducingEffect(botonRepararImgWin);
       ReducingEffect.addReducingEffect(botonRepararEstructuraWin);
       ReducingEffect.addReducingEffect(botonInformacionSistema);
    }

    @FXML
    void pulsarBotonComprobarImgWin(MouseEvent event) {
        PathSystemCommands comprobarImgWin = new PathSystemCommands();
        comprobarImgWin.ejecutarComandosComprobarImgWin();

    }

    @FXML
    void pulsarBotonRepararImgWin(MouseEvent event) {
        PathSystemCommands repararImgWin = new PathSystemCommands();
        repararImgWin.ejecutarComandosRepararImgWin();

    }

    @FXML
    void pulsarBotonRepararDiscoWin(MouseEvent event) {
        PathSystemCommands reparaDisco = new PathSystemCommands();
        reparaDisco.ejecutarComandosRepararDiscoWin();

    }
    public void pulsarBotonInformacionSistema(MouseEvent mouseEvent) {
        PathSystemCommands informacionSistema = new PathSystemCommands();
        informacionSistema.ejecutarComandosInformacionSistema();
    }
}
