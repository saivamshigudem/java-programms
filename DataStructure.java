package dataStructure;
import java.util.*;
public class Array { //array creation and taking inputs from user
	

	public static void main(String []args) {
		System.out.println("enter the no of elements: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter the numbers");
		int b[]= new int[a];
		for(int i=0;i<a;i++) {
		 b[i]= sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			System.out.println(b[i]);
			}
	}
}
