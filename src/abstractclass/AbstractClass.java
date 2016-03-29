/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;

/**
 *
 * @author aniruddha
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Animal animal = new Animal();
        
        animal.run();
        
        animal.eat();
        
        animal.walk();*/
        
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.walk();
        
        Monkey monkey = new Monkey();
        monkey.eat();
        monkey.walk();
        
        Animal animal = new Tiger();
        animal.eat();
        animal.walk();
        //animal.countStipes();
        
        // Tiger tig = new Animal();
        
        //Audi audi =  new Car();
    }
}
