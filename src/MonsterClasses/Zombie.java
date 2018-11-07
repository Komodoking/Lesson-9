/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MonsterClasses;

/**
 *
 * @author ajdy5510
 */
public class Zombie extends Monster {
    
    public Zombie(String nm) {
        super(nm);
        monstercount++;
    }

    @Override
    void attack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void identify(){
        super.identify();
        System.out.println("Zombie ");
    }
    @Override
     public void attack(){
         
        System.out.println(" I am sucking ur blood ");
    }
}
