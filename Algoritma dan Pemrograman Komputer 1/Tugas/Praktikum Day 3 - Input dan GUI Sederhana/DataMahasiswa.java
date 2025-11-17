import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Program untuk menginput data mahasiswa (nama, NRP, IPK) menggunakan Scanner
 * dan menampilkannya dalam GUI menggunakan JOptionPane
 */
public class DataMahasiswa {
    public static void main(String[] args) {
        // [1] Deklarasi Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        // [2] Baca input nama (String) 
        String nama = input.nextLine();
        
        System.out.print("Masukkan NRP: ");
        // [3] Baca input NRP (String)
        String nrp = input.nextLine();
        
        System.out.print("Masukkan IPK: ");
        // [4] Baca input IPK (double)
        double ipk = input.nextDouble();
        
        // [5] Format output
        String hasil = "Nama: " + nama + 
                      "\nNRP: " + nrp + 
                      "\nIPK: " + ipk;
        
        // [6] Tampilkan di JOptionPane
        JOptionPane.showMessageDialog(null, hasil, "Data Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
        
        input.close();
    }
}