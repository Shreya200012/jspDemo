package com.op2;

public class demoConstructor {
public static void main(String[] args) {
	rectangle r = new rectangle();
	
}
}
//constructor chaining
class rectangle{
	private int x;
	private int y;
	private int height;
	private int width;
	
	public rectangle() {
		this(0,0);
		System.out.println("1");
	}
	public rectangle(int width,int height) {
		this(0,0,width,height);
		System.out.println("2");
	}
	public rectangle(int x,int y,int width,int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		System.out.println("X= "+x+" Y= "+y+" Width= "+width+" Height= "+height);
		
	}
}