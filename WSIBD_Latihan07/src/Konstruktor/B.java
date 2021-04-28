/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konstruktor;

/**
 *
 * @author HP
 */

public class B extends A {
    B() { // super(); Tambahan kode secara otomatis oleh Java untuk memanggil
          //          Konstruktor dari SuperClassnya
          
        super(); // Konstruksi default dari class A
                   // Object dipanggil  
        System.out.println("Konstruksi class B dieksekusi...");
    }
}

