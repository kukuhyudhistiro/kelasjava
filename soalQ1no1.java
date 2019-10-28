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
public class soalQ1no1 {
       public static void main(String args[]) {
    //5. matrik 

     String soal[][]={
                            {"A1","A2","A3"},
                            {"A4","A5","A6"},
                            {"A7","A8","A9"}
                        };
           
        //1. mengisi array dengan nilai 
          for(int baris = 0; baris<3;baris++){
              for(int kolom = 0; kolom<3; kolom++){
                    System.out.print( soal[baris][kolom] + " " );
              }
              System.out.println("");
          }   
     /*
    //4. arrray buah 
       String buah[]={"apel","jeruk","nangka","anggur"};
          for(int i = 0; i<4;i++){
              System.out.println(buah[i]);
          }
       */
           /*
        //cari nilai min
        int a,b,c;
        int min=0;
        String sts;
        a=2;
        b=5;
        c=3;
        if(a<b && a<c){
            min = a;
        } else if(b<a && b<c){
            min = b;
        } else if(c<a && c<b){
            min=c;
        } else {
            sts="SAMA";
        }
           
           System.out.println(min); */
           
       /*
        //operasi kali 2 var inputan
          Scanner scanner = new Scanner(System.in);
          int a,b,c;
           System.out.print("Masukan Bil 1 = ");
           a = scanner.nextInt();
           System.out.print("Masukan Bil 2 = ");
           b = scanner.nextInt();
           c = a * b;
           System.out.println("c    = " + a + " * " + b);
           System.out.println("     = " + c); */


//1. operasi penjumlah 2 buah var
           /*
           int a,b,c;
           a=2;
           b=3;
           c=a+b;
           System.out.println("c    = " + a + " + " + b);
           System.out.println("     = " + c); */
           
           
           
       }
}
