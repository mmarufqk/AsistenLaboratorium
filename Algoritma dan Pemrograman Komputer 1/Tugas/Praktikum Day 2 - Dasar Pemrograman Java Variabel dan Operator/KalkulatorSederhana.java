import java.util.Scanner;

/**
 * Program kalkulator sederhana yang menerima dua bilangan dan operator aritmatika
 * kemudian menampilkan hasil operasinya.
 * Mendukung operator: +, -, *, /, %
 * Dengan penanganan error untuk pembagian oleh nol
 */
public class KalkulatorSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();
        
        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();
        
        double hasil = 0;
        boolean valid = true;
        
        // Melakukan operasi berdasarkan operator yang dimasukkan
        switch (operator) {
            case '+':
                hasil = bilangan1 + bilangan2;
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                break;
            case '/':
                // Penanganan error untuk pembagian oleh nol
                if (bilangan2 != 0) {
                    hasil = bilangan1 / bilangan2;
                } else {
                    System.out.println("Error: Pembagian oleh nol tidak diperbolehkan!");
                    valid = false;
                }
                break;
            case '%':
                // Penanganan error untuk modulus oleh nol
                if (bilangan2 != 0) {
                    hasil = bilangan1 % bilangan2;
                } else {
                    System.out.println("Error: Modulus oleh nol tidak diperbolehkan!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid!");
                valid = false;
        }
        
        // Menampilkan hasil jika operasi valid
        if (valid) {
            System.out.println("Hasil: " + hasil);
        }
        
        scanner.close();
    }
}