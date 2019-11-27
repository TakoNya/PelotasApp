package pelotasapp;

import java.awt.geom.*;
import java.awt.Color;

public class Pelota {
    private static final int MAXIMO_X = 10;
    private static final int MAXIMO_Y= 30;
    private double x = 0;
    private double y = 0;
    private double dx = 2;
    private double dy = 2;
    private Color color;
    
    public void SetColor (Color color){
            this.color = color;
    }
    public Color getColor(){
        return color;
    }
    public void moverse(Rectangle2D rectangulo){
        x += dx;
        y += dy;
        if(x< rectangulo.getMinX()){
            x = rectangulo.getMinX();
            dx = -dx;
        }
        if (x + MAXIMO_X >= rectangulo.getMaxX()){
            x = rectangulo.getMaxX() - MAXIMO_X;
            dx = -dx;
        }
        if (y < rectangulo.getMinY()){
        y = rectangulo.getMinY();
        dy=-dy;
    }
        if(y + MAXIMO_Y >= rectangulo.getMaxY()){
            y = rectangulo.getMaxY() - MAXIMO_Y;
            dy = -dy;
        }
    }
    public Ellipse2D getShape(){
        return new Ellipse2D.Double(x,y,MAXIMO_X,MAXIMO_Y);
    }
    
}
