package Shapes;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat  {
//Contructor
	public HinhVuong() {
		ten ="Hinh Vuong";
	}
	public void nhapCanh() {
		System.out.println("Canh=");
		Scanner sacanner =new Scanner(System.in);
		dai = rong= scanner.nextFloat();
	}
}
