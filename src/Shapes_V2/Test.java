package Shapes_V2;

import TurtleGraphics.*;
import BreezySwing.*;
import javax.swing.JOptionPane;

public class Test {

    public static void main(String[] args) {
        AbstractShape x,y,z,t;
        StandardPen p=new StandardPen(new SketchPadWindow(800,600));
        x=new Circle(0,0, 100);
        
        t=new Triangle();
        t.draw(p);
        
        
    
        
        System.out.println("Is x a circle? "+(x instanceof Circle));
        System.out.println("Is x a wheel? "+(x instanceof Wheel));
    }
    
}
