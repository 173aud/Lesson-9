package Shapes_V2;
import TurtleGraphics.*;
import TerminalIO.*;
import hsa.*;
import java.awt.Color;
/**
 *
 * @author feli8871
 */
public class Square extends AbstractShape{
    
    private double xpos,ypos, width,height;
    
    public Square(){
        super(0,0);
        width=1;
        height=1;
    }
    
    public Square(double x, double y, double w, double h){
        super(x,y);
        width=w;
        height=h;
    }

    public void draw(Pen p){
        p.up();
        p.move(xpos,ypos);
        p.down();
        p.setDirection(0);
        p.move(height);
        p.setDirection(270);
        p.move(width);
        p.setDirection(90);
        p.move(height);
    }
    
    
    public void stretchby(double factor){
        width*=factor;
        height*=factor;
    }
    
    
    
    @Override
    public double area(){
        return height*width;
    }

    public String toString(){
        String str="Rectangle\n=================\n";
        str+=super.toString();
        return str;
    }
    
    public void stretchBy(double factor) {
        height*=factor;
        width*=factor;
    }
    
    public double perimeter(){
       return width*2+height*2;
    }


}
