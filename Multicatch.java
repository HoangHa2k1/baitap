package Baitap;

public class Multicatch {

	public static void main(String[] args) {
		try {
		 int  a[] =new int [5];
		 a[5]=30 / 0;
		}catch (ArithmeticException e) {
			System.out.println ("Task1 is completed ");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Task2 completed");
		}catch (Exception e) {
			System.out.println("common  task completed");
		}
		System .out.println ("rest  of the code...");
		}
}