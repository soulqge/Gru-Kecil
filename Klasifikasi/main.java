package Klasifikasi;

import java.util.Scanner;

public class main {
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        warm Warm = new warm();
        cold Cold = new cold();
        
        System.out.print("Masukkan Jenis Vertebrata ( Berdarah Dingin atau Panas): ");
        String j = scan.nextLine();
        
        if (j.equalsIgnoreCase("Dingin")) {
            Cold.vertebrata();
        }
        else if (j.equalsIgnoreCase("Panas")) {
            Warm.vertebrata();
        }
        else{
            System.out.println("Tidak Termasuk Vertebrata ");
        }
        
    }
}
