public abstract class Test6_13_Phone {
  private String owner;

  public Test6_13_Phone(String owner) {
    this.owner = owner;
  }

  public void turnOn() {
    System.out.println("폰전원을 킵니다.");
  }

  public void turnOff() {
    System.out.println("폰전원을 끕니다.");
  }
}
