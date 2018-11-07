
package Shapev2;
import BreezySwing.*;
import TurtleGraphics.Pen;
import TurtleGraphics.StandardPen;

/**
 *
 * @author ajdy5510
 */
public interface Shape {
    public void draw(Pen p);
    public double getxpos();
    public double getypos();
    public void stretchby(double factor);
    public void move(double x,double y);
    public String toString();
    public double area();
}
