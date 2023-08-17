package builds;

import controller.WindowSystemController;

import java.awt.*;
import java.io.*;

public class PathSystemCommands extends Paths {

    public PathSystemCommands() {

        super();
    }

    public void ejecutarComandosComprobarSistemaFicherosWin() {
        try {
            String rutaPath = "/scriptsSystem/comprobarFicherosWin.bat";
            // Obtener la referencia al archivo .bat dentro del JAR
            InputStream inputStream = WindowSystemController.class.getResourceAsStream(rutaPath);
            if (inputStream == null) {
                throw new FileNotFoundException("No se encontró el archivo " + rutaPath);
            }

            // Crear un archivo temporal para copiar el contenido del archivo .bat
            File tempFile = File.createTempFile("tempBatFile", ".bat");

            // Copiar el contenido del archivo .bat al archivo temporal
            try (OutputStream outputStream = new FileOutputStream(tempFile)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }
            // Abrir el archivo .bat utilizando el archivo temporal
            Desktop.getDesktop().open(tempFile);
            //Borra el archivo temporal al cerrar la aplicacion
            tempFile.deleteOnExit();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ejecutarComandosRepararFicherosWin() {
        try {
            String rutaPath = "/scriptsSystem/repararFicherosWin.bat";
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
    public void ejecutarComandosComprobarImgWin() {
        try {
            String rutaPath = "/scriptsSystem/comprobarImagenWin.bat";
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
    public void ejecutarComandosRepararImgWin() {
        try {
            String rutaPath = "/scriptsSystem/repararImagenWin.bat";
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
    public void ejecutarComandosRepararDiscoWin() {
        try {
            String rutaPath = "/scriptsSystem/repararDiscoWin.bat";
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
    public void ejecutarComandosInformacionSistema() {
        try {
            String rutaPath = "/scriptsSystem/informacionSistema.bat";
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

