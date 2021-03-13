      package Baitap;
     import java.util.Scanner;
    public class Sinhvien {
	private String hoTen, Gioitinh;
	private int Ngaysinh;
	private double diemToan,diemLy,diemHoa;
	//tao  1 phuong thuc de nhp thong tin cua 1 sinh vien
	public void nhap() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("nhap ho ten sinh vien:");
			hoTen=scanner.nextLine();
			System.out.println("nhap lop");
			scanner.nextLine();
			System.out.println("nhap gioi tinh:");
			setGioitinh(scanner.nextLine());
			System.out.println("nhap ngay sinh:");
			Ngaysinh=scanner.nextInt();
			System.out.println("nhap diem toan:");
			diemToan=scanner.nextDouble();
			System.out.println("nhap diem ly:");
			diemLy=scanner.nextDouble();
			System.out.println("nhap diem hoa :");
			diemHoa=scanner.nextDouble();
		}
	}
	public double tinhDiemTrungBinh(double a,double b,double c) {
		return (a+b+c)/3;
	}
	public String xeploaiHocLuc(double diemTB) {
		if(diemTB >=8 && diemTB <10) {
			return "kha";
		}
		if (diemTB >= 6.5 && diemTB <8) {
			return "trung binh";
		}
		if(diemTB >=0.0 && diemTB <5) {
			return "yeu";
		}
		return  "nhap sai!";
	}
	public static void main(String[]args) {
		//tao  1 doi  tuong cua Sinhvien
		Sinhvien sinhvien=new Sinhvien();
		//nhap thong tin sonh vien
		sinhvien.nhap();
		//tinh diem  trung binh 3 mon
		System.out.println("Diem trung binh  3 mon ="+sinhvien.tinhDiemTrungBinh(sinhvien.diemToan,sinhvien.diemLy,sinhvien.diemHoa));
		//hien thi xep loai
		System.out.println("sinhvien.xepLoaiHocLuc"+sinhvien.tinhDiemTrungBinh(sinhvien.diemToan,sinhvien.diemLy,sinhvien.diemHoa));
		}
	public String getGioitinh() {
		return Gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		Gioitinh = gioitinh;
	}
	}

