package Baitap;

public class bai4 {

	public static void main(String[] args) {
		int X, SUM=0;
        do{
            System.out.println(" nhap vao so nguyen la: ");
            Scanner scan = new Scanner(System.in);
            X= scan.nextInt();
            SUM+=X;
        }
    while(SUM<100);
    System.out.println("tong la: "+SUM); 

	}

}
