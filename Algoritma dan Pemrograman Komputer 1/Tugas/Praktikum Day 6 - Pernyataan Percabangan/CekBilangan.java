import java.util.Scanner;

/**
 * Program untuk mengecek bilangan dengan menggunakan pernyataan break, continue, dan return
 * - RETURN: Keluar dari program jika bilangan <= 0
 * - CONTINUE: Melewatkan bilangan genap
 * - BREAK: Berhenti setelah mencetak 10 bilangan ganjil
 */
public class CekBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan positif: ");
        int num = input.nextInt();
        
        // LENGKAPI 1: Gunakan RETURN jika bilangan <= 0
        if (num <= 0) {
            System.out.println("Program selesai.");
            input.close();
            return; // Keluar dari program jika bilangan tidak positif
        }
        
        System.out.println("Bilangan ganjil 1 sampai " + num + ":");
        int count = 0; // Counter untuk menghitung jumlah bilangan ganjil yang sudah dicetak
        
        for (int i = 1; i <= num; i++) {
            // LENGKAPI 2: Gunakan CONTINUE untuk melewatkan bilangan genap
            if (i % 2 == 0) {
                continue; // Lewati bilangan genap
            }
            
            System.out.print(i + " ");
            count++;
            
            // LENGKAPI 3: Gunakan BREAK jika sudah mencetak 10 bilangan
            if (count >= 10) {
                break; // Berhenti setelah mencetak 10 bilangan ganjil
            }
        }
        
        input.close();
        System.out.println("\nProgram selesai.");
    }
}