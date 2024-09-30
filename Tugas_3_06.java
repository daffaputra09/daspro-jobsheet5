import java.util.Scanner;

public class Tugas_3_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int umur;
        String kategori;

        while (true) {
            System.out.print("Masukkan Umur: ");
            if (scanner.hasNextInt()) {
                umur = scanner.nextInt();
                if (umur >= 0) {
                    break;
                } else {
                    System.out.println("Terjadi kesalahan, anda tidak boleh memasukkan angka negatif.");
                }
            } else {
                System.out.println("Masukkan angka yang valid");
                scanner.next(); 
            }
        }
        
        if (umur >= 0 && umur <= 12) {
            kategori = "Anak";
        } else if (umur <= 19) {
            kategori = "Remja";
        } else if (umur <= 64) {
            kategori = "Dewasa";
        } else {
            kategori = "Lansia";
        }
        System.out.println("Kategori Umur: " + kategori);
    }
}