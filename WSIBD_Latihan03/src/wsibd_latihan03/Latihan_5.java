/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_latihan03;

import java.util.Scanner;

/**
 *
 * @author widya
 */
public class Latihan_5 {
        public static void main(String[] args) {
        
        //membuat variabel dan scanner
        String lampu;
        Scanner scan = new Scanner(System.in);
        
        //mengambil input
        System.out.print("inputkan nama warna: ");
        lampu = scan.nextLine();
        
        switch (lampu) {
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silahkan jalan!");
                break;
            default:
                System.out.println("warna lampusalah!");
     
                
        } 
    }
}


    

