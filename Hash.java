package Baitap;
import java.util.HashSet;
import java .util.Scanner;
public class Hash {

	public static void main(String[] args) {
	String name;
	HashSet<String> hashSetString =new HashSet<>();
	try (Scanner scanner = new Scanner (System.in)) {
		//them  cac phan tu vao hashSetString
		hashSetString.add("Wilson");
		hashSetString.add("Nike");
			hashSetString.add("Volvo");
			hashSetString.add("Kia");
			hashSetString.add("Lenovo");
			hashSetString.add("Lenovo");
			//hien thi cac phan tu trong  hashSetString
			System.out.println (" cac ph ntu trong hashSetString:");
			System.out.println (hashSetString);
			System.out.println ("nhap phan tu can xoa :");
			name= scanner.nextLine();
	}
	//neu phan tu can xoa co ton tai hashSetString thi thong bao xoa thanh cong
		//va hien thi cac phan tu con lai nguoc lai thong bao xoa khong thanh cong
		if (hashSetString.contains(name)) {
			hashSetString.remove(name);
			System.out.println("xao thanh cong!:");
			System.out.println("cac phan tu con lai trong hashSetString:");
			System.out.println(hashSetString);
		}
		else {
			System.out.println("xoa khong thanh cong!");
		}
		
			}
	}


