/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapev1;

import TurtleGraphics.*;
import BreezySwing.*;
import java.awt.Color;

/**
 *
 * @author ajdy5510
 */
public class Shapemaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SketchPadWindow window= new SketchPadWindow(800,600);
    Pen p= new StandardPen(window);
    Rect x=new Rect(100,50,200,75);
    x.draw((StandardPen) p);
    Shape y= new Rect(-200,-100,50,200);
    p.setColor(Color.yellow);
    y.draw(p);
        System.out.println(x);
        System.out.println(y);
        y.stretchby(2);
        p.setColor(Color.yellow);
        y.draw(p);
    
        Wheel w= new Wheel(200,200,50,5);
        w.draw(p);
        p.setColor(Color.green);
        w.move(-150,150);
        w.setSpokes(10);
        w.stretchby(100);
        w.draw(p);
        
    }
    
}
