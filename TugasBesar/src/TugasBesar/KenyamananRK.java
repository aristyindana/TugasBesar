package TugasBesar;

abstract public class KenyamananRK {
    
    public String kebisingan;
    public String bau;
    public String kebocoran;
    public String kerusakan;
    public String keausan;

    public String getKebisingan() {
        return kebisingan;
    }

    public void setKebisingan(String kebisingan) {
        this.kebisingan = kebisingan;
    }

    public String getBau() {
        return bau;
    }

    public void setBau(String bau) {
        this.bau = bau;
    }

    public String getKebocoran() {
        return kebocoran;
    }

    public void setKebocoran(String kebocoran) {
        this.kebocoran = kebocoran;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getKeausan() {
        return keausan;
    }

    public void setKeausan(String keausan) {
        this.keausan = keausan;
    }
    
    String kebisingan ( String kebisingan){
    if ("tidak bising".equals(kebisingan) ){
    return "sesuai";
    }
    else {
    return "tidak sesuai";
    }
    }
    
    String bau ( String bau){
    if ("tidak bau".equals(bau) ){
    return "sesuai";
    }
    else {
    return "tidak sesuai";
    }
    }
    
    String kebocoran ( String kebocoran){
    if ("tidak bocor".equals(kebocoran) ){
    return "sesuai";
    }
    else {
    return "tidak sesuai";
    }
    }
    
    String kerusakan ( String kerusakan){
    if ("tidak rusak".equals(kerusakan) ){
    return "sesuai";
    }
    else {
    return "tidak sesuai";
    }
    }
    
    String keausan ( String keausan){
    if ("tidak aus".equals(keausan) ){
    return "sesuai";
    }
    else {
    return "tidak sesuai";
    }
    }

    abstract void analisis();
    }
