/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar;

/**
 *
 * @author SAMSUNG
 */
import java.util.Scanner;

public class Test_Keamanan extends KeamananRK {
    
    @Override
    void analisis(){
    Scanner x = new Scanner(System.in);
    System.out.println("Analisis kekokohan :");
    String kk = (x.next());
    System.out.println("Analisis kunci pintu :");
    String kp = (x.next());
    System.out.println("Analisis jendela :");
    String jd = (x.next());
    System.out.println("Analisis bahaya :");
    String ba = (x.next());
    
    super.kekokohan(kk);
    super.kuncipintu(kp);
    super.jendela(jd);
    super.keamananRK(ba);
    
    
    }
    
}
