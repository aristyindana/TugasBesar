/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar;

/**
 *
 * @author SAMSUNG
 */
abstract public class KondisiRK {
    
    private int panjang;
    private int lebar;
    private int jmlkursi;
    private int jmljendela;
    private int jmlpintu;
    private int luas;
    private double rasioluas;

    public int getJmljendela() {
        return jmljendela;
    }

    public void setJmljendela(int jmljendela) {
        this.jmljendela = jmljendela;
    }

    public int getJmlkursi() {
        return jmlkursi;
    }

    public void setJmlkursi(int jmlkursi) {
        this.jmlkursi = jmlkursi;
    }

    public int getJmlpintu() {
        return jmlpintu;
    }

    public void setJmlpintu(int jmlpintu) {
        this.jmlpintu = jmlpintu;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public double getRasioluas() {
        return rasioluas;
    }

    public void setRasioluas(double rasioluas) {
        this.rasioluas = rasioluas;
    }

    double hitungluas(int panjang, int lebar){
    int ll = panjang*lebar;
        return ll;
    }
    
    String bentuk (int panjang , int lebar){
    if (panjang!=lebar){
        return "persegi panjang";
    }
    else {
        return "persegi";
    }
    }
    
    String hitungrasio (int panjang, int lebar, int jmlkursi){
    int ll = panjang*lebar;
    double rl = ll/jmlkursi;
    if(rl >= 0.5){
        return "sesuai";
    } 
    else {
        return "tidak sesuai";
    }
    }
    
    String jumlahpintujadi (int jumlahpintu,int jumlahjendela){
    if (jumlahpintu>=2 && jumlahjendela >=1){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
    
    abstract void analisis();
}
