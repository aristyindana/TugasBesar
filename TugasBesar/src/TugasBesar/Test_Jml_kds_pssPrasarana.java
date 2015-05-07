/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.besar;

import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Test_Jml_kds_pssPrasarana extends Jml_kds_pssPrasarana {
    
    @Override     
    void analisis(){
      Scanner x = new Scanner(System.in);
      System.out.print("Masukkan jumlah steker : ");
      int a = (x.nextInt());
      System.out.print("Masukkan posisi steker : ");
      int b = (x.nextInt());
      System.out.print("Masukkan kondisi steker : ");
      String c = (x.next());
      System.out.println("Masukkan jumlah LCD :");
      int d = (x.nextInt());
      System.out.println("Masukkan kondisi kabel LCD :");
      String e = (x.next());
      System.out.println("Masukkan posisi kabel LCD :");
      String f = (x.next());
      System.out.println("Masukkan jumlah lampu :");
      int g = (x.nextInt());
      System.out.println("Masukkan kondisi lampu :");
      String h = (x.next());
      System.out.println("Masukkan posisi lampu :");
      String i = (x.next());
      System.out.println("Masukkan jumlah kipas angin :");
      int j = (x.nextInt());
      System.out.println("Masukkan kondisi kipas angin :");
      int k = (x.nextInt());
      System.out.println("Masukkan posisi kipas angin :");
      String l = (x.next());
      System.out.println("Masukkan jumlah AC :");
      int m = (x.nextInt());
      System.out.println("Masukkan kondisi AC :");
      String n = (x.next());
      System.out.println("Masukkan posisi AC :");
      String o = (x.next());
      System.out.println("Pilih SSID :");
      String q = (x.next());
      System.out.println("Masukkan bandwidth :");
      String r = (x.next());
      System.out.println("Masukkan jumlah CCTV :");
      int s = (x.nextInt());
      System.out.println("Masukkan kondisi CCTV :");
      int t = (x.nextInt());
      System.out.println("Masukkan posisi CCTV :");
      String u = (x.next());
      
      super.kelistrikan(t, t);
      super.lcd(m, o, o);
      super.lampu(m, s, u);
      super.kipasangin(s, s, o);
      super.ac(m, o, o);
      super.internet(u, n);
      super.cctv(m, s, o);
      }
      }
