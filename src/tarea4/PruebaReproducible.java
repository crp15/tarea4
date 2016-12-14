/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

/**
 *
 * @author Clariza
 */
public class PruebaReproducible {
     public void procesarReproducible(Reproducible reproducible) {
        reproducible.ejecutar();
        reproducible.avanzar();
        reproducible.rebobinar();
        reproducible.detener();
        reproducible.grabar();
        reproducible.detener();
    }

    public static void main(String[] args) {
        Audio audio = new Audio();
        Video video = new Video();
        
        PruebaReproducible p = new PruebaReproducible();
        
        System.out.println("PROBANDO AUDIO");
        System.out.println("*************************************************");
        p.procesarReproducible(audio);
        
        System.out.println("\n\nPROBANDO VIDEO");
        System.out.println("*************************************************");
        p.procesarReproducible(video);
    }

    private void procesarReproducible(Audio audio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void procesarReproducible(Video video) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
