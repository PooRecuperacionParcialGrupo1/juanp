package type2;

public class AppStreaming {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("El Padrino", 175, 1972, "Francis Ford Coppola");
        Pelicula p2 = new Pelicula("Origen", 148, 2010, "Christopher Nolan");
        Podcast pod1 = new Podcast("Radio Ambulante", 45, 2021, "Daniel Alarcón");
        Podcast pod2 = new Podcast("El Hilo", 60, 2022, "Madeleine Wattenbarger");

        contenidoMultimedia[] lista = {p1, p2, pod1, pod2};

        System.out.println("=== Resumen e inicio de reproducción ===");
        for (contenidoMultimedia c : lista) {
            System.out.println("Resumen: " + c.obtenerResumen());
            c.iniciarReproduccion();
            System.out.println();
        }

        System.out.println("=== Configuración de visualización (Peliculas) ===");
        Pelicula[] pelis = {p1, p2};
        for (Pelicula p : pelis) {
            System.out.println("Película: " + p.titulo);
            p.configurarVisualizacion();
            p.configurarVisualizacion("4K");
            p.configurarVisualizacion("1080p", "Español");
            System.out.println();
        }
    }
}