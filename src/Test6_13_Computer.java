public class Test6_13_Computer extends Test6_13_Calculator {

  @Override
  double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle 메서드 실행");
     return Math.PI * r * r;
  }

  @Override
  void say() {
    System.out.println("임의적인 새로운 문자열");
  }
}
