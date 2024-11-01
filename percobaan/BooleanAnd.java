/**
 * BooleanAnd.java
 * 231232028 - Falmesino Abdul Hamid
 * Percobaan 6 - Menggunakan operator boolean and
 */

 class BooleanAnd {
  public static void main (String args[]) {
   int a = 5;
   int b = 7;
   
   if ((a < 2) & (b++ < 10)) b += 2; // 8
   System.out.println(b);
  }
}