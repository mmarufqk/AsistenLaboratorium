import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 * Program kalkulator sederhana yang menggunakan BufferedReader untuk input bilangan
 * dan JOptionPane untuk input operator serta menampilkan hasil
 */
public class KalkulatorGUI {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Input bilangan pertama melalui konsol (BufferedReader)
            System.out.print("Masukkan bilangan pertama: ");
            double bilangan1 = Double.parseDouble(reader.readLine());
            
            // Input bilangan kedua melalui konsol (BufferedReader)
            System.out.print("Masukkan bilangan kedua: ");
            double bilangan2 = Double.parseDouble(reader.readLine());
            
            // Input operator melalui JOptionPane
            String operator = JOptionPane.showInputDialog(null, 
                "Masukkan operator (+, -, *, /):", 
                "Input Operator", 
                JOptionPane.QUESTION_MESSAGE);
            
            double hasil = 0;
            boolean valid = true;
            String operasi = "";
            
            // Melakukan operasi berdasarkan operator
            if (operator == null) {
                JOptionPane.showMessageDialog(null, "Operasi dibatalkan", "Info", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            switch (operator) {
                case "+":
                    hasil = bilangan1 + bilangan2;
                    operasi = bilangan1 + " + " + bilangan2 + " = " + hasil;
                    break;
                case "-":
                    hasil = bilangan1 - bilangan2;
                    operasi = bilangan1 + " - " + bilangan2 + " = " + hasil;
                    break;
                case "*":
                    hasil = bilangan1 * bilangan2;
                    operasi = bilangan1 + " * " + bilangan2 + " = " + hasil;
                    break;
                case "/":
                    if (bilangan2 != 0) {
                        hasil = bilangan1 / bilangan2;
                        operasi = bilangan1 + " / " + bilangan2 + " = " + hasil;
                    } else {
                        operasi = "Error: Pembagian oleh nol tidak diperbolehkan!";
                        valid = false;
                    }
                    break;
                default:
                    operasi = "Error: Operator tidak valid!";
                    valid = false;
            }
            
            // Menampilkan hasil melalui JOptionPane
            if (valid) {
                JOptionPane.showMessageDialog(null, operasi, "Hasil Kalkulasi", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, operasi, "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error membaca input: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}