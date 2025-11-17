import java.util.Scanner;

/**
 * Program petualangan Java mencari harta karun
 * Mengimplementasikan berbagai method untuk simulasi petualangan
 */
public class PetualanganJava {
    private static int energi = 100;
    private static int jarak = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PETUALANGAN JAVA ===");
        System.out.println("Energi awal: " + energi);

        // LENGKAPI 1: Panggil method tampilkanPeta()
        tampilkanPeta();

        while (energi > 0 && jarak < 50) {
            System.out.println("\nEnergi: " + energi + " | Jarak: " + jarak + "/50");
            System.out.print("Aksi (1=Jalan, 2=Istirahat, 3=Petunjuk): ");
            
            // Validasi input
            if (!input.hasNextInt()) {
                System.out.println("Error: Input harus berupa angka!");
                input.next(); // Clear invalid input
                continue;
            }
            
            int aksi = input.nextInt();

            // LENGKAPI 2: Gunakan switch-case untuk aksi
            switch (aksi) {
                case 1:
                    int langkah = jalan();
                    jarak += langkah;
                    System.out.println("Anda berjalan " + langkah + " langkah!");
                    break;
                    
                case 2:
                    istirahat();
                    break;
                    
                case 3:
                    String petunjuk = cariPetunjuk();
                    System.out.println("Petunjuk: " + petunjuk);
                    break;
                    
                default:
                    System.out.println("Aksi tidak valid! Pilih 1, 2, atau 3.");
            }

            System.out.println("Energi sekarang: " + energi);

            if (energi <= 20 && energi > 0) {
                System.out.println("Energi menipis! Disarankan istirahat.");
            }

            if (energi <= 0) {
                System.out.println("\nGame Over! Energi habis.");
                break;
            }

            if (cekHarta()) {
                System.out.println("\nSELAMAT! Harta ditemukan!");
                break;
            }
        }

        input.close();
    }

    public static void tampilkanPeta() {
        // LENGKAPI 3: Cetak peta perjalanan Java
        System.out.println("\nPETA:");
        System.out.println("Start [ ]-[ ]-[ ]-[ ]-[ ]-[HARTA]");
        System.out.println("      0   10  20  30  40   50");
    }

    public static int jalan() {
        // LENGKAPI 4: Generate langkah 1-10
        int langkah = (int)(Math.random() * 10) + 1;
        
        // LENGKAPI 5: Energi berkurang 5-15, energi tidak boleh negatif
        int energiDikurangi = (int)(Math.random() * 11) + 5; // 5-15
        if (energiDikurangi > energi) {
            energiDikurangi = energi; // Jangan sampai energi negatif
        }
        energi -= energiDikurangi;
        
        // LENGKAPI 6: Tampilkan berapa langkah dan energi berkurang
        System.out.print("Anda berjalan " + langkah + " langkah! (-" + energiDikurangi + " energi)");
        
        return langkah;
    }

    public static void istirahat() {
        // LENGKAPI 7: Tambah energi 20-40, maksimal 100
        int energiDitambah = (int)(Math.random() * 21) + 20; // 20-40
        energi += energiDitambah;
        
        // Batasi energi maksimal 100
        if (energi > 100) {
            energiDitambah -= (energi - 100); // Hitung berapa yang benar-benar ditambah
            energi = 100;
        }
        
        // LENGKAPI 8: Cetak pesan energi bertambah
        System.out.println("Anda beristirahat dan energi bertambah " + energiDitambah + " point!");
    }

    public static String cariPetunjuk() {
        // LENGKAPI 9: Energi berkurang 10
        int energiDikurangi = 10;
        if (energiDikurangi > energi) {
            energiDikurangi = energi;
        }
        energi -= energiDikurangi;
        
        // LENGKAPI 10: Return petunjuk acak dari array string
        String[] petunjuk = {
            "Terus maju hingga jarak 50!",
            "Jangan lupa istirahat saat energi menipis!",
            "Harta karun berada di jarak 50 satuan!",
            "Setiap langkah membutuhkan energi!",
            "Gunakan aksi 'Istirahat' untuk mengisi energi!",
            "Hati-hati dengan energi yang tersisa!",
            "Petualangan masih panjang, jaga energimu!",
            "Harta karun sudah dekat, semangat!"
        };
        int index = (int)(Math.random() * petunjuk.length);
        return petunjuk[index];
    }
    
    public static boolean cekHarta() {
        // LENGKAPI 11: return true jika jarak >= 50
        return jarak >= 50;
    }
}