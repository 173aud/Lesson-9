package Shapes_V1;
import TurtleGraphics.*;

public class Car {
    
    private Shape parts[]=new Shape[4];
    
    public Car(double x,double y){
        //Body
        parts[0]=new Square(x,y, 400,200);
        //Window
        parts[1]=new Square(x+100,y+100, 100,50);
        //Tires
        parts[2]=new Circle(x+20,y-100,40);
        parts[3]=new Circle(x+120,y-100, 40);
    }
    
    public void move(double x,double y){
        for(Shape s:parts){
            s.move(x, y);
        }
        
    }
    
    public void draw(Pen p){
        for (int i = 0; i < 4; i++) {
            parts[i].draw(p);
        }
    }
    
    
    
    
}
