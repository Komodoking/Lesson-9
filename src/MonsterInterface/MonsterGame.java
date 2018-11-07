/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonsterInterface;

/**
 *
 * @author ajdy5510
 */
public class MonsterGame {

    public static void main(String[] args) {
        Vampire v= new Vampire("e");
        Monster z= new Zombire("a");
        Monster m[]= new Monster[4];
        m[0]=new Zombire("q");
        m[1]=new Zombire("w");
        m[2]= new Vampire("v");
        m[3]=new Vampire("c");
        for (int i = 0; i < 4; i++) {
            m[i].identify();
            m[i].attack();
            if(i<2){
                //Zombire
                
            }
            else{
              
                 //Vampi
            }
               
        }
            
       
     
    }
    
}
