package RegularExpression;

public class strategyPattern {
	public static void main(String[] args) {
		calculator c = new calculator(new operation());
		System.out.println("Addition is: "+c.execute(3,5));
		calculator c1 = new calculator(new sub());
		System.out.println("Subtraction is: "+c1.execute(3,5));
		calculator c2 = new calculator(new mul());
		System.out.println("Multiplication is: "+c2.execute(3,5));
	}
}

interface Strategy{
	public int doCalc(int num1,int num2);
}
class operation implements Strategy{

	@Override
	public int doCalc(int num1, int num2) {
		// TODO Auto-generated method stub
return num1+num2;
}
	
}
class sub implements Strategy{

	@Override
	public int doCalc(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}
	
}
class mul implements Strategy{

	@Override
	public int doCalc(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}
	
}
class calculator{
	public Strategy s;
	public calculator(Strategy s) {
		this.s=s;
	}
	public int execute(int num1,int num2) {
		return s.doCalc(num1, num2);
	}
}