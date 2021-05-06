package Baitap;
import java.util.Scanner;
public class NhaCungCap {

	protected String MaNhaCungCap;
protected String DiaChi;
public NhaCungCap() {
	SetMaNhaCungCap ("");
	DiaChi ="";
}
	
public void SetMaNhaCungCap(String MaNhaCungCap)
{
	this.MaNhaCungCap= MaNhaCungCap;
}
public String getMaNhaCungCap()
{
	return MaNhaCungCap;
}
public void SetDiaChi(String DiaChi)
{
	this.DiaChi=DiaChi;
}
public String getDiaChi()
{
	return DiaChi;
}
public void nhap()
{
	try (Scanner sc = new Scanner(System.in)) {
		System.out.print("Nhap Ma nha cung cap");
		MaNhaCungCap = sc.nextLine();
		SetMaNhaCungCap(MaNhaCungCap);
		System.out.print("\nNhap dia chi nha cung cap: ");
		DiaChi= sc.nextLine();
	}
	SetDiaChi(DiaChi);
}
public void Xuat()
{
	System.out.println("Ma nha cung cap : " + getMaNhaCungCap());
	System.out.println("Dia chi : " +getDiaChi());
}
}

