/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
 *
 * @author jperesse
 */

package type2;

public class Podcast extends contenidoMultimedia {
    String anfitrion;

    public Podcast(String titulo, int duracionMinutos, int anioLanzamiento, String anfitrion) {
        super(titulo, duracionMinutos, anioLanzamiento);
        this.anfitrion = anfitrion;
    }

    @Override
    void iniciarReproduccion() {
        System.out.println("Conectando al servidor de audio y preparando el episodio del podcast...");
    }
}