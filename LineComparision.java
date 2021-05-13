package com.linecomparision;

import java.util.Scanner;
import java.lang.Math;

public class LineComparision {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the end points of the line:");
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
	}
}
