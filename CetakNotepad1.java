/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x220
 */
import java.util.Scanner; //1
import java.io.*;//2
public class CetakNotepad1 {
    public static void main(String[] args)
    throws Exception
    {
        Scanner in = new Scanner(System.in);
        String nama="";
        int umur=0;
        
        System.out.print("Masukkan nama = ");
        nama = in.nextLine();
        System.out.print("Masukkan umur = ");
        umur = in.nextInt();
        
        try{
            //1.siapkan obyek File output
            File cetak = new File("C:\\Users\\x220\\Downloads\\PAKET JAVA SMT 7\\tesjava.txt"); 
            //2.Perintah cetak (replace / append)
            PrintWriter pr = new PrintWriter(new FileWriter(cetak,true));
            pr.println(nama + " - " + umur);
            pr.close(); //tutup object cetak
        
        } catch (Exception ex){
             System.out.print("Gagal cetak! ");
        
        }
        
    }
}
