public class Test6_13_Animal {
  String name;
  String gender;

  public void setName(String name) {
    this.name = name;
  }

  public Test6_13_Animal(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public void sleep() {
    System.out.println(this.name + "Zzzzzz...");
  }
}
