/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication51;

/**
 *
 * @author MOKLET-2
 */
public class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
        int uang=peg.gaji();
        if(peg instanceof Direktur)
            uang+=((Direktur)peg).tunjangan();
        if(peg instanceof Staf)
            uang+=((Staf)peg).Bonus();
        return uang;
    }
    public static void main(String[] args){
        PembayaranGaji pg = new PembayaranGaji();
        Staf all=new Staf();
        Direktur tony = new Direktur();
        System.out.println("Gaji Staf = "+pg.hitungGaji(all));
        System.out.println("Gaji Staf = "+pg.hitungGaji(tony));
    }
}
