/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecttwo;

/**
 *
 * @author alfarkhan
 */
public class Keramik2 {
    int ukuran,isi,harga;
    String kategori;
    
    Keramik2(int a, int b, int c, String d){
        this.ukuran = a;
        this.isi = b;
        this.harga = c;
        this.kategori = d;
    }
            
    int hitungJumlah(){
        int jumlah = 1000000/this.ukuran;
        return jumlah;
        }
    
    int hitungBox(){
        int box = this.hitungJumlah()/this.isi;
        return box+1; // ditambah 1 karena untunk menutupi kekurangan keramik 
        }
    
    void hitungHarga(){
        int box = this.hitungBox();
        int total = this.hitungBox() * this.harga;
        System.out.println("Membutuhkan Keramik "+this.kategori+" Sebanyak "+box+" Box Dengan Harga Total Rp"+total);
        }
}
