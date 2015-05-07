package TugasBesar;

abstract public class KeamananRK {    

    private String kekokohan;
    private String kunci_pintu;
    private String jendela;
    private String bahaya;
    private String list_inputan;

    public String getKekokohan() {
        return kekokohan;
    }

    public void setKekokohan(String kekokohan) {
        this.kekokohan = kekokohan;
    }

    public String getKunci_pintu() {
        return kunci_pintu;
    }

    public void setKunci_pintu(String kunci_pintu) {
        this.kunci_pintu = kunci_pintu;
    }

    public String getJendela() {
        return jendela;
    }

    public void setJendela(String jendela) {
        this.jendela = jendela;
    }

    public String getBahaya() {
        return bahaya;
    }

    public void setBahaya(String bahaya) {
        this.bahaya = bahaya;
    }

    public String getList_inputan() {
        return list_inputan;
    }

    public void setList_inputan(String list_inputan) {
        this.list_inputan = list_inputan;
    }

    String kekokohan ( String kekokohan){
    if ("kokoh".equals(kekokohan) ){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
   
    String kuncipintu ( String kuncipintu){
    if ("ada".equals(kuncipintu) ){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
    
    String jendela ( String jendela){
    
    if ("ada".equals(jendela) ){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
    
    String keamananRK ( String bahaya){
    
    if ("ada".equals(bahaya) ){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
    
    abstract void analisis();
    }
