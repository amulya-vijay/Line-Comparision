package com.linecomparision;

import java.util.Scanner;
import java.lang.Math;

public class LineComparision {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the begining and end points of the line:");
		System.out.println("x1=");
		double x1=sc.nextDouble();
		System.out.println("y1=");
		double y1=sc.nextDouble();
		System.out.println("x2=");
		double x2=sc.nextDouble();
		System.out.println("y2=");
		double y2=sc.nextDouble();
		double diffx=x2-x1;
		double diffy=y2-y1;
		double x=Math.pow(diffx, 2);
		double y=Math.pow(diffy, 2);
		double diff=x+y;
		double length=Math.sqrt(diff);
		System.out.println("Length of the line ="+length);
		
		System.out.println("Enter the end points of the second line:");
		System.out.println("x3=");
		double x3=sc.nextDouble();
		System.out.println("y3=");
		double y3=sc.nextDouble();
		System.out.println("x4=");
		double x4=sc.nextDouble();
		System.out.println("y4=");
		double y4=sc.nextDouble();
		String line1=x1+" "+y1+" "+x2+" "+y2;
		String line2=x3+" "+y3+" "+x4+" "+y4;
		boolean eql=line1.equals(line2);
		System.out.println("Line1 equal to Line2?"+eql);
	}
}
