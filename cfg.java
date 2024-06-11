import java.io.*;
import java.util.*;
class bicycle implements vehicle{
int speed;
int gear;
public void changegear(int newgear){
gear=newgear;
}
public void speedup(int increment)
{
speed=speed+increment;
}
public void applybrakes(int decrement)
{
speed=speed+decrement;
}
public void printstates()
{
System.out.println("Speed: " + speed +"Gear: " + gear);
}
}
class bike implements vehicle{
int speed;
int gear;
public void changegear(int newgear){
gear=newgear;
}
public void speedup(int increment)
{
speed=speed+increment;
}
public void applybrakes(int decrement)
{
speed=speed+decrement;
}
public void printstates()
{
System.out.println("Speed: " + speed +"Gear: " + gear);
}
}
class cfg{
public static void main(String args[]){
bicycle bicycle1=new bicycle();
bicycle1.changegear(2);
bicycle1.speedup(3);
bicycle1.applybrakes(1);
System.out.println("Bicycle present state :" + printstates());

bike bike1=new bike();
bike1.changegear(1);
bike1.speedup(4);
bike1.applybrakes(3);
System.out.println("Bike present state :" + printstates());
}
}
