/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_tugas03;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Tugas_SalesTable {
        public static void main(String[] args) {
    int barangPertama, barangKedua, barangKetiga, barangKeempat, barangKelima, 
        totalHarga;
    String nama, hadiah = "-";
    Scanner masuk = new Scanner(System.in);
    
    System.out.println("---------------------------------------------------------------");
    System.out.println             ("Kharisma Agung Plaza <KAP>");
    System.out.println              ("Promo Belanja Berhadiah");
    System.out.println          ("Khusus Pembelian 5 Barang Pertama");
    System.out.println           ("Dengan harga minimum Rp 10000,00");
    System.out.println("---------------------------------------------------------------");
    System.out.println("Masukkan nama pembeli :");
    nama = masuk.nextLine();
    System.out.println("");
    System.out.println("Masukkan harga barang ke-1     :");
    barangPertama = masuk.nextInt();
    System.out.println("Masukkan harga barang ke-2     :");
    barangKedua = masuk.nextInt();
    System.out.println("Masukkan harga barang ke-3     :");
    barangKetiga = masuk.nextInt();
    System.out.println("Masukkan harga barang ke-4     :");
    barangKeempat = masuk.nextInt();
    System.out.println("Masukkan harga barang ke-5     :");
    barangKelima = masuk.nextInt();
    totalHarga = barangPertama + barangKedua + barangKetiga + barangKeempat + barangKelima;
    System.out.println("Total harga pembelian atas nama " + nama + "adalah Rp" + totalHarga);
    if (totalHarga >= 80000){
        hadiah = "1 buah mug cantik";
    System.out.println("");
    System.out.println("Selamat....");
    System.out.println("Anda mendapat " + hadiah);
    System.out.println("");
    System.out.println("---------------------------------------------------------------");
    System.out.println                      ("Terima Kasih");
    System.out.println("Anda sudah belanja di Kharisma Agung Plaza");
    }
    }
}

