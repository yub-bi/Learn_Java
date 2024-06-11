public class Test6_11_Person {

  // 상태, 데이터, 변수
  String name;
  int phoneNumber;
  int money;
  int age;

  // 생성자
  public Test6_11_Person(String name, int phoneNumber, int money, int age) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.money = money;
    this.age = age;
  }

  // 기능
  public void sayHello() {
    System.out.println("my name is " + name);
  }

  public void sayMoney() {
    System.out.println("내가 가지고 있는 돈은 " + money * 10000 + "야!");
  }

  public void teaching(Test6_11_Student student) {
    student.levelUp();
  }

  public void cheating(Test6_11_Student student) {
    student.levelDown();
  }
}
