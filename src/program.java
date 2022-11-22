/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.util.List;

public class program {
    
    static void insert(){
        fasilitas perintah = new fasilitas();
        barang atk = new barang();
        atk.setKode_barang("B002");
        atk.setNama_barang("Buku Gambar");
        atk.setJumlah(12);
        atk.setHarga(3000);
        perintah.insert(atk);
    }
    
    static void update(){
        fasilitas perintah = new fasilitas();
        barang atk = new barang();
        atk.setKode_barang("B002");
        atk.setNama_barang("BUKU GAMBAR");
        atk.setJumlah(12);
        atk.setHarga(3000);
        perintah.update(atk);
    }
    
    static void delete(){
        fasilitas perintah = new fasilitas();
        perintah.delete("B002");
    }
    
    static void selectAll(){
        fasilitas perintah = new fasilitas();
        List<barang> list = perintah.selectAll();
        for(barang barang : list){
            System.out.println(barang.getKode_barang());
            System.out.println(barang.getNama_barang());
            System.out.println(barang.getJumlah());
            System.out.println(barang.getHarga());
            System.out.println("-------------------------");
        }
    }
    
    public static void main(String[] args) {
       insert();
    }
}
