package Shapes_V1;
import TurtleGraphics.*;

public class Circle implements Shape{
    
    protected double xpos,ypos, radius;
    
    public Circle(){
        xpos=0;
        ypos=0;
        radius=1;
    }
    
    public Circle(double x,double y, double r){
        xpos=x;
        ypos=y;
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
        @Override
        public double getXPos(){
            return xpos;
        }
        
        @Override
        public double getYPos(){
            return ypos;
        }
        @Override
        public void stretchBy(double factor){
            radius=radius*factor;
        }

        @Override
        public void move(double x,double y){
            xpos=x;
            ypos=y;
        }


        @Override
        public double area() {
        double a=Math.PI*radius*radius;
        return a;
        }

}

