package com.op2;

public class dog extends animal{
	private int eyes;
	private int legs;
	private int tail;
	public dog(String name,int size,int weight,int eyes,int legs,int tail) {
		super(name,size,weight);
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
	}
	public void move(int speed) {
		super.move();

		System.out.println("Dog moves at speed "+speed);
	}
	public void run() {
		System.out.println("Run called");
		move(6);
	}
	public void eat() {
		System.out.println("Dog eats bones");
	}
	public void features(int legs,int tail) {
		System.out.println("Number of legs dog have is "+legs+" and tail is "+tail);
	}
}
