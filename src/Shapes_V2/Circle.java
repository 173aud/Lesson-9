package Shapes_V2;
import TurtleGraphics.*;

public class Circle extends AbstractShape{
    
    protected double xpos,ypos, radius;
    
    public Circle(){
        super(0,0);
        radius=1;
    }
    
    public Circle(double x,double y, double r){
        super(x,y);
        radius=r;        
    }
    
    public void draw(Pen p){
        double side=Math.PI*2*radius/120;
        p.up();
        p.move(xpos,ypos);
        p.setDirection(0);
        p.move(radius);
        p.down();
        p.turn(90);
        for (int i = 0; i < 120; i++) {
            p.move(side);
            p.turn(3);
        }
    }

        public void stretchby(double factor){
            radius=radius*factor;
        }
        
        @Override
        public double area() {
        double a=Math.PI*radius*radius;
        return a;
        }

        public String toString(){
        String str="Circle\n=================\n";
        str+=super.toString();
        str+="Radius: "+radius;
        return str;
    }
        public double perimeter(){
            return 2*Math.PI*radius;
        }
        
}

