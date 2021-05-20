package Baitap;

import java.util.ArrayList;

public class Bai1ArrayList {

	public static void main(String[] args) {
	ArrayList<Integer> al =new ArrayList<Integer>();
	System.out.println("Size  ban dau cua cua ArrayList la:"+al.size());
	//them cac phan tu toi arrayList
	al.add(1);
	al.add(5);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(2);
	System.out.print("Size cua ArraList sau khi them  la :"+al.size());
	// display the array list
    System.out.println("Noi dung cua ArrayList la: " + al);
	//xoa cac phan tu tu arrayList 
	al.remove(3);
	al.remove (2);
	System.out.print("Size cua ArrayList sau khi xoa la:"+al.size());
	 System.out.println("Noi dung cua ArrayList la: " + al);
	}

}
