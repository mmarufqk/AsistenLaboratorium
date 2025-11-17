import java.util.Scanner;

/**
 * Program untuk menghasilkan berbagai deret matematika berdasarkan input n
 * Deret yang dihasilkan:
 * 1. Deret bilangan ganjil (FOR loop)
 * 2. Deret bilangan genap (WHILE loop)
 * 3. Deret Fibonacci (DO-WHILE loop)
 * 4. Deret kuadrat (FOR loop)
 */
public class GeneratorDeretMatematika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input nilai n
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        
        System.out.println("\n=== GENERATOR DERET MATEMATIKA ===");
        
        // 1. Deret bilangan ganjil (FOR loop)
        System.out.print("Deret ganjil (FOR)   : ");
        for (int k = 1; k <= n; k++) {
            int suku = 2 * k - 1; // Rumus: a_k = 2k - 1
            System.out.print(suku);
            if (k < n) System.out.print(" ");
        }
        System.out.println();
        
        // 2. Deret bilangan genap (WHILE loop)
        System.out.print("Deret genap (WHILE)  : ");
        int k = 1;
        while (k <= n) {
            int suku = 2 * k; // Rumus: a_k = 2k
            System.out.print(suku);
            if (k < n) System.out.print(" ");
            k++;
        }
        System.out.println();
        
        // 3. Deret Fibonacci (DO-WHILE loop)
        System.out.print("Deret fibonacci (DO) : ");
        if (n >= 1) {
            int fib1 = 1, fib2 = 1;
            int count = 1;
            
            do {
                if (count == 1) {
                    System.out.print(fib1);
                } else if (count == 2) {
                    System.out.print(" " + fib2);
                } else {
                    int fibNext = fib1 + fib2;
                    System.out.print(" " + fibNext);
                    fib1 = fib2;
                    fib2 = fibNext;
                }
                
                if (count < n && count >= 2) {
                    System.out.print(" ");
                }
                count++;
            } while (count <= n);
        }
        System.out.println();
        
        // 4. Deret kuadrat (FOR loop)
        System.out.print("Deret kuadrat        : ");
        for (int i = 1; i <= n; i++) {
            int suku = i * i; // Rumus: a_k = k^2
            System.out.print(suku);
            if (i < n) System.out.print(" ");
        }
        System.out.println();
        
        scanner.close();
    }
}