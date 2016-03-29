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
public class Monkey extends Animal{

    @Override
    void walk() {
        
        System.out.println("Monkey is walking");
    }

    @Override
    void run() {
        System.out.println("Monkey is running");
    }

    @Override
    void eat() {
        System.out.println("Monkey is eat");
    }
}
