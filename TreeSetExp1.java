package Baitap;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExp1 {

	public static void main(String[] args) {
		int number;
		TreeSet<Integer> treeSetInteger=new TreeSet<>();
		try (Scanner scanner = new Scanner (System.in)) {
			//them  cac phan tu vao SetInteger
			treeSetInteger.add(0);
			treeSetInteger.add(1);
			treeSetInteger.add(4);
			treeSetInteger.add(2);
			treeSetInteger.add(8);
			//hien thi cac phan tu trong treeSetInteger
			System.out.println("cac phan tu trong treeSetInteger:");
			System.out.println(treeSetInteger);
			System.out.println("nhap cac phan tu can them:");
			number=scanner.nextInt();
		}
		//them  mot so thanh phan vao treeSetInteger tu ban phim  
		// neu phan tu do da ton tai thi thong bao da ton tai nguoc lai thi them vao
		if(!treeSetInteger.contains(number)) {
		treeSetInteger.add(number);
		System.out.println("them  thanh cong!");
		System.out.println("cac phan tu trong treeSetInteger sau khi them :");
		System.out.println(treeSetInteger);
	} else  
	{
		System.out.println("phan tu "+number+"da ton tai!");
		
	}

}
}