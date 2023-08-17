package builds;

public class Paths {
    String rutaPath;

    public Paths() {

    }

    public String getRutaPath() {

        return rutaPath;
    }

    public void setRutaPath(String rutaPath) {

        this.rutaPath = rutaPath;
    }

    @Override
    public String toString() {
        return "Paths{" +
                "rutaPath='" + rutaPath + '\'' +
                '}';
    }
}
