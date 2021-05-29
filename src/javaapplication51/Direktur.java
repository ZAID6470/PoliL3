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
class Direktur extends Pegawai{
    private static final int gajiDir=1000000;
    private static final int tunjangan=500000;
    
    public int gaji(){
        return gajiDir;
    }
    public int tunjangan(){
        return tunjangan;
    }
}
