package com.PraveenCodegnan;

import java.util.Scanner;

public class AreaofCircle{

 public static void main(String args[]){
 final double PI= 3.1415;
 Scanner sc=new Scanner(System.in);
 double radius=sc.nextDouble();
 System.out.print("Enter the Radius: ");
 double area= PI*radius*radius;
 System.out.print("Area of Cirlce: "+area);
 sc.close();
}
}