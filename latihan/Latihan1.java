import java.util.Scanner;

/**
 * 231232028 - Falmesino Abdul Hamid
 * 
 * Latihan 1
 * Menampilkan representasi biner dari bilangan desimal bertipe int.
 * Buatlah suatu program untuk menampilkan susunan bit dari suatu bilangan desimal.
 * Nilai bilangan input yang dimasukkan adalah bertipe int.
 * 
 * Contoh Tampilan:
 * Masukkan nilai desimal: 13
 * Susunan bit dari 13 adalah 00000000000000000000000000001101
 * Masukkan nilai desimal: 612
 * Susunan bit dari 13 adalah 00000000000000000000001001100100
 * Masukkan nilai desimal: -1
 * Susunan bit dari 13 adalah 11111111111111111111111111111111
 * Masukkan nilai desimal: -13
 * Susunan bit dari 13 adalah 11111111111111111111111111110011
 */

public class Latihan1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Mengambil angka dari input
    System.out.println("Masukan nilai desimal: ");
    int input = scanner.nextInt();

    // Konversi ke biner
    String convert = Integer.toBinaryString(input);
    // System.out.println("toBinaryString: " + convert);

    // Menambahkan angka 0 di depan, %32s = 32-bit
    String output = String.format("%32s", convert).replace(' ', '0');
    System.out.println("Representasi biner dari bilangan desimal (" + input + ") adalah: " + output);

    scanner.close();
  }
}
