package designPatterns.factory;
public enum CarType {
SMALL, SEDAN, LUXURY
}
//Car.java is parent class of all car instances and it will also contain the common logic applicable in car
making of all types.
package designPatterns.factory;
public abstract class Car {
public Car(CarType model) {
this.model = model;
arrangeParts();
}
private void arrangeParts() {
// Do one time processing here
}
// Do subclass level processing in this method
protected abstract void construct();
private CarType model = null;
public CarType getModel() {
return model;
}
public void setModel(CarType model) {
this.model = model;
}
}
//LuxuryCar.java is concrete implementation of car type LUXURY
package designPatterns.factory;
public class LuxuryCar extends Car {
LuxuryCar() {
super(CarType.LUXURY);
construct();
}
@Override
protected void construct() {
System.out.println("Building luxury car");
// add accessories
}
}
//SmallCar.java is concrete implementation of car type SMALL
package designPatterns.factory;
public class SmallCar extends Car {
SmallCar() {
super(CarType.SMALL);
construct();
}
@Override
protected void construct() {
System.out.println("Building small car");
// add accessories
}
}
//SedanCar.java is concrete implementation of car type SEDAN
package designPatterns.factory;
public class SedanCar extends Car {
SedanCar() {
super(CarType.SEDAN);
construct();
}
@Override
protected void construct() {
System.out.println("Building sedan car");
// add accessories
}
}
//CarFactory.java is our main class implemented using factory pattern. It instantiates a car instance only
after determining its type.
package designPatterns.factory;
public class CarFactory {
public static Car buildCar(CarType model) {
Car car = null;
switch (model) {
case SMALL:
car = new SmallCar();
break;
case SEDAN:
car = new SedanCar();
break;
case LUXURY:
car = new LuxuryCar();
break;
default:
// throw some exception
break;
}
return car;
}
}
//In TestFactoryPattern.java, we will test our factory code. Lets run this class.
package designPatterns.factory;
public class TestFactoryPattern {
public static void main(String[] args) {
System.out.println(CarFactory.buildCar(CarType.SMALL));
System.out.println(CarFactory.buildCar(CarType.SEDAN));
System.out.println(CarFactory.buildCar(CarType.LUXURY));
}
}
