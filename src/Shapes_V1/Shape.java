package Shapes_V1;
import TurtleGraphics.*;
import BreezySwing.*;
public interface Shape {
    public void draw(Pen p);
    public double getXPos();
    public double getYPos();
    public void stretchBy(double factor);
    public void move(double x,double y);
    public String toString();
    public double area();
}
