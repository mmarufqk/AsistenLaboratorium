import java.util.Scanner;

/**
 * Program untuk mengonversi suhu dari Celsius ke Fahrenheit, Reamur, dan Kelvin
 * Dengan rumus:
 * Fahrenheit = Celsius × 9/5 + 32
 * Reamur = Celsius × 4/5  
 * Kelvin = Celsius + 273
 */
public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input suhu dalam Celsius
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Melakukan konversi ke berbagai skala suhu
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        double reamur = celsius * 4.0 / 5.0;
        double kelvin = celsius + 273;
        
        // Menampilkan hasil konversi dengan format sesuai contoh
        System.out.println(celsius + "°C = " + fahrenheit + "°F");
        System.out.println(celsius + "°C = " + reamur + "°R");
        System.out.println(celsius + "°C = " + kelvin + "K");
        
        scanner.close();
    }
}