/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonsterInterface;


public class Vampire implements Monster {
private String name;
  public Vampire(String n){
      name=n;
  }
    public void attack() {
        System.out.println("Vampire attacks");
    }

   
    public void identify() {
        System.out.println("I am "+ name + "the vampire");
        
    }
    public void transform(){
        System.out.println("Vampire is now a bat");   
    }
}
