/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * @author jperesse
 */

package type2;

public class AppStreaming {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Interestelar", 169, 2014, "Christopher Nolan");
        Pelicula p2 = new Pelicula("Como entrenar a tu dragon 3", 104, 2019, "Dean DeBlois");
        Podcast pod1 = new Podcast("Podcas Willyrex", 45, 2021, "Daniel Alarcon");
        Podcast pod2 = new Podcast("Podcast de Jordy Wild", 60, 2022, "Madeleine Wattenbarger");
        
        

        contenidoMultimedia[] lista = {p1, p2, pod1, pod2};

        System.out.println("=== Resumen e inicio de reproduccion ===");
        for (contenidoMultimedia c : lista) {
            System.out.println("Resumen: " + c.obtenerResumen());
            c.iniciarReproduccion();
            System.out.println();
        }

        System.out.println("=== Configuracion de visualizacion (Peliculas) ===");
        Pelicula[] pelis = {p1, p2};
        for (Pelicula p : pelis) {
            System.out.println("Pelicula: " + p.getTitulo());
            p.configurarVisualizacion();
            p.configurarVisualizacion("4K");
            p.configurarVisualizacion("1080p", "Espanol");
            System.out.println();
        }
    }
}
