public class OperatorPenugasan {
  public static void main (String args[]) {
    int angka = 10;

    // Operator "=" (Pengisian Nilai)
    angka = 20; // angka sekarang bernilai 20
    System.out.println("angka = : " + angka);

    // Operator "+=" (Pengisian dan Penambahan)
    angka += 5; // angka sekarang bernilai 25 (20 + 5)
    System.out.println("angka += 5 : " + angka);

    // Operator "-=" (Pengisian dan Pengurangan)
    angka -= 3; // angka sekarang bernilai 22 (25 - 3)
    System.out.println("angka -= 3: " + angka);

    // Operator "*=" (Pengisian dan Perkalian)
    angka *= 2; // angka sekarang bernilai 44 (22 * 2)
    System.out.println("angka *= 2: " + angka);

    // Operator "/=" (Pengisian dan Pembagian)
    angka /= 4; // angka sekarang bernilai 11 (44 / 4)
    System.out.println("angka /= 4: " + angka);

    // Operator "%=" (Pengisian dan Sisa hasil bagi)
    angka %= 3; // angka sekarang bernilai 2 (11 % 3)
    System.out.println("angka %= 3: " + angka);
  }
}
