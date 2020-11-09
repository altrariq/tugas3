/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;
import static java.lang.System.exit;
import java.util.Scanner;
import tugas3.bidang.Lingkaran;
import tugas3.bidang.MenghitungBidang;
import tugas3.bidang.PersegiPanjang;
import tugas3.ruang.Balok;
import tugas3.ruang.Kerucut;
import tugas3.ruang.MenghitungRuang;
/**
 *
 * @author Acer
 */
public class tugas3 {
    public static void main(String[] args) {
             menu();
    }
    
    static void menu(){
      
        Scanner scan = new Scanner(System.in);
        System.out.println("INPUT ");
        System.out.println("1. BALOK ");
        System.out.println("2. KERUCUT");
        System.out.println("3. EXIT");
        System.out.print("PILIH : ");
        int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    Balok();
                    break;
                case 2:
                    Kerucut();
                    break;
                default:
                    exit(0);
                    break;
            }

    }
    
    
   static void Balok(){
       Scanner scan = new Scanner(System.in);
       System.out.print("PANJANG    : ");
       int panjang = scan.nextInt();
       System.out.print("LEBAR      : ");
       int lebar = scan.nextInt();
       System.out.print("TINGGI     : ");
       int tinggi = scan.nextInt();
       PersegiPanjang pp = new PersegiPanjang(panjang,lebar);
       Balok balok = new Balok(panjang,lebar,tinggi);
       System.out.println("===OUTPUT===");
       System.out.println("Luas Permukaan Balok : " + balok.LuasBangunRuang());
       System.out.println("Volume Balok         : " + balok.VolumeBangunRuang());
       System.out.println("Luas Persegi         : " + pp.LuasBangunDatar());
       System.out.println("Keliling Persegi     : " + pp.KelilingBangunDatar());
       
       menu();
       
   }
   
      static void Kerucut(){
       Scanner scan = new Scanner(System.in);
       System.out.print("Masukkan Jari - Jari  : ");
       int jari = scan.nextInt();
       System.out.print("Masukkan Tinggi       : ");
       int tinggiKerucut = scan.nextInt();
       Lingkaran lingkaran = new Lingkaran(jari);
       Kerucut kerucut = new Kerucut(tinggiKerucut,jari);
       System.out.println("Luas Kerucut         : " + kerucut.LuasBangunRuang());
       System.out.println("Volume Kerucut       : " + kerucut.VolumeBangunRuang());
       System.out.println("Luas Lingkaran       : " + lingkaran.LuasBangunDatar());
       System.out.println("Keliling Lingkaran   : " + lingkaran.KelilingBangunDatar());
       
       menu();
       
   }
   
    
}
