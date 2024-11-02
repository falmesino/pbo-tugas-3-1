/**
 * 231232028 - Falmesino Abdul Hamid
 * 
 * Latihan 2
 * Menampilkan representasi biner dari bilangan desimal bertipe byte
 * 
 * Contoh Tampilan:
 * 5: 00000101
 * -5: 11111011
 * 127: 01111111
 * 
 * -19: 11101101 (Tugas 1)
 */

import java.util.Scanner;
public class Latihan2 {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);

    // Mengambil angka dari input
    System.out.println("Masukan nilai desimal bertipe byte: ");
    byte input = scanner.nextByte();

    // Konversi ke biner, 0xFF 8-bit
    String convert = Integer.toBinaryString(input & 0xFF);
    System.out.println("toBinaryString: " + convert);

    // Menambahkan angka 0 di depan, %8s = 8-bit
    String output = String.format("%8s", convert).replace(' ', '0');
    System.out.println("Representasi biner dari bilangan desimal (" + input + ") adalah: " + output);

    scanner.close();
  }
}
