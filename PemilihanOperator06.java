import java.util.Scanner;

public class PemilihanOperator06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil = 0;
        char operator;
        
        System.out.print("Masukkan angka 1: ");
        angka1 = input.nextDouble();
        
        System.out.print("Masukkan angka 2: ");
        angka2 = input.nextDouble();
        
        System.out.print("Masukkan operator (+ - * /): ");
        operator = input.next().charAt(0);

        if (operator == '+') {
            hasil = angka1 + angka2;
        } else if (operator == '-') {
            hasil = angka1 - angka2;
        } else if (operator == '*') {
            hasil = angka1 * angka2;
        } else if (operator == '/') {
            hasil = angka1 / angka2;
        } else {
            System.out.println("Operator yang dipilih tidak sesuai.");
            return;
        }

        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
