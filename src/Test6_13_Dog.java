public class Test6_13_Dog extends Test6_13_Animal {
  int age;

  public Test6_13_Dog(int age) {
    super("okay", "수컷"); // = new Animal();
    this.age = age; // 부모가 먼저 만들어지고 나중에 만들어져야 하므로 super 뒤에 와야함
  }

  void sleep(int times) {
    System.out.println(name + "zzz...." + times + " hours");
  }
}
