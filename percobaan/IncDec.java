/**
 * IncDec.java
 * 231232028 - Falmesino Abdul Hamid
 * Percobaan 1 - Melakukan increment dan decrement nilai
 */

class IncDec {
  public static void main (String args[]) {
    int x = 8;
    int y = 13;
    
    System.out.println("x = " + x);   // x = 8
    System.out.println("y = " + y);   // x = 13
    System.out.println("x = " + ++x); // x = 9
    System.out.println("y = " + y++); // x = 13
    System.out.println("x = " + x--); // x = 9
    System.out.println("y = " + --y); // x = 13
  }
}