package pelotasapp;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;
import java.awt.Color;

public class Tablero extends JPanel{
    private ArrayList<Pelota> pelotas= new ArrayList<Pelota>();
    public Tablero(){
        this.setSize(400,230);
        this.setBackground(Color.ORANGE);
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        for(Pelota pelota : pelotas){
            g2.setColor(pelota.getColor());
            g2.fill(pelota.getShape());
        }
    }
    public void lanzarPelota(){
        Pelota pelota = new Pelota();
        pelota.SetColor(randomColor());
        pelotas.add(pelota);
        System.out.println("Lanzando pelota "+ pelotas.size());
        Lanzador thread = new Lanzador(pelota, this);
        thread.start();
    }
    private Color randomColor(){
        Random rand=new Random();
        float r = rand.nextFloat();
        float g = rand.nextFloat()/2f;
        float b = rand.nextFloat();
        return new Color(r,g,b);
    }
}
