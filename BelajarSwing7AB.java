/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x220
 */
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class BelajarSwing7AB {
     public static void main(String args[]) {
        JFrame formKu = new JFrame();
           
        //  Menentukan title bar di Frame
        formKu.setTitle("Belajar JFrame");
         
        //  Menentukan ukuran Frame (width, heigth)
        formKu.setSize(400, 200);
         
        //  Membuat letak Frame berada di tengah ketika program dijalankan
        formKu.setLocationRelativeTo(null);
         
        //  Mengaktifkan event agar ketika frame di close maka, program akan berhenti
        formKu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //  [Optional] Untuk menonaktifkan button maximize di Frame
        formKu.setResizable(Boolean.TRUE);
         
        //  Aktifkan Visible Frame
        formKu.setVisible(true);
        formKu.setLayout(new FlowLayout());
        //-------------------------------------------------
        JLabel lblnama ;
        lblnama = new JLabel("Nama  : ");
        //tampilkan di frame
        formKu.add(lblnama);
     //-------------------------------------------------
        JTextField txtnama;
        txtnama = new JTextField(10);
        formKu.add(txtnama);
            //-------------------------------------------------
        JLabel lblTitel;
        lblTitel = new JLabel("Titel  : ");
        //tampilkan di frame
        formKu.add(lblTitel);
        
        //-------------------------------------------------
        JButton btnProses;
        btnProses = new JButton("Proses");
        formKu.add(btnProses);
        
        //-------------------------------------------------
        JCheckBox cS1,cS2;
        cS1 = new JCheckBox("S1");
        cS2 = new JCheckBox("S2");
        formKu.add(cS1);
        formKu.add(cS2);
        //-PANEL ------------------------------------------------
        JPanel pnldata;
        pnldata = new JPanel();
        pnldata.setLayout(new GridLayout(4,2)); //baris- kolom
        pnldata.add(lblnama);
        pnldata.add(txtnama);
        pnldata.add(lblTitel);
        pnldata.add(cS1);
        pnldata.add(new JLabel());
        pnldata.add(cS2);
        pnldata.add(new JLabel());
        pnldata.add(btnProses);
        //masukkan panel ke frame
        formKu.add(pnldata);
        
     }
}
