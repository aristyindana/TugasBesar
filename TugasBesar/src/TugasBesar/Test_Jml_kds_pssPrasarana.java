package TugasBesar;

public class Test_Jml_kds_pssPrasarana {
    Jml_kds_pssPrasarana eris = new Jml_kds_pssPrasarana();
    
    
    String kelistrikan (int jml_steker,int kondisi_steker, String posisi_steker){     
    if (jml_steker >=4 && kondisi_steker ==4 && "dipojok ruang".equals(posisi_steker) && "dekat dosen".equals(posisi_steker)){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
      
    String lcd(int jml_kabelLCD, String kondisi_kabelLCD, String posisi_kabelLCD){
    if (jml_kabelLCD >=1 && "berfungsi".equals(kondisi_kabelLCD) && "dekat dosen".equals(posisi_kabelLCD)){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
    
    String lampu (int jml_lampu , int kondisi_lampu , String posisi_lampu){
    if (jml_lampu >=18 && 18 ==kondisi_lampu && "atap ruangan".equals(posisi_lampu)){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
    
    String kipasangin (int jml_kipasangin , int kondisi_kipasangin, String posisi_kipasangin){
    if (jml_kipasangin >=2 && kondisi_kipasangin ==2 && "atap ruangan".equals(posisi_kipasangin)){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
    
    String ac (int jml_AC , String kondisi_AC, String posisi_AC){
    if (jml_AC >=1 && "baik".equals(kondisi_AC) && "dibelakang".equals(posisi_AC) && "disamping".equals(posisi_AC)){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
   
    String internet (String SSID , String bandwith){
    if ("UMM Hotspot".equals(SSID) && "UMM Hotspot".equals(bandwith) ){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }
   
    String cctv (int jml_CCTV , int kondisi_CCTV, String posisi_CCTV){
    if (jml_CCTV==2 && kondisi_CCTV ==2 && "depan".equals(posisi_CCTV) && "belakang".equals(posisi_CCTV)){
        return "sesuai";
    }
    else {
        return "tidak sesuai";
    }
    }

    }
