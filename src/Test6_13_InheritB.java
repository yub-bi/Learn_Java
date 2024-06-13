public class Test6_13_InheritB extends Test6_13_InheritA {
  String field2;

  public Test6_13_InheritB(int field1, int s1) {
    super(field1, s1); // Test6_13_InheritA(field1, s1);
  }

  void method2() {
    System.out.println("InheritB.method2 filed = " + field2);
  }
}
