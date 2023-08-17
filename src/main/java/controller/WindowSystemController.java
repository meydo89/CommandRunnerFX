package controller;

import builds.PathSystemCommands;
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
        addReducingEffect(botonEstadoFicherosWin);
        addReducingEffect(botonRepararFicherosWin);
        addReducingEffect(botonRepararFicherosWin);
        addReducingEffect(botonComprobarImgWin);
        addReducingEffect(botonRepararImgWin);
        addReducingEffect(botonRepararEstructuraWin);
        addReducingEffect(botonInformacionSistema);
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

    private void addReducingEffect(Button button) {


        ScaleTransition scaleDownTransition = new ScaleTransition(Duration.millis(200), button);
        scaleDownTransition.setToX(0.8);
        scaleDownTransition.setToY(0.8);

        ScaleTransition scaleUpTransition = new ScaleTransition(Duration.millis(200), button);
        scaleUpTransition.setToX(1.0);
        scaleUpTransition.setToY(1.0);

        button.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            scaleDownTransition.playFromStart();
            event.consume();
        });

        button.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            scaleDownTransition.stop();
            scaleUpTransition.playFromStart();
            event.consume();
        });
    }


}
