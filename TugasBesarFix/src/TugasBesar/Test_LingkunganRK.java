package TugasBesar;

import java.util.Scanner;

public class Test_LingkunganRK extends LingkunganRK {

    @Override
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
    
    super.kebersihan(d, d, d, d, e);
    
    }

}
