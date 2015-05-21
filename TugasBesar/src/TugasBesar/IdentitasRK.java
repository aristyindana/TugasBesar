package TugasBesar;

import java.util.Scanner;

public class Input_LingkunganRK extends Input_IdentitasRK {
Test_LingkunganRK lingkup = new Test_LingkunganRK();
    
    void analisis() {
    Scanner x = new Scanner(System.in);
    System.out.println("Analisis kondisi lantai :");
    String a = (x.next());
    System.out.println("Analisis kondisi dinding :");
    String b = (x.next());
    System.out.println("Analisis kondisi atap :");
    String c = (x.next());
    System.out.println("Analisis kondisi pintu :");
    String d = (x.next());
    System.out.println("Analisis kondisi jendela :");
    String e = (x.next());
    
    }
    @Override
void analisis_identitasRK(){
    Scanner x = new Scanner(System.in);
        System.out.print("Masukkan Nama Ruang : ");
        String nm = (x.next());
        System.out.print("Masukkan Lokasi Ruang : ");
        String lk = (x.next());
        System.out.print("Masukkan Program Studi/Fakultas : ");
        String pf = (x.next());
    
}

}
