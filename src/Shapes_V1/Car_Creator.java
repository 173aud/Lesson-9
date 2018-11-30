package Shapes_V1;
import TurtleGraphics.*;
import TerminalIO.*;
import java.awt.Color;
public class Car_Creator {

    
    public static void main(String[] args) {
        KeyboardReader k=new KeyboardReader(); SketchPadWindow window=new SketchPadWindow(800,600);
        Pen p=new StandardPen();
        
        Car c=new Car(-200,0);
        c.draw(p);
    
        while(true){
            double x=k.readDouble("(Enter -999 to quit) x: ");
            if(x==-999)break;
            double y=k.readDouble("(Enter -999 to quit) y:");
            p.setColor(Color.white);
            c.draw(p);
            p.setColor(Color.blue);
            c.move(x,y);
            c.draw(p);
        }
        
        
    }
    
}
