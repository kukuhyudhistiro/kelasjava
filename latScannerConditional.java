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

public class latScannerConditional {

    public static void main(String args[]) {
        int uts, uas, tugas;
        int statusbayar; //lunas / belum (L/BL)
        String status = ""; //lulus / tidak 
        Scanner inputUTS = new Scanner(System.in);
        Scanner inputUAS = new Scanner(System.in);
        Scanner inputTGS = new Scanner(System.in);
        Scanner inputBYR = new Scanner(System.in);

        System.out.print("Masukkan Status Bayar = ");
        statusbayar = inputBYR.nextInt(); //1=LUNAS 0=BL
        //--- kondisional;

        if (statusbayar == 1) {
            System.out.print("Masukkan TUGAS = ");
            tugas = inputTGS.nextInt();
            System.out.print("Masukkan UTS = ");
            uts = inputUTS.nextInt();
            System.out.print("Masukkan UAS = ");
            uas = inputUAS.nextInt();

            if (uas > 90 || uts > 70 && tugas > 80) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
                //IKUT REMIDI?
                
            }
            System.out.println("Status Kelulusan : " + status);

        } else {
            status = "BAYAR DULU!";
            System.out.println("Status Bayar : " + status);
        }

    }
}
