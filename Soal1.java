import java.util.InputMismatchException;
import java.util.Scanner;

/*CONTOH INPUT
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
*/

public class Soal1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input pengguna
        Scanner input = new Scanner(System.in);

        // Menyimpan banyak angka yang akan diinput
        int testCase = input.nextInt();

        // Membuat jarak antar baris
        System.out.print("\n\n");

        // Perulangan untuk menerima input sebanyak testCase
        for (int i = 0; i < testCase; i++) {
            try {
                // Mencoba membaca input sebagai long
                long angka = input.nextLong();  // Menggunakan nextLong untuk angka besar
                input.nextLine();

                // Mengecek apakah angka bisa dimasukkan dalam tipe data short, int, atau long
                System.out.println(angka + " can be fitted in:");
                if (angka >= Short.MIN_VALUE && angka < Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (angka >= Integer.MIN_VALUE && angka < Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (InputMismatchException e) {
                // Menangkap error jika input tidak bisa dibaca sebagai long
                String angka = input.nextLine();  // Membaca sisa input untuk menangani exception
                System.out.println(angka + " can't be fitted anywhere");
                input.nextLine();
                input.nextLine();
            }
        }

        // Menutup Scanner setelah selesai digunakan
        input.close();
    }
}