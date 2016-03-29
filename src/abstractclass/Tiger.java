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
public /*abstract*/ class Tiger /*is an animal */ extends Animal {

    @Override
    /*annotation*/
    void walk() {
        System.out.println("Tiger is walking");
    }

    @Override
    void run() {
        System.out.println("Tiger is running");
    }

    @Override
    void eat() {
        System.out.println("Tiger is eating");
    }

    void countStrips() {

        System.out.println("Counting strips");
    }
}
