package Baitap;
import java.util.Scanner;
import java.util.LinkedList;
public class Date {

	private static LinkedList<String> likedList;
	private static LinkedList<String> likedList2;

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner (System.in)) {
			//khai bao 1 danh sach lien ket 
			// luu tru cac thang trong nam  
			LinkedList<String> linkedList =new LinkedList<>();
			linkedList.add("thang 1");
			linkedList.add("thang 2");
			linkedList.add("thang 3");
			linkedList.add("thang 4");
			linkedList.add("thang 5");
			linkedList.add("thang 6");
			linkedList.add("thang 7");
			linkedList.add("thang 8");
			linkedList.add("thang 9");
			linkedList.add("thang 10");
			linkedList.add("thang 11");
			linkedList.add("thang 12");
System.out.println("nhap vao chi so cua phan tu  can lay:");
int index =scanner .nextInt();
//kiem tra neu chi so lon hon hoac =0;
// va nho hon kich thuoc cua linkesList -1 thi moi lay
// nguoc lai bao loi
if (index <0 || (index  > (linkedList.size() -1))) {
			System.out.println("chi so can lay phai lon hon 0 va nho hon "
			+(linkedList.size()-1));
}else {
			likedList2 = null;
			//truy cap phan tu co chi so index trong likedList
			//vi linkedList co kieu String 
			//nen  cac phan tu con cua no cung co kieu du lieu la String
			String node=likedList2.get(index);
			System.out.println(" phan tu co chi so ="+index +" trong linkedList la "+node);
}
		}
		likedList = null;
	//try cao pha ntu dau tien trong danh sach
	//su dung phuong thuc  getFirst()
	String firstNode =likedList.getFirst();
	// truy cap phan tu dau tien trong danh sach
	//su dung phuohng thuc getLast()
	String lastNode=likedList.getLast();
	System.out.println("\nphan tu dau tien trong danh sach la :"+ firstNode+";phan tu cuoi cung trong danh sach la ;"+ lastNode);
	}

}
