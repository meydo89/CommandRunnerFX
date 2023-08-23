package controller;

import builds.PathUpdateTempCommands;
import effects.ReducingEffect;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

import java.awt.*;

public class WindowUpdateTempComntroller {

    @FXML
    private Button botonRestablecerWinUpdate;
    @FXML
    private Button botonEliminarTempUsuario;

    @FXML
    private Button botonEliminarTempSistema;

    @FXML
    private Button botonEliminarTempInternet;

    @FXML
    private Button botonEliminarTempAplicaciones;

    @FXML
    private Button botonEliminarActualizacionesWindows;


    public void pulsarBotonRestablecerWinUpdate(javafx.scene.input.MouseEvent mouseEvent) {
        PathUpdateTempCommands reestablecerWinUpdate = new PathUpdateTempCommands();
        reestablecerWinUpdate.ejecutarComandosReestablecerWindowsUpdate();
    }
    public void pulsarBotonEliminarTempUsuario(MouseEvent mouseEvent) {
        PathUpdateTempCommands eliminarTempUsu = new PathUpdateTempCommands();
        eliminarTempUsu.ejecutarComandosDelTempUsuario();
    }

    public void pulsarBotonEliminarTempSistema(MouseEvent mouseEvent) {
        PathUpdateTempCommands elimininarTempSistema = new PathUpdateTempCommands();
        elimininarTempSistema.ejecutarComandosDelTempSistema();
    }

    public void pulsarBotonEliminarTempInternet(MouseEvent mouseEvent) {
        PathUpdateTempCommands eliminarTempInternet = new PathUpdateTempCommands();
        eliminarTempInternet.ejecutarComandosDelTempInternet();
    }

    public void pulsarBotonEliminarTempAplicaciones(MouseEvent mouseEvent) {
    PathUpdateTempCommands eliminarTempAplicaciones = new PathUpdateTempCommands();
    eliminarTempAplicaciones.ejecutarComandosDelTempAplicaciones();
    }

    public void pulsarBotonEliminarDescargasActualizaciones(MouseEvent mouseEvent) {
        PathUpdateTempCommands eliminarDescargasUpdate = new PathUpdateTempCommands();
        eliminarDescargasUpdate.ejecutarComandosDelDescargasActualizaciones();
    }

    public void initialize(){
     ReducingEffect.addReducingEffect(botonRestablecerWinUpdate);
     ReducingEffect.addReducingEffect(botonEliminarTempUsuario);
     ReducingEffect.addReducingEffect(botonEliminarTempSistema);
     ReducingEffect.addReducingEffect(botonEliminarTempInternet);
     ReducingEffect.addReducingEffect(botonEliminarTempAplicaciones);
     ReducingEffect.addReducingEffect(botonEliminarActualizacionesWindows);
    }
}
