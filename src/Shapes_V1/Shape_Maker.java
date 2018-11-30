package Shapes_V1;

import TurtleGraphics.*;
import TurtleGraphics.SketchPadWindow;
import java.awt.Color;


public class Shape_Maker {

    
    public static void main(String[] args) {
       SketchPadWindow window=new SketchPadWindow(800,600);
       Pen p=new StandardPen();
       
       
       
       Shape w=new Wheel(200,200, 50,5);
       w.draw(p);
       w.move(-150, 150);
       p.setColor(Color.green);
       ((Wheel)w).setSpokes(10);
       w.stretchBy(1.5);
       w.draw(p);
    }
    
}
