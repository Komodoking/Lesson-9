/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapev1;

import TurtleGraphics.*;

/**
 *
 * @author ajdy5510
 */
public class Circ implements Shape {
    
protected double radius,xpos,ypos;
public Circ(){
radius=1;
xpos=0;
ypos=0;
}
public Circ(double x,double y,double r){
    xpos=x;
    ypos=y;
     radius=r;
}

    public void draw(Pen p) {
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

 
    public double getxpos() {
        return xpos;
    }

    
    public double getypos() {
        return ypos;
    }

 
    public void stretchby(double factor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void move(double x, double y) {
        xpos=x;
        ypos=y;
        
    }


    public double area() {
       return Math.PI*radius*radius;
    }
    public String toString(){
        String str="Circle\n-------\n";
        str+="Radius "+radius+"\n";
        str+="Xpos"+xpos+"Ypos"+ypos+"\n";
        str+="area "+area();
        
     return str;   
    }
    
}
