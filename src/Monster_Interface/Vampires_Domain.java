
package Monster_Interface;


public class Vampires_Domain {

    
    public static void main(String[] args) {
        Monster v=new Vampire("Silas Briarwood");
        Monster z=new Zombie("Delilah Briarwood");
        v=new Zombie("Delilah Briarwood");
        Monster m[]=new Monster[4];
        m[0]=new Zombie("Delilah Briarwood");
        m[1]=new Zombie("Long Forgotten");
        m[2]=new Vampire("Silas Briarwood");
        m[3]=new Vampire("Strahd von Zarovich");
        
        for (int i = 0; i < 4; i++) {
            
            m[i].identify();
            m[i].attack();
            if(i<2){
                //Zombie Power
                ((Zombie)m[i]).frighten();
            }   
            else{
                //Vampire Strength
                ((Vampire)m[i]).Shapechange();
            }
            
        }
        
        for(Monster x:m){
            x.identify();
            x.attack();
            if(x instanceof Vampire){
                ((Vampire)x).Shapechange();
            }
            else{
                ((Zombie)x).frighten();
            }
        }
    }
    
}
