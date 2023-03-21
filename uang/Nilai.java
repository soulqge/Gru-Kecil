package uang;

import java.util.Scanner;

public class Nilai {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.print("Masukkan Nilai Tes Akademik       : ");
        int nilaiA = scan.nextInt();
        System.out.print("Masukkan Nilai Tes Ketrampilan    : ");
        int nilaiK = scan.nextInt();
        System.out.print("Masukkan Nilai Tes Psikologi      : ");
        int nilaiP = scan.nextInt();
        
        int rata = ( nilaiA + nilaiK + nilaiP ) / 3;
        
        if (rata >= 75) {
            System.out.println("Lulus");
            if (nilaiA > nilaiK && nilaiA > nilaiP) {
                System.out.println("Diterima Pada Bagian Admininstrasi");
            }
            else if (nilaiK > nilaiA && nilaiK > nilaiP) {
                System.out.println("Diterima Pada Bagian Produksi");
            }
            else if (nilaiP > nilaiA && nilaiP > nilaiK) {
                System.out.println("Diterima Pada Bagian Pemasaran");
            }
            
            System.out.println("Nilai Rata - Rata           : "+rata);
        }
        else{
            System.out.println("Tidak Diterima");
            System.out.println("Nilai Rata - Rata           : "+rata);
        }
    }
}
