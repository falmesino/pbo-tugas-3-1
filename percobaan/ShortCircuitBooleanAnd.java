/**
 * ShortCircuitBooleanAnd.java
 * 231232028 - Falmesino Abdul Hamid
 * Percobaan 7 - Menggunakan operator boolean and short-circuit
 */

 class ShortCircuitBooleanAnd {
  public static void main (String args[]) {
   int a = 5;
   int b = 7;
   
   if ((a < 2) && (b++ < 10)) b += 2; // 7
   // Jika a lebih kecil dari 2 dan b ditambah 1 lebih kecil dari 10, maka b ditambah 2
   // Hasilnya 7 karena a nilainya 5 yang mana tidak lebih kecil dari 2
   System.out.println(b);
  }
}