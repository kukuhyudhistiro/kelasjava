/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 30 Sept 2019
 * @author x220
 */
import java.util.Scanner;
public class latScanner {
      public static void main(String args[]){
          //hitung luas persegi panjang
          int L;//input
          int P;//input
          int Luas; //output
          //deklarasi object utk menerima inputan
          Scanner inputL = new Scanner(System.in);
          Scanner inputP = new Scanner(System.in);
          
          System.out.print("Masukkan nilai Panjang = ");
          P = inputP.nextInt();
         
          System.out.print("Masukkan nilai Lebar = ");
          L = inputL.nextInt();
      
          System.out.println("----------------------------");
          System.out.println("Nilai P = " + P);
          System.out.println("Nilai L = " + L);
          
          Luas = P * L;
          System.out.println("Luas = " + Luas);
      }
}
