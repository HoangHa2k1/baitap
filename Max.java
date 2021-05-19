package Baitap;
import java.util.ArrayList;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		ArrayList <Integer> arrListInteger =new ArrayList<>();
		try (Scanner sacnner = new Scanner (System.in)) {
			int number;
			System.out.println("nhao so phan tu cua ArrayList:");
			 int n= sacnner.nextInt();
			for (int i=0;i<n;i++) {
				number = sacnner.nextInt();
				arrListInteger .add(number);
				
			}
		}
		int max =arrListInteger.get(0);
		for (int i=1;i<arrListInteger.size();i++) {
			if (arrListInteger.get(i).compareTo(max)>0) {
				max = arrListInteger .get(i);
			}
		}
System.out.println("Phan tu lon nhat trong arrListInteger = "+ max);
	}

}
