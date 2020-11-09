/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.ruang;

/**
 *
 * @author Acer
 */
public class Kerucut extends tugas3.bidang.Lingkaran implements MenghitungRuang {
    private int tinggiKerucut;

    public Kerucut(int tinggiKerucut, int jarijari) {
        super(jarijari);
        this.tinggiKerucut = tinggiKerucut;
    }

    public int getTinggiKerucut() {
        return tinggiKerucut;
    }

    public void setTinggiKerucut(int tinggiKerucut) {
        this.tinggiKerucut = tinggiKerucut;
    }

    public double garisPelukis(){
        return Math.sqrt(Math.pow(super.getJarijari(),2) + Math.pow(tinggiKerucut,2));
    }
    
    @Override
    public double LuasBangunRuang(){
        return Math.PI*super.getJarijari()*(super.getJarijari()+garisPelukis());
    }
    
    @Override
    public double VolumeBangunRuang(){
        return (super.LuasBangunDatar()*tinggiKerucut)/3;
    }
    
}
