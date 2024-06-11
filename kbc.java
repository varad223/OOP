package mypackage;
import java.io.*;
public interface vehicle {
void changegear(int a);
Void speedup(int a);
void applybrakes(int a);
}
class bicycle implements vehicle
{
int speed;
int gear;
public void changegear(int newgear)
{
gear = newgear;
}
public void speedup(int increment)
{
speed = speed+increment;
}
public void applybrakes (int decrement)
{
speed=speed-decrement;
}
public void printStates(){
System.out.println("Speed:" + speed + "gear" + gear);
}}
class Bike implements vehicle {
int speed;
int gear;
public void changegear(int newgear)
{
gear = new gear();
}
public void speedup(int increment)
{
Speed = Speed+increments;
}
public void applybrakes(int decrement)
{
Speed=Speed-decrement;
}
public void printStates();
{
System.out.println("Speed :"+ speed + "gears" + gear);
}
}
class car implements vehicle{
  int speed;
  int gear;
public void changegear(int newgear)
{
  gear = new gear();
}
public void Speedup(int increment)
{
 Speed = speed + increment;
}
 public void applybrakes (int decrement)
{
 Speed=speed-decrement;
}
public Void printStates()
{
System.out.println("Speed" + speed + "gear" + gear);
}
class kbc{
public static void main(String args[])
{
bicycle bicycle1=new bicycle();
bicycle1.Changegear(2);
bicycle1.speedup(3);
bicycle1.applybrakes(1);
System.out.println("Bycycle present state:");
Bike bike= new Bike();
bike.changegear(1);
bike.speedup(4);
bike.applybrakes (3);
}}
