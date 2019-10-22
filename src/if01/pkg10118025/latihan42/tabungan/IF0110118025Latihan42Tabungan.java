/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan42.tabungan;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class IF0110118025Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tabungan tabung = new Tabungan();
        Scanner scan = new Scanner(System.in);
        int jumlah;
        
        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan Saldo Awal : ");
        tabung.Tabungan(scan.nextInt());
        System.out.print("Jumlah Uang yang Diambil : ");
        jumlah = scan.nextInt();
        System.out.println("Saldo Anda : " + tabung.ambilUang(jumlah));
    }
    
}
