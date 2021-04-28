/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_tugas04;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Tugas_cobacoba {
    public static void main(String[] args) {
        // TODO code application logic here
int[] nilai = new int[10];
        int max,min;
        int i;
        
        //membuat perulangan dari inputan user, dimana perulangan
        //akan menampilkan output untuk menginputkan angka sebanyak 10 kali
        for (i = 0; i<10; i++)
        {
            String bilangan = JOptionPane.showInputDialog("Masukkan Nilai: ");
            nilai[i] = Integer.parseInt(bilangan);
            System.out.println("Input Angka: "+bilangan);
        }
        
        //inisialisasi variabel min dan max dengan membuat kedua variable tersebut memiliki nilai array dari angka
        min=nilai[0];
        max=nilai[0];
        //menghitung nilai max dan nilai min
        for (i=0; i<10; i++){
            if(nilai[i] > max){
                max = nilai[i];   
            }
            else if(nilai[i] < min){
                min = nilai[i];    
            }    
        }
        System.out.println("--------------------------------");
        System.out.println("Nilai Max = "+max);
        System.out.println("Nilai Min = "+min);        
    }
        
    }

        
        

    
    
