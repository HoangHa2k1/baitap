package Baitap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bai3HashSet {

	private static final String NameSearch = null;

	public static void main(String[] args) {
		String name;

		    int n;
		    try (Scanner scanner = new Scanner(System.in)) {
				//tao hashSet co ten  la hashSetName
				    HashSet<String> hashSetName = new HashSet<String>();
				     
				    System.out.println("Nhập vào số phần tử của hashSetFruits: ");
				    n = Integer.parseInt(scanner.nextLine());   
				         
				    System.out.println("Nhập vào tên các loại trái cây: ");
				    for (int i = 0; i < n; i++) {
				        System.out.print("Nhập tên loại trái cây thứ " + i + ": ");
				        name = scanner.nextLine();
				        hashSetName.add(name);
				    }
				 
				    // hiển thị số phần tử của hashSetName
				    // sử dụng phương thức size()
				    System.out.println("Số phần tử của hashSetName = " + hashSetName.size());
				      
				    // tìm loại trái cây
				    System.out.println("Nhập tên loại trái cây cần tìm: ");
				    String fruitSearch = scanner.nextLine();
				    if (hashSetName.contains(fruitSearch)) {
				        System.out.println("Có trái cây " + NameSearch + " trong hashSetFruits!");
				    } else {
				        System.out.println("Không tìm thấy " + NameSearch);
				    }
				         
				    // Xóa 1 loại trái cây bất kỳ trong HashSet đó và hiển thị các phần tử còn lại.
				    System.out.println("Nhập vào tên loại trái cây cần xóa: ");
				    String NameDelete = scanner.nextLine();
				 
				    if (hashSetName.contains(NameDelete)) {
				        hashSetName.remove(NameSearch);
				        System.out.println("Xóa thành công!");
				        System.out.println("Các phần tử còn lại trong hashSetName: " + hashSetName);
				    } else {
				        System.out.println("Xóa không thành công!");
				    }
				         
				    // Tạo 1 List mới có cùng kiểu dữ liệu với HashSet
				    // và thêm các phần tử của List này.
				    List<String> listName = new ArrayList<>();
				    listName.add("Táo");
				    listName.add("Nho");
				    listName.add("Đào");
				    listName.add("Mận");
				 
				    // thêm các phần tử của List này vào trong HashSet ban đầu 
				    // và hiển thị lại HashSet này sử dụng Iterator.
				    // sử dụng phương thức addAll()
				    hashSetName.addAll(listName);
				    System.out.println("Các phần tử có trong hashSetFruits sau khi thêm: ");
				    Iterator<String> iterator = hashSetName.iterator();
				    while (iterator.hasNext()) {
				        System.out.print(iterator.next() + "\t");
				    }
				         
				    // Xóa các phần tử của List có trong HashSet và hiển thị lại HashSet
				    // sử dụng phương thức removeAll()
				    hashSetName.removeAll(listName);
				    System.out.println("\nCác phần tử có trong hashSetName sau khi xóa: " + hashSetName);
			}
		}
}