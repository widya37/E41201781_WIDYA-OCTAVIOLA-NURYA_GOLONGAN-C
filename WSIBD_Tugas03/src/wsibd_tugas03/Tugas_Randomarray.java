/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_tugas03;


import java.util.Scanner;
import java.util.*;
/**
 *
 * @author widya
 */
public class Tugas_Randomarray {
        public static void main(String[] args) {
        // TODO code application logic here
        Random angkaRandom = new Random();
        int hasil;

        for (int counter = 1; counter <= 200; counter++){
            hasil = 1 +angkaRandom.nextInt(9);
            System.out.printf ("%d", hasil);

        if (counter % 20 == 0) 
        System.out.println();
        }
    }
}
    
