public class Test6_12_Person {

  private String name2;
  String name;
  int age;
  static final String GENDER = "남";
  static final int BIRTHDAY = 927;
  static final String FOOD = "orange";

  public Test6_12_Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hello my name is " + this.name);
  }

  public void introduce() {
    System.out.println("I am " + this.age + " years old.");
  }

  public void saying() {
    System.out.println(GENDER + " " + BIRTHDAY + " " + FOOD);
  }

  protected void testMethod() {
    System.out.println("test");
  }

  private String getName2(){
    return this.name2;
  }
}
