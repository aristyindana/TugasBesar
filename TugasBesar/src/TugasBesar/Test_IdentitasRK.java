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

public class Test_IdentitasRK extends IdentitasRK {
    
    @Override
    void analisis(){
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan Nama Ruang : ");
        String nm = (x.next());
        System.out.print("Masukkan Lokasi Ruang : ");
        String lk = (x.next());
        System.out.print("Masukkan Program Studi/Fakultas : ");
        String pf = (x.next());
    }
    
}

