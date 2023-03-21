package uang;

import java.util.Scanner;

public class Proses {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
        int uang [] = {100_000, 50_000, 20_000, 10_000, 5_000, 2_000, 1_000};
        
        System.out.println("Masukkan Jumlah Uang : ");
        int jmlU = scan.nextInt();
        
        for (int i = 0; i < uang.length; i++) {
            int total = jmlU / uang[i];
            jmlU %= uang[i];
            
            if (total > 0) {
                System.out.println(total + " Lembar " + uang[i]);
            }
        }
                
    }
    
}
