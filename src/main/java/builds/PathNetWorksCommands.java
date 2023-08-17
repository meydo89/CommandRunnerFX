package builds;

import controller.WindowSystemController;

import java.awt.*;
import java.io.*;

public class PathNetWorksCommands extends Paths {

    public PathNetWorksCommands() {

        super();
    }

    public void ejecutarComandoPing() {
        try {
            String rutaPath = "/scripstsNetworks/realizarPing.bat";
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

    public void ejecutarComandoTracert() {
        try {
            String rutaPath = "/scripstsNetworks/realizarTracert.bat";
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
    public void ejecutarComandoVerMiConfiRed() {
        try {
            String rutaPath = "/scripstsNetworks/verMiConfiguracionRed.bat";
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
    public void ejecutarComandoNslookup() {
        try {
            String rutaPath = "/scripstsNetworks/realizarNslookup.bat";
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
    public void ejecutarComandoNetstat() {
        try {
            String rutaPath = "/scripstsNetworks/realizarNetstat.bat";
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
    public void ejecutarComandoReestablecerAdaptadorRed() {
        try {
            String rutaPath = "/scripstsNetworks/reesatblecerAdaptadorRed.bat";
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


