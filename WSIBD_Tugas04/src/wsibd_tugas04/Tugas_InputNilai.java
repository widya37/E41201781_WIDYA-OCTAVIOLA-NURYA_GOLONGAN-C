/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_tugas04;

import java.util.Scanner;

/**
 *
 * @author widya
 */
public class Tugas_InputNilai {
    public static void main(String[] args) {
    //membuat variabel dan scanner
System.out.println("Masukan banyak data nilai = 4 ");
Scanner in=new Scanner(System.in);
int i=1;
double jum=0;
double rata=0;
int max=0,min=1000;

while(i>=1){
int jml=i+1;
int[] tampung =new int[jml];

System.out.print("Masukan data ke-"+i+" = ");
tampung[i] = in.nextInt();

jum=tampung[i]+jum;
if (tampung[i] > max){
max = tampung[i];
}
if(tampung[i]==0){
break;
}
if (( tampung[i] <
min)&&(tampung[i]>=1)){
min = tampung[i];
}
i++;
}
if(i==1){
System.out.println("mohon isikan data");
System.exit(0);
}
rata=jum/(i-1);
System.out.println("Angka terkecil: "+min);
System.out.println("Angka terbesar: "+max);
System.out.println("Rata-rata: "+rata);
}
}