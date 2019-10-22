/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan42.tabungan;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 */
public class Tabungan {
    private int saldo;
    
    public void Tabungan(int saldo){
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah){
        int total = saldo- jumlah;
        return total;
    }
    
}
