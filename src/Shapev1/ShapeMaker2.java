/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shapev1;

/**
 *
 * @author ajdy5510
 */
public class ShapeMaker2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StandardPen p= new StandardPen(new SkethcPadWindow(600,400));
        Shape x= new Shapev1.Rect(0,0,200,50);
        Circ y= new Wheel(50,50,50,7);
        
        
    }
    public static Shape anyShape(Shape t,String type){
        double x=t.getxpos();
        double y= t.getypos();
        double area= t.area();
        if(type.equals("c")){
            //work backwards to get radiues
           double rad=Math.sqrt(area/Math.PI);
           return new Circ(x,y,rad);
           
        }
        else if(type.equals("w")){
             double rad=Math.sqrt(area/Math.PI);
           return new Wheel(x,y,rad,6);
        }
        else if(type.equals("r")){
            double w= Math.sqrt(area);
            double h= Math.sqrt(area);
            return new Rect(x,y,w,h);
        }
    }
    
}
