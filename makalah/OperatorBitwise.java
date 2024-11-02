public class OperatorBitwise {
  public static void main (String args[]) {
    int a = 5;    // 0101 dalam biner
    int b = 3;    // 0011 dalam biner

    // Operator "&" (Bitwise AND)
    System.out.println("a & b : " + (a & b));
    // 0101 & 0011 = 0001 (1 dalam desimal)

    // Operator "|" (Bitwise OR)
    System.out.println("a | b : " + (a | b));
    // 0101 | 0011 = 0111 (7 dalam desimal)

    // Operator "^" (Bitwise XOR)
    System.out.println("a ^ b : " + (a ^ b));
    // 0101 ^ 0011 = 0110 (6 dalam desimal)

    // Operator "~" (Bitwise NOT)
    System.out.println("~a : " + (~a));
    // ~0101 = 1010 (dalam sistem dua's complement, hasilnya -6)

    // Operator "<<" (Left Shift)
    System.out.println("a << 1 : " + (a << 1));
    // 0101 << 1 = 1010 (10 dalam desimal)

    // Operator ">>" (Right Shift)
    System.out.println("a >> 1 : " + (a >> 1));
    // 0101 >> 1 = 0010 (2 dalam desimal)

    // Operator ">>>" (Unsigned Right Shift)
    System.out.println("a >>> 1 : " + (a >>> 1));
    // 0101 >>> 1 = 0010 (2 dalam desimal)
  }
}
