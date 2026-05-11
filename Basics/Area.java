import java.io.*;
import java.util.*;


abstract class Shape
{
 double a=0,b=0;
 abstract public void printArea();
}

class Rectangle extends Shape
{
 double area=0;
 public void printArea()
 {
  System.out.println("Area of rectangle");
  System.out.println("-----------------------------------------");
  Scanner s=new Scanner(System.in);
  
  System.out.print("Enter the width:");
  this.a=s.nextDouble();
  System.out.print("Enter the length:");
  this.b=s.nextDouble();
  this.area=a*b;
  System.out.println("The area of the rectangle is:"+this.area);
  
 }
}

class Circle extends Shape
{
 double area=0;
 public void printArea()
 {
  System.out.println("Area of the cirlce");
  System.out.println("------------------------------");
  Scanner K=new Scanner(System.in);
  System.out.print("Enter the Radius:");
  this.a=K.nextDouble();
  this.area=3.14*a*a;
  System.out.println("The Area of the circle is:"+this.area);
  
 }
}


public class Area
{
 public static void main(String args[])
 {
  System.out.println("-----------------Finding the area of shapes-----------------");
  Rectangle s=new Rectangle();
  s.printArea();
  Circle d=new Circle();
  d.printArea();
 }
}