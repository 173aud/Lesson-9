package Shapes_V2;

import TurtleGraphics.*;

/*Subclass/Extended Class/Child Class...*/
public class Wheel extends Circle{
    
    private int spokes; //Wheel already inherits three props from the Circle class
    
    public Wheel(){
        //Call the Parent Constructor (Circle)
        super();
        spokes=0;
        
    }
    
    public Wheel(double x,double y, double r, int s){
        //Call the Parent and send x,y, and r
        super(x,y, r);
        spokes=s;
    }
    
    /*
    The following methods are already in the Parent Class; no code needed!
    getXPos(); getYPos(); area(); stretchby();
    */
    
    public void draw(Pen p){
        
        //Call the draw method from the Parent Class
        super.draw(p);
        //Draw the spokes (modification from the Parent Class)
        p.up();
        p.move(xpos,ypos);
        double turn=360/spokes;
        for (int i=0; i<=spokes; i++) {
            p.setDirection(i*turn);
            p.move(radius);
            p.up();
            p.move(xpos,ypos);
        }
    }
    
    //This method is exclusive to the Wheel Class. 
    public void setSpokes(int s){
        spokes=s;
    }
    
    @Override
    public String toString(){
        String str="Wheel\n==========\n";
        str+="X: "+xpos+" Y: "+ypos;
        str+="\nArea: "+area();
        str+="\nSpokes: "+spokes;
        str+="\nRadius: "+radius;
        return str;
    }
    
}
