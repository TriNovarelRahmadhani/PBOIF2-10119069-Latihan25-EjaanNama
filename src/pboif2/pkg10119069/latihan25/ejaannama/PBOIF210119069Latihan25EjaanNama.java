/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : Program ini berisi program ejaan nama
 */
public class PBOIF210119069Latihan25EjaanNama {
    public static void ejaan(String nama, int jumlahKarakter) {
        for (int i = 0; i<jumlahKarakter; i++) {
            char eja = nama.charAt(i);
            int no = i+1;
            System.out.println("Huruf ke-" + no + " : " + eja);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int jumlahKarakter;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan untuk dieja : ");
        nama = input.next();
        jumlahKarakter = nama.length();
        System.out.println("");
        System.out.println("Ejaan untuk "+ "' "+nama+" ' "+"adalah : ");
        ejaan(nama,jumlahKarakter);
        
        System.out.println("-------------------------------------");
        System.out.println("Developed by : Tri Novarel Rahmadhani");
    }
    
}
