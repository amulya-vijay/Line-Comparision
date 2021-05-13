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
		//length of fisrt line
		double length1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("Length of the line1 ="+length1);
		
		System.out.println("Enter the end points of the second line:");
		System.out.println("x3=");
		double x3=sc.nextDouble();
		System.out.println("y3=");
		double y3=sc.nextDouble();
		System.out.println("x4=");
		double x4=sc.nextDouble();
		System.out.println("y4=");
		double y4=sc.nextDouble();
		
		//length of second line
		double length2=Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
		System.out.println("Length of the line2 ="+length2);
		String line1=x1+" "+y1+" "+x2+" "+y2;
		String line2=x3+" "+y3+" "+x4+" "+y4;
		
		//difference based on end points
		boolean eql=line1.equals(line2);
		System.out.println("Line1 equal to Line2?"+eql);
		
		//lines compared based on lengths
		String l1=""+length1;
		String l2=""+length2;
		int diff=l1.compareTo(l2);
		if(diff==0) {
			System.out.println("Length of Line1 and line2 is equal");
		}else if(diff<0){
			System.out.println("Length of line1 is less than that of line2");
		}else {
			System.out.println("Length of line1 is greater than that of line2");
		}
	}
}
