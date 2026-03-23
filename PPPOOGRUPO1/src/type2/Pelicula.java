

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
}