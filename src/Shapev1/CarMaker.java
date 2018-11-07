/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapev1;

import TerminalIO.KeyboardReader;
import TurtleGraphics.Pen;
import TurtleGraphics.SketchPadWindow;
import TurtleGraphics.StandardPen;
import java.awt.Color;

public class CarMaker {

    public static void main(String[] args) {

        SketchPadWindow window = new SketchPadWindow(800, 600);
        KeyboardReader k = new KeyboardReader();
        Pen p = new StandardPen(window);
        Car x = new Car(-200, 200);
        x.draw(p);
        while (true) {
            double xp = k.readDouble("Enter a new x or -999 to quit ");
            if (xp == -999) {
                break;
            }
            double yp = k.readDouble("Enter a new y or -999 to quit ");
            p.setColor(Color.white);
            x.draw(p);
            p.setColor(Color.blue);
            x.move(xp, yp);

        }
    }
    

}
