package Baitap;

public class ThrowAndThrows {

	public static void main(String[] args) {
		ThrowAndThrows tat = new ThrowAndThrows();
		try {
			tat.connectDatabase ();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public void connectDatabase() throws Exception {
	//Connect to  database
	throw new Exception();
	
}
}

