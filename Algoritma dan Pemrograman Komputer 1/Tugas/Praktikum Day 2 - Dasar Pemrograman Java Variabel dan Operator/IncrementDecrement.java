/**
 * Program yang menunjukkan perbedaan antara prefix dan postfix increment/decrement
 * Demonstrasi perbedaan perilaku operator ++ dan -- ketika digunakan sebagai prefix dan postfix
 */
public class IncrementDecrement {
    public static void main(String[] args) {
        // Inisialisasi variabel
        int a = 5;
        
        System.out.println("Nilai awal a = " + a);
        
        // Demonstrasi postfix increment (a++)
        System.out.println("Setelah a++: " + a++); // Nilai ditampilkan dulu, kemudian ditambah
        
        // Demonstrasi prefix increment (++a)  
        System.out.println("Setelah ++a: " + ++a); // Nilai ditambah dulu, kemudian ditampilkan
        
        // Demonstrasi postfix decrement (a--)
        System.out.println("Setelah a--: " + a--); // Nilai ditampilkan dulu, kemudian dikurangi
        
        // Demonstrasi prefix decrement (--a)
        System.out.println("Setelah --a: " + --a); // Nilai dikurangi dulu, kemudian ditampilkan
        
        // Penjelasan tambahan untuk kejelasan
        System.out.println("\nPenjelasan:");
        System.out.println("a++ : gunakan nilai a, lalu tambah 1");
        System.out.println("++a : tambah 1, lalu gunakan nilai a"); 
        System.out.println("a-- : gunakan nilai a, lalu kurangi 1");
        System.out.println("--a : kurangi 1, lalu gunakan nilai a");
    }
}