/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x220
 */
import java.util.Scanner;

public class array2dimen {
     public static void main(String args[]) {
        byte tujuan=0; //1=SBY, 2=BDG
        String kotapilihan = "";
        int hrgpilihan = 0;
        int jrkpilihan =  0;
        int totbayar =0;          

        String kota[][]={   
                            {"1","SURABAYA","169","2500"},
                            {"2","BANDUNG","452","4000"},
                            {"3","SEMARANG","300","4500"},
                            {"4","BOGOR","350","5000"},
                            {"5","SALATIGA","250","5500"},
                            {"6","DENPASAR","500","6000"},
                        };

        System.out.println("--------------------------------------------------");
        System.out.println("-          Perusahaan             -");
        System.out.println("-    Ekspedisi Lorena Malang      -");
        System.out.println("--------------------------------------------------");
        System.out.println("Kode    | TUJUAN     |  jarak/km  | ONGKIR/km  ");
        System.out.println("--------------------------------------------------");
         for(int baris = 0; baris<6;baris++){
             for(int kolom = 0; kolom <4; kolom++ ){
                 System.out.print(kota[baris][kolom] + "  - ");
             }
             System.out.println("");
         }
      
        Scanner inputtujuan = new Scanner(System.in);
        Scanner dialogbaru = new Scanner(System.in);
        System.out.print("-> Pilih kode tujuan  = ");
        tujuan = inputtujuan.nextByte();
        
        //ambil data array
        //kota[baris][kolom]
        kotapilihan = kota[tujuan-1][1];
        jrkpilihan = Integer.parseInt(kota[tujuan-1][2]);
        hrgpilihan = Integer.parseInt(kota[tujuan-1][3]);
        
        totbayar = hrgpilihan * jrkpilihan;
        //report
        System.out.println("-------------------------------------");
        System.out.println("Anda Memilih       : " + kotapilihan);
        System.out.println("Biaya Pengiriman   : " + hrgpilihan + " km * " + jrkpilihan);
        System.out.println("                   : " + totbayar);
        System.out.println("-------------------------------------");
        
        //lenkapi dengan looping 
        //layar harus di ClEAR
        //pemberian diskon
        //soal:
        //1. tambahkan Inputan untuk Berat (tarif per kg Rp6000)
        //2. total bayar berdasarkan jarak + biaya berdasarkan berat/kg
        //3. jika subtotal bayar > 750000, diskon 5%
        //4. tampilkan total.
        
     }
}
