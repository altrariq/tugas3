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
public class Lingkaran implements MenghitungBidang {
    int jarijari;

    public Lingkaran(int jarijari) {
        this.jarijari = jarijari;
    }
    
    public Lingkaran(){
        jarijari = 0;
    }
    
    public int getJarijari() {
        return jarijari;
    }

    public void setJarijari(int jarijari) {
        this.jarijari = jarijari;
    }
    
    @Override
    public double LuasBangunDatar(){
    return Math.PI*jarijari*jarijari;
    }
    
    @Override
    public double KelilingBangunDatar(){
    return Math.PI*(2*jarijari);
    }
    
}
