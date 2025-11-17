import java.util.Scanner;

/**
 * Program menu sederhana dengan validasi menggunakan break, continue, dan return
 * - CONTINUE: Meminta input ulang jika pilihan menu tidak valid
 * - RETURN: Keluar program jika input menu invalid 3 kali
 * - BREAK: Keluar dari loop setelah menampilkan bilangan
 */
public class MenuBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kesalahan = 0; // Counter untuk menghitung jumlah kesalahan input
        
        System.out.println("=== PROGRAM MENU BILANGAN ===");
        
        while (true) {
            // Menampilkan menu
            System.out.println("1. Tampilkan bilangan genap");
            System.out.println("2. Tampilkan bilangan ganjil");
            System.out.println("3. Keluar");
            System.out.print("\nPilihan Anda: ");
            
            int pilihan;
            
            // Validasi input harus berupa integer
            if (!scanner.hasNextInt()) {
                System.out.println("Input harus berupa angka! Coba lagi.\n");
                scanner.next(); // Clear invalid input
                kesalahan++;
                
                // RETURN jika sudah 3 kali salah input
                if (kesalahan >= 3) {
                    System.out.println("Terlalu banyak kesalahan input. Program dihentikan.");
                    scanner.close();
                    return;
                }
                continue; // Minta input ulang
            }
            
            pilihan = scanner.nextInt();
            
            // Validasi pilihan menu
            if (pilihan < 1 || pilihan > 3) {
                System.out.println("Input tidak valid! Coba lagi.\n");
                kesalahan++;
                
                // RETURN jika sudah 3 kali salah input
                if (kesalahan >= 3) {
                    System.out.println("Terlalu banyak kesalahan input. Program dihentikan.");
                    scanner.close();
                    return;
                }
                continue; // Minta input ulang
            }
            
            // Reset counter kesalahan jika input valid
            kesalahan = 0;
            
            // Proses pilihan menu
            switch (pilihan) {
                case 1:
                    // Menampilkan bilangan genap
                    System.out.print("Bilangan genap: ");
                    for (int i = 2; i <= 20; i += 2) {
                        System.out.print(i + " ");
                    }
                    System.out.println("\n");
                    break; // Keluar dari switch, tetap dalam loop menu
                    
                case 2:
                    // Menampilkan bilangan ganjil
                    System.out.print("Bilangan ganjil: ");
                    for (int i = 1; i <= 20; i += 2) {
                        System.out.print(i + " ");
                    }
                    System.out.println("\n");
                    break; // Keluar dari switch, tetap dalam loop menu
                    
                case 3:
                    // Keluar dari program
                    System.out.println("Terima kasih!");
                    scanner.close();
                    return; // Keluar dari program
            }
        }
    }
}