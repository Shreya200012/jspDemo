package RegularExpression;

public class SingletonClass {
	public static void main(String[] args) {
		database db = database.getMyDatabase();
		db.connect();
	
}
}
class database{
	private static  database singleInstance = new database();
	private database() {
		
	}
	public static database getMyDatabase() {
		return singleInstance;
	}
	public void connect() {
		System.out.println("DB connected successfully");
	}
	
}
