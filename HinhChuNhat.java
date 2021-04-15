package Shapes;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
public  float dai;
public float rong;
//Contructor
public HinhChuNhat() {
	ten="Hinh Chu Nhat :";
}
public void nhapChieuDai() {
	System.out.println("Chieu dai=");
	Scanner sacanner = new Scanner(System.in);
	dai = scanner.nextFloat();
}
public void nhapChieuRong() {
	System.out.println("Chieu Rong=");
	Scanner sacanner =new Scanner(System.in);
	rong = scanner.nextFloat();
}
public void tinhChuVi() {
	chuVi=2*(dai+rong);
}
public void tinhDienTich() {
	dienTich=dai*rong;
}
}
