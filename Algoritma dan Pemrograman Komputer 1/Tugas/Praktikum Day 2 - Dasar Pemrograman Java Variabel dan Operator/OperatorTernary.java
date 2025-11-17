import java.util.Scanner;

/**
 * Program yang menerima dua bilangan dan menggunakan operator ternary
 * untuk menentukan dan menampilkan bilangan yang lebih besar
 */
public class OperatorTernary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dua bilangan dari pengguna
        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = scanner.nextDouble();
        
        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = scanner.nextDouble();
        
        // Menggunakan operator ternary untuk menentukan bilangan yang lebih besar
        double bilanganTerbesar = (bilangan1 > bilangan2) ? bilangan1 : bilangan2;
        
        // Menampilkan hasil
        System.out.println("Bilangan yang lebih besar adalah: " + bilanganTerbesar);
        
        scanner.close();
    }
}