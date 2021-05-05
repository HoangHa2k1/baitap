package java;
import java.util.Scanner;
public class Phieunhap {
    public static void main(String[] args){
        pn ht = new pn();
        ht.nhapttkhachhang();
        ht.hienThiThongTinKhachhang();
}
class pn{
    String Mapn;
    String Tennv;
    String  ngaynhap;
public void  nhapttkhachhang (){
    System.out.print("Nhập thông tin phiếu");
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap ten nhan vien : ");
    Tennv = scanner.nextLine();
    System.out.println("nhap vao mã phiếu nhập : ");
    Mapn = scanner.nextLine();
    System.out.print("Nhập ngàyy nhập: ");
    ngaynhap = scanner.nextLine();
}
public void hienThiThongTinKhachhang() {
    System.out.println("Họ và tên nhan vien : " + Tennv);
    System.out.println("ma phiếu nhập: "+ Mapn);
    System.out.println("ngày nhập " + ngaynhap);

}
}




    

