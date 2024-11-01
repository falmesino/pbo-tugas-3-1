/**
 * ShortCircuitBooleanOr.java
 * 231232028 - Falmesino Abdul Hamid
 * Percobaan 9 - Melakukan boolean or short-circuit
 */

 class ShortCircuitBooleanOr {
  public static void main (String args[]) {
   int a = 5;
   int b = 7;
   
   if ((a < 2) || (b++ < 10)) b += 2; // 10
   System.out.println(b);
  }
}