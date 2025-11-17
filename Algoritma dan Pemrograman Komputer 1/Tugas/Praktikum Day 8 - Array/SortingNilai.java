import java.util.Scanner;

/**
 * Program untuk mengimplementasikan algoritma sorting pada array nilai
 * Menggunakan algoritma selection sort untuk mengurutkan nilai
 */
public class SortingNilai {
    
    // Method untuk input nilai dari pengguna
    public static int[] inputNilai(Scanner input) {
        System.out.print("Masukkan jumlah nilai: ");
        int jumlah = input.nextInt();
        
        // Validasi jumlah data
        while (jumlah <= 0) {
            System.out.print("Jumlah data harus lebih dari 0. Masukkan kembali: ");
            jumlah = input.nextInt();
        }
        
        int[] array = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + ": ");
            // Input nilai ke dalam array
            array[i] = input.nextInt();
        }
        return array;
    }
    
    // Method untuk sorting array menggunakan algoritma selection sort
    public static void sortingArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // Kondisi if untuk membandingkan nilai
                if (array[i] > array[j]) {
                    // Proses penukaran nilai
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    // Method untuk menampilkan array dengan format yang rapi
    public static void tampilkanArray(String pesan, int[] array) {
        System.out.print(pesan + ": [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Panggil method inputNilai
        int[] array = inputNilai(input);
        
        // Panggil method tampilkanArray untuk array sebelum sorting
        tampilkanArray("Array sebelum sorting", array);
        
        // Panggil method sortingArray
        sortingArray(array);
        
        // Panggil method tampilkanArray untuk array setelah sorting
        tampilkanArray("Array setelah sorting", array);
        
        input.close();
    }
}