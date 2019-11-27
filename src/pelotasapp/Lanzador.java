package pelotasapp;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lanzador extends Thread{
    private Pelota pelota;
    private Tablero tablero;
    public Lanzador(Pelota pelota, Tablero tablero){
        this.pelota = pelota;
        this.tablero = tablero;
    }
    public void run() {
        for (int i = 1; i <= 3000; i++){
            try{
                if (i ==3000){
                    pelota.SetColor(Color.ORANGE);
                    
                }
                pelota.moverse(tablero.getBounds());
                tablero.paint(tablero.getGraphics());
            }catch (Exception e){
        }
            try{
                Thread.sleep(10);
            }catch(InterruptedException ex){
                Logger.getLogger(Pelota.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
            
    }
}
