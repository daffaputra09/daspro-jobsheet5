import java.util.Scanner;

public class Tugas_1_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = input.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = input.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = input.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM " + nim + ")" + " kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }

        System.out.println("Nilai Akhir Huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
