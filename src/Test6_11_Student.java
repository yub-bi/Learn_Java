public class Test6_11_Student {

  int level;

  public Test6_11_Student() {
    this.level = 1;
  }

  public void levelUp() {
    level++;
    System.out.println("레벨이 1증가 했습니다.");
    System.out.println("현재 레벨은 " + level + "입니다");
  }

  public void levelDown() {
    if (level > 1) {
      level--;
      System.out.println("레벨이 1감소 했습니다.");
      System.out.println("현재 레벨은 " + level + "입니다");
    } else {
      System.out.println("현재 레벨이 최소레벨 상태입니다.");
      System.out.println("현재 레벨은 " + level + "입니다");
    }
  }
}
