package class3;

import class3.person.Student.Staff;
import class3.CMP202;

public class start {
    public static void main (String [] args){

        CMP202 CMP202 = new CMP202();
        CMP202.printUserDetails();

        person person = new person();

        person Student = new Student("Bingham", "Treasure", "654321", "BHU/22/04/09/0029");
        
        person Staff = new Staff("Bingham", "abu", "246810", 223);



        
        physic physic = new physic();
        //Calling the physics method
        System.out.println( physic.calculateVelocity1(3.0404, 3.33245354, 60));
        System.out.println(physic.calculateVelocity(3.0404,60));

        
        
        // calling the person instance and methods


        //person person = new person();
        //person.name = "John";
        //System.out.println(person.getName());
        
        //Person person = new Person();
        //person.setName("David smith");
        //System.out.println(person.getName());

        //person.setPass("Treasure");
        //System.out.println(person.getPass());



        //person.password = "Password";
    
    }
}
