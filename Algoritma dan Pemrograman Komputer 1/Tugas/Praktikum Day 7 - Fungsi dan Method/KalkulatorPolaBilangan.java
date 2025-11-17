import java.util.Scanner;

/**
 * Program kalkulator yang menghitung berbagai pola bilangan menggunakan method rekursif
 * Pola bilangan yang didukung: Fibonacci, Faktorial, Segitiga Pascal
 */
public class KalkulatorPolaBilangan {
    
    // Method rekursif untuk menghitung Fibonacci
    public static int fibonacci(int n) {
        // Base case
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    // Method rekursif untuk menghitung Faktorial
    public static long faktorial(int n) {
        // Base case
        if (n < 0) {
            return -1; // Error code untuk bilangan negatif
        } else if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case
        return n * faktorial(n - 1);
    }
    
    // Method rekursif untuk menghitung koefisien Segitiga Pascal
    public static int pascal(int baris, int kolom) {
        // Base case
        if (kolom == 0 || kolom == baris) {
            return 1;
        }
        if (baris < 0 || kolom < 0 || kolom > baris) {
            return 0;
        }
        // Recursive case
        return pascal(baris - 1, kolom - 1) + pascal(baris - 1, kolom);
    }
    
    // Method untuk menampilkan baris Segitiga Pascal
    public static void tampilkanPascal(int n) {
        System.out.print("Baris ke-" + n + ": ");
        for (int k = 0; k <= n; k++) {
            System.out.print(pascal(n, k) + " ");
        }
        System.out.println();
    }
    
    // Method untuk validasi input
    public static boolean validasiInput(int n, String jenis) {
        if (n < 0) {
            System.out.println("Error: Nilai tidak boleh negatif!");
            return false;
        }
        if (jenis.equals("faktorial") && n > 20) {
            System.out.println("Error: Nilai terlalu besar untuk faktorial!");
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan=0;
        
        do {
            System.out.println("\n=== KALKULATOR POLA BILANGAN ===");
            System.out.println("1. Fibonacci");
            System.out.println("2. Faktorial");
            System.out.println("3. Segitiga Pascal");
            System.out.println("4. Keluar");
            System.out.print("\nPilihan Anda: ");
            
            // Validasi input menu
            if (!scanner.hasNextInt()) {
                System.out.println("Error: Input harus berupa angka!");
                scanner.next(); // Clear invalid input
                continue;
            }
            
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai n: ");
                    if (scanner.hasNextInt()) {
                        int n1 = scanner.nextInt();
                        if (validasiInput(n1, "fibonacci")) {
                            System.out.println("F(" + n1 + ") = " + fibonacci(n1));
                        }
                    } else {
                        System.out.println("Error: Input harus berupa angka!");
                        scanner.next(); // Clear invalid input
                    }
                    break;
                    
                case 2:
                    System.out.print("Masukkan nilai n: ");
                    if (scanner.hasNextInt()) {
                        int n2 = scanner.nextInt();
                        if (validasiInput(n2, "faktorial")) {
                            long hasil = faktorial(n2);
                            if (hasil != -1) {
                                System.out.println(n2 + "! = " + hasil);
                            } else {
                                System.out.println("Error: Faktorial tidak terdefinisi untuk bilangan negatif!");
                            }
                        }
                    } else {
                        System.out.println("Error: Input harus berupa angka!");
                        scanner.next(); // Clear invalid input
                    }
                    break;
                    
                case 3:
                    System.out.print("Masukkan nilai n: ");
                    if (scanner.hasNextInt()) {
                        int n3 = scanner.nextInt();
                        if (validasiInput(n3, "pascal")) {
                            if (n3 <= 15) { // Batasi untuk menghindari stack overflow
                                tampilkanPascal(n3);
                            } else {
                                System.out.println("Error: Nilai terlalu besar untuk Segitiga Pascal!");
                            }
                        }
                    } else {
                        System.out.println("Error: Input harus berupa angka!");
                        scanner.next(); // Clear invalid input
                    }
                    break;
                    
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                    
                default:
                    System.out.println("Error: Pilihan tidak valid! Pilih 1-4.");
            }
            
        } while (pilihan != 4);
        
        scanner.close();
    }
}