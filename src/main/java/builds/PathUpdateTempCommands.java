package builds;

import controller.WindowSystemController;

import java.awt.*;
import java.io.*;

public class PathUpdateTempCommands extends Paths{

    public PathUpdateTempCommands() {

        super();
    }
    public void ejecutarComandosReestablecerWindowsUpdate() {
        try {
            String rutaPath = "/scriptsUpdateAndDelTemp/reparaWindowsUpdate.bat";
            InputStream inputStream = WindowSystemController.class.getResourceAsStream(rutaPath);
            if (inputStream == null) {
                throw new FileNotFoundException("No se encontró el archivo " + rutaPath);
            }
            File tempFile = File.createTempFile("tempBatFile", ".bat");

            try (OutputStream outputStream = new FileOutputStream(tempFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }
            Desktop.getDesktop().open(tempFile);
            tempFile.deleteOnExit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ejecutarComandosDelTempUsuario() {
        try {
            String rutaPath = "/scriptsUpdateAndDelTemp/eliminarTempUsuario.bat";
            InputStream inputStream = WindowSystemController.class.getResourceAsStream(rutaPath);
            if (inputStream == null) {
                throw new FileNotFoundException("No se encontró el archivo " + rutaPath);
            }
            File tempFile = File.createTempFile("tempBatFile", ".bat");

            try (OutputStream outputStream = new FileOutputStream(tempFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }
            Desktop.getDesktop().open(tempFile);
            tempFile.deleteOnExit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ejecutarComandosDelTempSistema() {
        try {
            String rutaPath = "/scriptsUpdateAndDelTemp/eliminarTempSistema.bat";
            InputStream inputStream = WindowSystemController.class.getResourceAsStream(rutaPath);
            if (inputStream == null) {
                throw new FileNotFoundException("No se encontró el archivo " + rutaPath);
            }
            File tempFile = File.createTempFile("tempBatFile", ".bat");

            try (OutputStream outputStream = new FileOutputStream(tempFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }
            Desktop.getDesktop().open(tempFile);
            tempFile.deleteOnExit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ejecutarComandosDelTempInternet() {
        try {
            String rutaPath = "/scriptsUpdateAndDelTemp/eliminarTempInternet.bat";
            InputStream inputStream = WindowSystemController.class.getResourceAsStream(rutaPath);
            if (inputStream == null) {
                throw new FileNotFoundException("No se encontró el archivo " + rutaPath);
            }
            File tempFile = File.createTempFile("tempBatFile", ".bat");

            try (OutputStream outputStream = new FileOutputStream(tempFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }
            Desktop.getDesktop().open(tempFile);
            tempFile.deleteOnExit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ejecutarComandosDelTempAplicaciones() {
        try {
            String rutaPath = "/scriptsUpdateAndDelTemp/eliminarTempAplicaciones.bat";
            InputStream inputStream = WindowSystemController.class.getResourceAsStream(rutaPath);
            if (inputStream == null) {
                throw new FileNotFoundException("No se encontró el archivo " + rutaPath);
            }
            File tempFile = File.createTempFile("tempBatFile", ".bat");

            try (OutputStream outputStream = new FileOutputStream(tempFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }
            Desktop.getDesktop().open(tempFile);
            tempFile.deleteOnExit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void ejecutarComandosDelDescargasActualizaciones() {
        try {
            String rutaPath = "/scriptsUpdateAndDelTemp/eliminarDescargasActualizaciones.bat";
            InputStream inputStream = WindowSystemController.class.getResourceAsStream(rutaPath);
            if (inputStream == null) {
                throw new FileNotFoundException("No se encontró el archivo " + rutaPath);
            }
            File tempFile = File.createTempFile("tempBatFile", ".bat");

            try (OutputStream outputStream = new FileOutputStream(tempFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }
            Desktop.getDesktop().open(tempFile);
            tempFile.deleteOnExit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
