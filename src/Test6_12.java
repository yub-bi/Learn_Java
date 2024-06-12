import car.Car;

public class Test6_12 {

  public static void main(String[] args) {

    /*Test6_12_Person person1 = new Test6_12_Person("승조", 25);
    Test6_12_Person person2 = new Test6_12_Person("max", 21);

    person1.sayHello();
    person1.introduce();

    person2.sayHello();
    person2.introduce();

    person1.saying();
    person2.saying();

    person1.testMethod();*/

    Test6_12_Car car = new Test6_12_Car();

    car.setSpeed(70);
    car.checkSpeed();
    car.checkGear();
    System.out.println(car.getSpeed());
  }
}
