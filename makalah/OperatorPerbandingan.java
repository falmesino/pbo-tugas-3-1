public class OperatorPerbandingan {
  public static void main (String args[]) {
    int a = 10;
    int b = 20;

    // Operator "<" (Lebih kecil dari)
    System.out.println("a < b : " + (a < b));
    // true karena 10 < 20

    // Operator ">" (Lebih besar dari)
    System.out.println("a > b : " + (a > b));
    // false karena 10 tidak lebih besar dari 20

    // Operator ">=" (Lebih besar dari atau sama dengan)
    System.out.println("a >= b : " + (a >= b));
    // false karena 10 tidak lebih besar atau sama dengan 20

    // Operator "<=" (Lebih kecil dari atau sama dengan)
    System.out.println("a <= b : " + (a <= b));
    // true karena 10 lebih kecil dari atau sama dengan 20

    // Operator "==" (Sama dengan)
    System.out.println("a == b : " + (a == b));
    // false karena 10 tidak sama dengan 20

    // Operator "!=" (Tidak sama dengan)
    System.out.println("a != b : " + (a != b));
    // true karena 10 tidak sama dengan 20
  }
}