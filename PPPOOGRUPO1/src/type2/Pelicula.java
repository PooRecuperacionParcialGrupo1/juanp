/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * @author jperesse
 */

package type2;

public class Pelicula extends contenidoMultimedia {
    String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Pelicula(String titulo, int duracionMinutos, int anioLanzamiento, String director) {
        super(titulo, duracionMinutos, anioLanzamiento);
        this.director = director;
    }

    @Override
    void iniciarReproduccion() {
        System.out.println("Cargando video y ajustando subtitulos para la pelicula...");
    }

    void configurarVisualizacion() {
        System.out.println("Reproduciendo en calidad Automatica, idioma original");
    }

    void configurarVisualizacion(String calidad) {
        System.out.println("Reproduciendo en calidad " + calidad);
    }

    void configurarVisualizacion(String calidad, String idiomaSubtitulos) {
        System.out.println("Reproduciendo en calidad " + calidad + " con subtitulos en " + idiomaSubtitulos);
    }
}

