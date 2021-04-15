package Shapes;

import java.util.Scanner;

public class HinhTru extends HinhTron{
public  float chieuCao;
//Contructor
public HinhTru() {
	ten ="Hinh Tru";
}
public void  nhapChieuCao() {
	nhapBanKinh();
	System.out.println("Chieu Cao =");
	Scanner sacanner =new Scanner(System.in);
	chieuCao = scanner.nextFloat();
}
public void tinhTheTich() {
	tinhDienTich();
	theTich=dienTich * chieuCao;
	
}
}
