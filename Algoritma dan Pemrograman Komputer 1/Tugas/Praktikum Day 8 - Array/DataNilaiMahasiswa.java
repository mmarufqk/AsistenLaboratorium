import java.util.Scanner;

/**
 * Program untuk mengelola dan menganalisis data nilai mahasiswa menggunakan array
 * Program membantu Sahroni dalam tugas sebagai asisten laboratorium
 */
public class DataNilaiMahasiswa {
    
    // Method untuk input jumlah mahasiswa
    public static int inputJumlahMahasiswa(Scanner input) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        
        // Validasi jumlah mahasiswa
        while (jumlah <= 0) {
            System.out.print("Jumlah mahasiswa harus lebih dari 0. Masukkan kembali: ");
            jumlah = input.nextInt();
        }
        
        return jumlah;
    }
    
    // Method untuk deklarasi dan input nilai ke dalam array
    public static int[] inputNilaiMahasiswa(Scanner input, int jumlah) {
        int[] nilai = new int[jumlah]; // Deklarasi array nilai
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai mahasiswa " + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            
            // Validasi nilai (opsional, bisa disesuaikan dengan range nilai)
            while (nilai[i] < 0 || nilai[i] > 100) {
                System.out.print("Nilai harus antara 0-100. Masukkan kembali: ");
                nilai[i] = input.nextInt();
            }
        }
        
        return nilai;
    }
    
    // Method untuk menghitung rata-rata nilai
    public static double hitungRataRata(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return (double) total / nilai.length;
    }
    
    // Method untuk mencari nilai tertinggi
    public static int cariNilaiTertinggi(int[] nilai) {
        int max = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        return max;
    }
    
    // Method untuk mencari nilai terendah
    public static int cariNilaiTerendah(int[] nilai) {
        int min = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        return min;
    }
    
    // Method untuk menampilkan array nilai
    public static void tampilkanNilai(int[] nilai) {
        System.out.print("Nilai: [");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(nilai[i]);
            if (i < nilai.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Method untuk menampilkan semua hasil analisis
    public static void tampilkanHasil(int[] nilai, double rataRata, int max, int min) {
        System.out.println("\n=== HASIL ANALISIS ===");
        tampilkanNilai(nilai);
        System.out.println("Rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input jumlah mahasiswa
        int jumlah = inputJumlahMahasiswa(input);
        
        // Deklarasi dan input array nilai
        int[] nilai = inputNilaiMahasiswa(input, jumlah);
        
        // Hitung rata-rata
        double rataRata = hitungRataRata(nilai);
        
        // Cari nilai tertinggi
        int max = cariNilaiTertinggi(nilai);
        
        // Cari nilai terendah
        int min = cariNilaiTerendah(nilai);
        
        // Tampilkan semua hasil
        tampilkanHasil(nilai, rataRata, max, min);
        
        input.close();
    }
}