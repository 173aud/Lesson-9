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
public class Vampire extends Monster{
    
    public Vampire(String nm){
        super(nm);
    }
    
    @Override
    public void attack(){
        System.out.println("Multiattack (Vampire Form Only): The vampire makes two attacks, only one of which can be a bite Attack.\n" +
"\n" +
"Unarmed Strike (Vampire Form Only): Melee Weapon Attack: +9 to hit, reach 5 ft., one creature. Hit: 8 (1d8 + 4) bludgeoning damage. Instead of dealing damage, the vampire can grapple the target (escape DC 18).\n" +
"\n" +
"Bite (Bat or Vampire Form Only): Melee Weapon Attack: +9 to hit, reach 5 ft., one willing creature, or a creature that is Grappled by the vampire, Incapacitated, or Restrained. Hit: 7 (1d6 + 4) piercing damage plus 10 (3d6) necrotic damage. The target's hit point maximum is reduced by an amount equal to the necrotic damage taken, and the vampire regains Hit Points equal to that amount. The reduction lasts until the target finishes a Long Rest. The target dies if this effect reduces its hit point maximum to 0. A humanoid slain in this way and then buried in the ground rises the following night as a Vampire Spawn under the vampire's control.");    
    }
    
    @Override
    public void identify(){
       super.identify();
        System.out.print("the ruler of this domain.");
    }
    
    public void Shapechange(){
        System.out.println("Shapechanger: If the vampire isn't in sun light or running water, it can use its action to Polymorph into a Tiny bat or a Medium cloud of mist, or back into its true form.\n" +
"While in bat form, the vampire can't speak, its walking speed is 5 feet, and it has a flying speed of 30 feet. Its Statistics, other than its size and speed, are unchanged. Anything it is wearing transforms with it, but nothing it is carrying does. It reverts to its true form if it dies.\n" +
"While in mist form, the vampire can't take any actions, speak, or manipulate Objects. It is weightless, has a flying speed of 20 feet, can hover, and can enter a hostile creature's space and stop there. In addition, if air can pass through a space, the mist can do so without squeezing, and it can't pass through water. It has advantage on Strength, Dexterity, and Constitution Saving Throws, and it is immune to all nonmagical damage, except the damage it takes from sunlight.");
    }
    
}
