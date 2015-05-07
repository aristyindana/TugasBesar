package TugasBesar;

import java.util.Scanner;

public class Test_KenyamananRK extends KenyamananRK {
    
    @Override
    void analisis(){
    Scanner x = new Scanner(System.in);
    System.out.println("Analisis kebisingan :");
    String bs = (x.next());
    System.out.println("Analisis bau :");
    String bu = (x.next());
    System.out.println("Analisis kebocoran :");
    String bc = (x.next());
    System.out.println("Analisis kerusakan :");
    String rs = (x.next());
    System.out.println("Analisis keausan :");
    String au = (x.next());
    
    super.kebisingan(kebisingan);
    super.bau(bau);
    super.kebocoran(kebocoran);
    super.kerusakan(kerusakan);
    super.keausan(keausan);
    }
    
}
