package Baitap;
import java.util.LinkedList;
public class Linked {

	public static void main(String[] args) {
	//khai bao 1 LinkedList co ten  List
		// co kieu String
		LinkedList<String> list =new LinkedList<String>();
		//add objects to list 
		list.add("java");
		list .add("c++");
		list.add("PHP");
         list.add("java");
         System.out.println(" vi du du dung phuong thuc addAll()");
         System.out.println("---------");
         //them  cac phan tu cua list vao ListA
         LinkedList<String> listA = new LinkedList<String>();
         listA.addAll(list);
         System.out.print("listA:");
         showList(listA);
         System.out.println("\nvi du su dung phuong thuc retaiAll()");
         System.out.println("------------");
         //khoi t6ao listb
         LinkedList<String> listB =new LinkedList<String>();
         listB.add("java");
        //xoa nhung phan tu khong thuoc listB khoi listA
         listA.retainAll (listB);
         System.out.print("listA:");
         showList(listA);
         System.out.println("\nvi du su dung phuong thuc removeAll()");
         System.out.println("----------");
         //xoa nhung phan tu thuoc listB khoi list
         list.removeAll(listB);
         System.out.print("list:");
        	 showList(list);
	}
	

	private static void showList(LinkedList<String> list) {
		//show list through for -each
		for (String obj: list) {
			  System.out.print("\t " + obj+",");
		}
		  System.out.println();
		  
		}
	}
