/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buahjava;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */

public class Buah {
    
    public static void main(String[] args) {
        System.out.println("Dewi Nurul / 16 / X RPL 6");
        String data[] = new String[5];
        int i;
        String nama_buah, cari;
        boolean ketemu;
        
        //input data array sebanyak 5
        for (i = 0; i < data.length; i++) {
            nama_buah  = String.valueOf(JOptionPane.showInputDialog("Masukkan Nama Buah ke-" + (i + 1))) ;
            data[i] = nama_buah;
        }
        //Tampilkan data setelah proses Input
        System.out.print("Nama buah yang dimasukkan = { ");
        for (i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("}");
        
        //Input data yang dicari
        cari =  String.valueOf(JOptionPane.showInputDialog("Masukkan Nama Buah yang dicari :"));
        System.out.println("Nama Buah yang dicari : " + cari);
        //proses pencarian data dengan metode sequential search
        ketemu = false;
        for (i = 0; i < data.length; i++) {
            if (cari.equals(data[i]) ) { //== operator perbandingan (true or false)
                ketemu = true;
                break;
            }
        }
        if (ketemu) {
            System.out.println(cari + " ditemukan dalam urutan ke - " + (i + 1));
        } else {
            System.out.println(cari + "tidak ditemukan");
        }
    }
}


