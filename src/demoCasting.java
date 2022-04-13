
public class demoCasting {
    public static void main(String[] args) {
    	System.out.println("Implicit Casting");
    	char a = 'A';
    	System.out.println("Value of a is "+a);
    	int b = a;
    	System.out.println("Value of b is "+b);
    	float c = a;
    	System.out.println("Value of c is "+c);
    	long d = a;
    	System.out.println("Value of d is "+d);
    	double e = a;
    	System.out.println("Value of e is "+e);
    	System.out.println("\n");
    	
    	System.out.println("Explicit Casting");
    	double x = 45.5078;
    	int y = (int)x;
    	float z =(float)x;
    	System.out.println("Value of x is "+x);
    	System.out.println("Value of y is "+y);
    	System.out.println("Value of z is "+z);
    }
}
