package type2;

public abstract class contenidoMultimedia {
    String titulo;
    int duracionMinutos;
    int anioLanzamiento;

    public contenidoMultimedia(String titulo, int duracionMinutos, int anioLanzamiento) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.anioLanzamiento = anioLanzamiento;
    }

    abstract void iniciarReproduccion();

    String obtenerResumen() {
        return titulo + " (" + anioLanzamiento + ")";
    }
}
