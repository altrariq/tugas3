/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.bidang;

/**
 *
 * @author Acer
 */
public class PersegiPanjang implements MenghitungBidang {
    int panjang;
    int lebar;
    
    public PersegiPanjang(int panjang, int lebar){
    this.panjang = panjang;
    this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
     
    @Override
    public double LuasBangunDatar(){
    return panjang*lebar;
    }
    
    @Override
    public double KelilingBangunDatar(){
    return 2*(panjang+lebar);
    }
}
