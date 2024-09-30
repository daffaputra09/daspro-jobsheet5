import java.util.Scanner;

public class PemilihanSwitch {
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

         switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
         }
         System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
