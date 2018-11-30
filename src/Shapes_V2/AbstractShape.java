package Shapes_V2;

import TurtleGraphics.*;

abstract public class AbstractShape {

    protected double xpos,ypos;
    protected Pen p=new StandardPen();
    public AbstractShape(){
        xpos=0; 
        ypos=0;
    }

    public AbstractShape(double x,double y){
        xpos=x;
        ypos=y;
    }

    public abstract void draw(Pen p);
    public abstract double area();
    public abstract void stretchby(double factor);
    public abstract double perimeter();
    
    final public double getXPos(){
        return xpos;
    }
    
    final public double getYPos(){
        return ypos;
    }
    
    public void move(double x,double y){
            xpos=x;
            ypos=y;
            draw(p);
    }
    
    public String toString(){
        String str="";
        str+="X: "+xpos+", Y:"+ypos+"\n";
        str+="Area: "+area();
        str+="Perimeter: "+perimeter();
        return str;
    }

    






}
