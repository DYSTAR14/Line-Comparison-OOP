package com.blz.linecomparison;

public class LineComparison {
	private final int x1,x2,y1,y2;
	public LineComparison(int x1,int x2,int y1,int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;	
	}
	public float calciLength() {
		float length=(float) ((Math.pow((x2-x1),2) + (Math.pow((y2-y1),2))));
		length=(float) Math.sqrt(length);
		return length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation");
		LineComparison length=new LineComparison(3,-2,7,15);
		System.out.println(length.calciLength());
	}
}
