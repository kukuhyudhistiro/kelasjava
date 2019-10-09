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

public class lattransaksi {
     public static void main(String args[]) {
        byte tujuan; //1=SBY, 2=BDG
        String kota[]={"SBY","MLG","BDG"};
        String kota1 = "SBY";
        String kota2 = "BDG";
        String kotafix="";
        int jrk1 = 169;
        int jrk2 = 452;
        int jrkfix = 0;
        int ongkir1 = 2500;
        int ongkir2 = 4000;
        int ongkirfix=0;
        int totbayar =0;
        String inputbaru="";
        
        Scanner inputtujuan = new Scanner(System.in);
        Scanner dialogbaru = new Scanner(System.in);
     
        do{
        
            System.out.println("-------------------------------------");
            System.out.println("-          Perusahaan             -");
            System.out.println("-    Ekspedisi Lorena Malang      -");
            System.out.println("-------------------------------------");
            System.out.println("Kode    | TUJUAN        | ONGKIR/km  ");
            System.out.println("-------------------------------------");
            System.out.println("    1     SBY (169 km)    Rp 2500");
            System.out.println("    2     BDG (452 km)    Rp 4000");
            System.out.println("-------------------------------------");

            System.out.print("-> Pilih kode tujuan  = ");
            tujuan = inputtujuan.nextByte();

            switch (tujuan){
                case 1:
                    kotafix = kota1;
                    totbayar = jrk1 * ongkir1;
                    jrkfix = jrk1;
                    ongkirfix = ongkir1;
                    break;
                case 2:
                    kotafix = kota2;
                    totbayar = jrk2 * ongkir2;
                    jrkfix = jrk2;
                    ongkirfix = ongkir2;
                    break;

                  default:
                       System.out.println("Pilihan Anda Tidak ada Lur !");
                      break;
            }
            System.out.println("-------------------------------------");
             System.out.println("Anda Memilih       : " +  kotafix);
             System.out.println("Biaya Pengiriman   : " + jrkfix + " km * " + ongkirfix);
             System.out.println("                   : " + totbayar);
            System.out.println("-------------------------------------");

              System.out.print("Apakah Anda Ingin Input Baru ? y/t = ");

        inputbaru = dialogbaru.next();
        }while(!inputbaru.equals("t"));

        System.out.println("Terimakasih!");
        
        
     }
}