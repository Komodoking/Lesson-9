/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapev1;
import TurtleGraphics.*;

public class Wheel extends Circ{
    private int spokes;
    public Wheel(){
        //call parent constructor
        super();
        spokes=3;
    }
    public Wheel(double x,double y,double r,int s){
    //call parent and send up x, y and r
    super(x,y,r);
    spokes=s;
    }
    public void draw(){
super.draw(p);
p.up();
p.move(xpos,ypos);
double turn= 360/spokes;
        for (int i = 0; i <=spokes; i++) {
            p.down;
            p.setDirection(i*turn);
            p.move(radius);
            p.up();
            p.move(xpos,ypos);
            
        }
        //exclusive method
public void setSpokes(int s){
    
}
        
}
    public String toString(){
    String str="Wheel\n======\n";
    str+="xpos "+xpos+" ypos "+ypos;
    str+="\nradius "+radius;
    str+="\nArea "+area();
    str+="\nSpokes: "+spokes;
    
    return str;
    }
    
}
