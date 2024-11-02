public class OperatorLogika {
  public static void main(String args[]) {
    boolean x = true;
    boolean y = false;

    // Operator "&&" (Logika AND)
    System.out.println("x && y : " + (x && y));
    // false, karena y bernilai false

    // Operator "||" (Logika OR)
    System.out.println("x || y : " + (x || y));
    // true, karena x bernilai true

    // Operator "!" (Logika NOT)
    System.out.println("!x : " + (!x));
    // false, karena x bernilai true, dan NOT membalik nilainya
    System.out.println("!y : " + (!y));
    // true, karena y bernilai false, dan NOT membalik nilainya
  }
}