public class Test6_10 {
  public static void main(String[] args) {
    int n = 3;
    System.out.println(sourSweet(n));
  }

  static String sourSweet(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
      return "새콤달콤";
    } else if (n % 3 == 0) {
      return "새콤";
    } else if (n % 5 == 0) {
      return "달콤";
    } else {
      return n + "!";
    }
  }
}
