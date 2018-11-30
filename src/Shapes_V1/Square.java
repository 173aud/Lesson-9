
package Shapes_V1;
import TurtleGraphics.*;
import TerminalIO.*;
import hsa.*;
import java.awt.Color;
/**
 *
 * @author feli8871
 */
public class Square implements Shape{
    
    private double xpos,ypos, width,height;
    
    public Square(){
        xpos=0;
        ypos=0;
        width=1;
        height=1;
    }
    
    public Square(double x, double y, double w, double h){
        xpos=x;
        ypos=y;
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
    
    @Override
    public double getXPos(){
        return xpos;
    }
    
    @Override
    public double getYPos(){
        return ypos;
    }
    
    public void stretchby(double factor){
        width*=factor;
        height*=factor;
    }
    
    @Override
    public void move(double x,double y){
        xpos=x;
        ypos=y;
    }
    
    @Override
    public double area(){
        return height*width;
    }

    public String toString(){
        String str="Rectangle\n=================\n";
        str+="X: "+xpos+", Y:"+ypos+"\n";
        str+="Area: "+area();
        return str;
    }

   @Override
    public void stretchBy(double factor) {
        height*=factor;
        width*=factor;
    }
    


}
