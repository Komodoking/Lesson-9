/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapev1;

import TurtleGraphics.*;
import java.awt.Color;
public class Car {
    private Shape parts[];
    
    public Car(double x,double y){
        parts= new Shape[4];
        parts[0]=new Rect(x,y,200,100);
        parts[1]=new Rect(x+50,y+50,100,50);
        parts[2]=new Circ(x+20,y-120,40);
        parts[3]=new Circ(x+170,y-120,40);
    }
    
    public void move(double x, double y){
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
