
public class demoOperators {
	public static void main(String[] args) {
		boolean flag = false;
		if(flag) {
			System.out.println("1");
		}else {
			System.out.println("2");
		}
		int topScore = 100;
		int secondScore = 80;
		if((topScore>secondScore) && (topScore<=100)) {
			System.out.println("MISSED");
		}
		int age = 6;
		boolean myflag = false;
		String a = (age>18) ? (myflag) ? "YES" :"NO" :"Cant Vote";
		String b = (age>18) ? "VOTE" :(myflag)?"Yes":"No";

		System.out.println(b);
	}
}
