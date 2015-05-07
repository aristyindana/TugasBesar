package TugasBesar;

import java.util.Scanner;

public class Test_KebersihanRK extends KebersihanRK {
    
    @Override
    void analisis(){
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan analisis sirkulasi udara  : ");
        String su = (x.next());
        System.out.print("Masukkan analisis nilai pencahayaan : ");
        int np = (x.nextInt());
        System.out.print("Masukkan analisis kelembaban : ");
        int kb = (x.nextInt());
        System.out.print("Masukkan analisis suhu : ");
        int sh = (x.nextInt());
        
        super.sirkulasiUdara(su);
        super.pencahayaan(np);
        super.kelembapan(kb);
        super.suhu(sh);
    }
}
