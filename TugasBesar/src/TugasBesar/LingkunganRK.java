/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar;

/**
 *
 * @author SAMSUNG
 */

 abstract public class LingkunganRK {
 
 private String kondisi_lantai;
 private String kondisi_dinding;
 private String kondisi_atap;
 private String kondisi_pintu;
 private String kondisi_jendela;

    public String getKondisi_lantai() {
        return kondisi_lantai;
    }

    public void setKondisi_lantai(String kondisi_lantai) {
        this.kondisi_lantai = kondisi_lantai;
    }

    public String getKondisi_dinding() {
        return kondisi_dinding;
    }

    public void setKondisi_dinding(String kondisi_dinding) {
        this.kondisi_dinding = kondisi_dinding;
    }

    public String getKondisi_atap() {
        return kondisi_atap;
    }

    public void setKondisi_atap(String kondisi_atap) {
        this.kondisi_atap = kondisi_atap;
    }

    public String getKondisi_pintu() {
        return kondisi_pintu;
    }

    public void setKondisi_pintu(String kondisi_pintu) {
        this.kondisi_pintu = kondisi_pintu;
    }

    public String getKondisi_jendela() {
        return kondisi_jendela;
    }

    public void setKondisi_jendela(String kondisi_jendela) {
        this.kondisi_jendela = kondisi_jendela;
    }

    String kebersihan (String kondisi_lantai, String kondisi_dinding, String kondisi_atap, String kondisi_pintu, String kondisi_jendela){
    if ("bersih".equals(kondisi_lantai) && "bersih".equals(kondisi_dinding) &&  "bersih".equals(kondisi_atap) && "bersih".equals(kondisi_pintu) && "bersih".equals(kondisi_jendela)){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
    
    abstract void analisis();
    
    }
