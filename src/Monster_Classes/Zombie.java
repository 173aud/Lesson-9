/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Monster_Classes;

/**
 *
 * @author feli8871
 */
public class Zombie extends Monster{
    
    public Zombie(String nm){
            super(nm);
    }
    
    @Override
    public void attack(){
    System.out.println("Slam: Melee Weapon Attack: +3 to hit, reach 5 ft., one target. Hit: 4 (1d6 + 1) bludgeoning damage.");
    }
    
    @Override        
    public void identify(){
        super.identify();
        System.out.print("undead scourge drawn here by the necrotic energies of this domain.");
    }
    
    public void frighten(){
        System.out.println("Make a wisdom saving through, DC 12, or be frightened until the end of your next turn.");
    }
    
}
