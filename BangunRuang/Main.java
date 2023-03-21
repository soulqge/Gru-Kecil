package BangunRuang;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        Kubus kubus = new Kubus();
        System.out.print("Masukkan Sisi Kubus : ");
        kubus.sisi = scan.nextInt();
        
        Balok balok = new Balok();
        System.out.print("Masukkan Panjang Balok : ");
        balok.panjang = scan.nextInt();
        System.out.print("Masukkan Lebar Balok : ");
        balok.lebar = scan.nextInt();
        System.out.print("Masukkan Tinggi Balok : ");
        balok.tinggi = scan.nextInt();
        
        Tabung tabung = new Tabung();
        System.out.print("Masukkan Jari - Jari : ");
        tabung.r = scan.nextInt();
        System.out.print("Masukkan Tinggi Tabung : ");
        tabung.t = scan.nextInt();
        
        Kerucut k = new Kerucut();
        System.out.print("Masukkan Jari - Jari : ");
        k.r = scan.nextInt();
        System.out.print("Masukkan Tinggi Kerucut : ");
        k.t = scan.nextInt();
        
        Limas l = new Limas();
        System.out.print("Masukkan Sisi Limas : ");
        l.sisi = scan.nextInt();
        System.out.print("Masukkan Tinggi Limas : ");
        l.tinggi = scan.nextInt();
        scan.nextInt();
        
        Prisma p = new Prisma();
        System.out.print("Masukkan Sisi Primas : ");
        p.alas = scan.nextInt();
        System.out.print("Masukkan Tinggi Primas : ");
        p.tinggi = scan.nextInt();
        System.out.print("Masukkan Tinggi Primas : ");
        p.tinggi_l = scan.nextInt();
        
        Bola b = new Bola();
        System.out.print("Masukkan Jari - Jari : ");
        b.r = scan.nextInt();
        
        kubus.Volume();
        kubus.spasi();
        
        balok.Volume();
        balok.spasi();
        
        tabung.Volume();
        tabung.spasi();
        
        k.Volume();
        k.spasi();
        
        l.Volume();
        l.spasi();
        
        p.Volume();
        p.spasi();
        
        b.Volume();
        b.spasi();
        
    }
}
