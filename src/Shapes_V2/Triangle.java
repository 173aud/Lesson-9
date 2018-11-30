package Shapes_V2;
import TurtleGraphics.*;

public class Triangle extends AbstractShape{
    
    private double x1,y1, x2,y2;
    
    public Triangle(){
        xpos=0;
        ypos=0;
    
        x1=50;
        y1=50;
        
        x2=100;
        y2=100;
    }
    
    public Triangle(double x,double y, double xone,double yone, double xtwo,double ytwo){
        xpos=x;
        ypos=y;
    
        x1=xone;
        y1=yone;
        
        x2=xtwo;
        y2=ytwo;
    
    }
      
    public void draw(Pen p){
        p.up();
        p.move(xpos,ypos);
        p.down();
        p.move(x1,y1);
        p.move(x2,y2);
    }
    
    public double area(){
        return Math.abs((xpos*y1-x1*ypos) + (x1*y2-x2*y1) + (x2*ypos-xpos*y2)) / 2;
    }
    
    public String toString(){
        String str="Triangle\n==========\n";
        str+=super.toString();
        return str;
    }    
    
    public void stretchby(double factor){
        x1=(x1-xpos) * factor + xpos;
        x2=(x2-xpos) * factor + xpos;
        y1=(y1-ypos) * factor + ypos;
        y2=(y2-ypos) * factor + ypos;
    }        
    
    public double perimeter(){        
       return (Math.sqrt((xpos-x1)*(xpos-x1) + (ypos-y1) * (ypos-y1))+Math.sqrt((x1-x2)*(x1-x2) + (y1-y2) * (y1-y2))+Math.sqrt((x2-xpos)*(x2-xpos) + (y2-ypos) * (y2-ypos)));
    }
    
    public void move(double x, double y){
        xpos=x;
        ypos=y;
        x1+=x-xpos;
        y1+=y-ypos;
        x2+=x-xpos;
        y2+=y-ypos;
        super.move(x,y);
    }
    
}
