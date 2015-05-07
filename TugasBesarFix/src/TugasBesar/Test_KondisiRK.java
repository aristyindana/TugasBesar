package TugasBesar;

import java.util.Scanner;

public class Test_KondisiRK extends KondisiRK {

    @Override     
    void analisis(){
    Scanner x = new Scanner(System.in);
        System.out.print("Masukkan panjang : ");
        int p = (x.nextInt());
        System.out.print("Masukkan lebar : ");
        int lb = (x.nextInt());
        System.out.print("Masukkan jumlah kursi : ");
        int jk = (x.nextInt());
        System.out.print("Masukkan jumlah jendela : ");
        int jj = (x.nextInt());
        System.out.print("Masukkan jumlah pintu : ");
        int jp = (x.nextInt());
        
        super.hitungluas(jp, lb);
        super.bentuk(jp, lb);
        super.hitungrasio(jp, lb, jk);
    }
    
}
