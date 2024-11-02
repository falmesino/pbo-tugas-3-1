public class OperatorIncrementDecrement {
  public static void main(String[] args) {
    int nilai = 10;

    // Operator "++" (Increment, nilai bertambah 1)
    System.out.println("nilai awal : " + nilai);
    nilai++; // nilai sekarang 11
    System.out.println("nilai setelah nilai++ : " + nilai);

    // Operator "--" (Decrement, nilai berkurang 1)
    nilai--; // nilai sekarang 10 lagi
    System.out.println("nilai setelah nilai-- : " + nilai);

    // Pre-increment
    System.out.println("++nilai : " + (++nilai));
    // nilai langsung bertambah menjadi 11

    // Post-increment
    System.out.println("nilai++ : " + (nilai++));
    // nilai ditampilkan 11, lalu bertambah menjadi 12

    // Pre-decrement
    System.out.println("--nilai : " + (--nilai));
    // nilai langsung berkurang menjadi 11

    // Post-decrement
    System.out.println("nilai-- : " + (nilai--));
    // nilai ditampilkan 11, lalu berkurang menjadi 10
  }
}
