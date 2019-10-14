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
          byte tujuan; //1=SBY, 2=BDG
          String kotapilihan = "";
          int hrgpilihan = 0;
          int jrkpilihan =  0;
          
         String kota[][]={{"1","SURABAYA","169","2500"},{"2","BANDUNG","452","4000"}};
         
           System.out.println("--------------------------------------------------");
            System.out.println("-          Perusahaan             -");
            System.out.println("-    Ekspedisi Lorena Malang      -");
            System.out.println("--------------------------------------------------");
            System.out.println("Kode    | TUJUAN     |  jarak/km  | ONGKIR/km  ");
            System.out.println("--------------------------------------------------");
         for(int baris = 0; baris<2;baris++){
             for(int kolom = 0; kolom <4; kolom++ ){
                 System.out.print(kota[baris][kolom] + "    | ");
             }
             System.out.println("");
         }
      
        Scanner inputtujuan = new Scanner(System.in);
        Scanner dialogbaru = new Scanner(System.in);
        System.out.print("-> Pilih kode tujuan  = ");
        tujuan = inputtujuan.nextByte();
        
        //lanjutkan hingga proses cetak / tampil nota
     }
}
