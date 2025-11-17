import java.util.Scanner;

/**
 * Program untuk menghasilkan berbagai pola bintang berdasarkan input n
 * Pola yang dihasilkan:
 * 1. Segitiga siku-siku rata kiri (FOR loop)
 * 2. Segitiga siku-siku rata kanan (WHILE loop)
 * 3. Segitiga sama sisi (DO-WHILE loop)
 * 4. Pola berlian/diamond (nested loops)
 */
public class GeneratorPolaBintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input tinggi pola
        System.out.print("Masukkan tinggi pola (n): ");
        int n = scanner.nextInt();
        
        System.out.println();
        
        // 1. Segitiga siku-siku rata kiri (FOR loop)
        System.out.println("=== POLA SEGITIGA SIKU-SIKU RATA KIRI ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // 2. Segitiga siku-siku rata kanan (WHILE loop)
        System.out.println("=== POLA SEGITIGA SIKU-SIKU RATA KANAN ===");
        int i = 1;
        while (i <= n) {
            int spasi = n - i;
            int bintang = i;
            
            // Cetak spasi
            int j = 1;
            while (j <= spasi) {
                System.out.print(" ");
                j++;
            }
            
            // Cetak bintang
            int k = 1;
            while (k <= bintang) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        
        System.out.println();
        
        // 3. Segitiga sama sisi (DO-WHILE loop)
        System.out.println("=== POLA SEGITIGA SAMA SISI ===");
        int baris = 1;
        do {
            // Cetak spasi
            int spasi = n - baris;
            int s = 1;
            do {
                System.out.print(" ");
                s++;
            } while (s <= spasi);
            
            // Cetak bintang
            int bintang = 2 * baris - 1;
            int b = 1;
            do {
                System.out.print("*");
                b++;
            } while (b <= bintang);
            
            System.out.println();
            baris++;
        } while (baris <= n);
        
        System.out.println();
        
        // 4. Pola berlian/diamond (nested loops)
        System.out.println("=== POLA BERLIAN ===");
        
        // Bagian atas diamond
        int atas = 1;
        while (atas <= n) {
            int spasi = n - atas;
            int bintang = 2 * atas - 1;
            
            // Cetak spasi
            for (int s = 1; s <= spasi; s++) {
                System.out.print(" ");
            }
            
            // Cetak bintang
            for (int b = 1; b <= bintang; b++) {
                System.out.print("*");
            }
            System.out.println();
            atas++;
        }
        
        // Bagian bawah diamond
        int bawah = n - 1;
        while (bawah >= 1) {
            int spasi = n - bawah;
            int bintang = 2 * bawah - 1;
            
            // Cetak spasi
            for (int s = 1; s <= spasi; s++) {
                System.out.print(" ");
            }
            
            // Cetak bintang
            for (int b = 1; b <= bintang; b++) {
                System.out.print("*");
            }
            System.out.println();
            bawah--;
        }
        
        scanner.close();
    }
}