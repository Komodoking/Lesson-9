/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employeev2;

/**
 *
 * @author ajdy5510
 */
public class PartTime extends Employee {
    public PartTime(){
        super();
        
    }
    public double getPay(){
          double pay=(rate*hours);
          totalpay+=pay;
          return pay;
    }
}
