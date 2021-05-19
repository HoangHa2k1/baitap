package Baitap;

public class ArrayList {

	public static void main(String[] args) {
		ArrayList arrListString = new ArrayList();
		
		//them cac phan tu su ding phuong thuc add()
		arrListString.add("JAVA");
		arrListString.add("PHP");
		arrListString.add("C#");;
		arrListString.add("C++");
		System.out.println("cac phan tu trong arrListString la:");
		for (int i=0;i<arrListString.size();i++) {
			System.out.print(arrListString.get(i)+"\t");
		}
	}

	private int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	void add(String string) {
		// TODO Auto-generated method stub
		
	}

	private String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
