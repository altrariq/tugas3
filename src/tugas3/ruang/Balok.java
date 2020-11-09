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
public class Balok extends tugas3.bidang.PersegiPanjang implements MenghitungRuang{
    private int tinggi;

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    private double LuasBalok(double p, double l, double t){
        return 2*((p*l)+(p*t)+(l*t));
    }
    
    @Override
    public double LuasBangunRuang(){
        return LuasBalok(super.getPanjang(),super.getLebar(),this.tinggi);
    }
    
    @Override
    public double VolumeBangunRuang(){
        return super.LuasBangunDatar()*this.tinggi;
    }
}
