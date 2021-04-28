/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_tugas04;

/**
 *
 * @author widya
 */
public class Tugas_Kelipatan2 {
   public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Do While");
        System.out.println("Bilangan Kelipatan 2 (0 - 100)");
        System.out.println("==================================");
        int i = 1;
        do {
            System.out.println(i + " ");
            i = i * 2;
        } while(i <= 100);
        
        System.out.println("Bilangan Perkalian 2 (0 - 100)");
        System.out.println("==================================");
        int j = 0;
        do {
        if (j == 0) {
            j = 0;
        }else{
            System.out.print(j * 2 + " ");
        }
            j++;
        } while(j <= 100);
    }
}
    
