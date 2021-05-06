package Baitap;

public class TestThrows1 {
void m() throws Exception{
	throw new Exception("loi  thiet bi");//chekced exception
	
}
void  n() throws Exception{
	m();
}
void p() {
	try {
		n();
		
	}catch (Exception e) {
		System.out.println("ngoai le duoc xu ly");
	}
}
	public static void main(String[] args) {
		TestThrows1 obj =new TestThrows1();
		obj.p();
		System.out.println("luong binh thuong...");

	}

}
