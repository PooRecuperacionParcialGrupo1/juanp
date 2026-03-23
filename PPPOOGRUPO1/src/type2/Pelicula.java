

/**
 *
 * @author jperesse
 */

package type2;

public class Pelicula extends contenidoMultimedia {
    String director;

    public Pelicula(String titulo, int duracionMinutos, int anioLanzamiento, String director) {
        super(titulo, duracionMinutos, anioLanzamiento);
        this.director = director;
    }

    @Override
    void iniciarReproduccion() {
        System.out.println("Cargando video y ajustando subtítulos para la película...");
    }

    void configurarVisualizacion() {
        System.out.println("Reproduciendo en calidad Automática, idioma original");
    }

    void configurarVisualizacion(String calidad) {
        System.out.println("Reproduciendo en calidad " + calidad);
    }

    void configurarVisualizacion(String calidad, String idiomaSubtitulos) {
        System.out.println("Reproduciendo en calidad " + calidad + " con subtítulos en " + idiomaSubtitulos);
    }
}




