
package uang;

import java.util.Scanner;

public class no3 {
    
    static Scanner scan = new Scanner(System.in );
    
    public static void main(String[] args) {
        
        System.out.println("Masukkan Nilai M : ");
        int m = scan.nextInt();
        System.out.println("Masukkan Nilai N : ");
        int n = scan.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("\t");
                
            }
            System.out.println("");
        }
    }
    
}
