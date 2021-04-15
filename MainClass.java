package main;
import Shapse.HinhChuNhat;
import Shapse.HinhTron;
import Shapse.HinhTru;
import Shapse.HinhVuong;

public class MainClass {
	public static void main(String[] agrs) {
		//thu  nghiem voi  lop Hinh tron
		HinhTron hinhTron=new HinhTron();
		hinhTron.xuatTen();
		hinhTron.nhapBanKinh();
		hinhTron.tinhChuVi();
		hinhTron.tinhDienTich();
		hinhTron.inchuVi();
		hinhTron.indienTich();
	
//thu nghiem voi lop  hinh tru
	HinhTru hinhTru=new Hinh Tru();
	hinhTru.xuatTen();
	hinhTru.nhapChieuCao();
	hinhTru.tinhTheTich();
	//thu nghiem  voi lop  hinh chu nhat
	HinhChuNhat hinhChuNhat =new HinhChuNhat();
	hinhChuNhat.xuatTen();
	hinhChuNhat.nhapChieuDai();
	hinhChuNhat.nhapChieuRong();
	hinhChuNhat.tinhDienTich();
	hinhChuNhat.tinhChuVi();
	hinhChuNhat.inChuVi();
	hinhChuNhat.inDienTich;
	//thu nghiem  voi  lop hinh vuong
	HinhVuong hinhVuong=new Hinh Vuong();
	hinhVuong.xuatTen();
	hinhVuong.nhapChieuDai();
	hinhVuong.tinhDienTich();
	hinhVuong.tinhChuVi();
	hinhVuong.inChuVi();
	hinhVuong.inDienTich;
	}
}

