/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author widya
 */
public abstract class A { // Deklarasi Class
    abstract public void method2(); // Deklarasi method abstrak.
    // method konkrit yang memiliki implemnetasi 
    public void method1(){
        System.out.println("Method konrit dari Class A");
    }
    
}
