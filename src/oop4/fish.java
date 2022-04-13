package oop4;

public  abstract class fish extends animal{

	public fish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is eating food.");
		
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println("Breathing in water");
		
	}
	public abstract void gills();

}
