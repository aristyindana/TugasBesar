package TugasBesar;

abstract public class KebersihanRK {

    private String sirklusi_udara;
    private int nilai_pencahayaan;
    private int kelembapan;
    private int suhu;

    public String getSirklusi_udara() {
        return sirklusi_udara;
    }

    public void setSirklusi_udara(String sirklusi_udara) {
        this.sirklusi_udara = sirklusi_udara;
    }

    public int getNilai_pencahayaan() {
        return nilai_pencahayaan;
    }

    public void setNilai_pencahayaan(int nilai_pencahayaan) {
        this.nilai_pencahayaan = nilai_pencahayaan;
    }

    public int getKelembapan() {
        return kelembapan;
    }

    public void setKelembapan(int kelembapan) {
        this.kelembapan = kelembapan;
    }

    public int getSuhu() {
        return suhu;
    }

    public void setSuhu(int suhu) {
        this.suhu = suhu;
    }
    
    String sirkulasiUdara (String sirkulasi_udara ){
    if ("lancar".equals(sirkulasi_udara)){
          return "sesuai";
    }
    else {
          return "tidak sesuai";
    }
    }
    
    String pencahayaan (int pencahayaan ){
    if (pencahayaan>=250 && pencahayaan <=350){
          return "sesuai";
    }
    else {
          return "tidak sesuai";
    }
    }
    
    String kelembapan (int kelembapan  ){
    if (kelembapan >=70 && kelembapan <=80){
          return "sesuai";
    }
    else {
          return "tidak sesuai";
    }
    }
           
    String suhu (int suhu ){
    if (suhu >=25 && suhu <=35){
          return "sesuai";
    }
    else {
          return "tidak sesuai";
    }
    }   
        
    abstract void analisis();
    }
