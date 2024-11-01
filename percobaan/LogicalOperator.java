/**
 * LogicalOperator.java
 * 231232028 - Falmesino Abdul Hamid
 * Percobaan 5 - Melakukan operasi logical operator
 */

 class LogicalOperator {
  public static void main (String args[]) {
   int x = 7;
   int y = 11;
   int z = 11;

   System.out.println("x = " + x);  // 7
   System.out.println("y = " + y);  // 11
   System.out.println("z = " + z);  // 11
   
   System.out.println("x < y = " + (x < y));    // true
   System.out.println("x > z = " + (x > z));    // false
   System.out.println("x <= z = " + (x <= z));  // true
   System.out.println("x >= y = " + (x >= y));  // false
   System.out.println("y == z = " + (y == z));  // true
   System.out.println("x ! y = " + (x != z));   // true
  }
}