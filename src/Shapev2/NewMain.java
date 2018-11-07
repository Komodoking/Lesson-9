/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapev2;

import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;

/**
 *
 * @author ajdy5510
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractShape x, y, z;
        x = new Circ();
        y = new Rect();
        z = new Wheel(0,0,50,5);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        Pen p = new StandardPen();
        z.draw(p);
        
    }
    
}
