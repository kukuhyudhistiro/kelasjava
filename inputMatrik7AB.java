/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x220
 * 
 */
import java.util.Scanner;

public class inputMatrik7AB {
    public static void main(String args[]) {
        //menampilkan array dari nilai yang diinputkan user
        int jumlahBaris, jumlahKolom;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Jumlah indeks baris martriks : ");
        jumlahBaris = scanner.nextInt();
        System.out.print("Masukan Jumlah indeks kolom martriks : ");
        jumlahKolom = scanner.nextInt();
        
        Integer[][] array = new Integer[jumlahBaris][jumlahKolom];
        
        //input nilai di array
         for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print("Masukan isi indeks beris ke " + i + " kolom ke "+j+":");
                array[i][j] = scanner.nextInt();
            }
        }

        //tampilkan array
        System.out.println();
        System.out.println("berikut adalah isi array yang tadi dimasukan:");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.println("Isi indeks baris ke " + i + " kolom ke "+j+" adalah :" + array[i][j]);
            }
        }
        
        //tampilan bentuk matrik
         System.out.println();
        System.out.println("Bentuk matriks:");
        for (int i = 0; i < jumlahBaris; i++) {
            for (int j = 0; j < jumlahKolom; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
