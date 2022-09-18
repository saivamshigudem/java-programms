package dataStructure;
import java.util.*;
public class Array { // insertion of an array at fixed position 
	

	public static void main(String []args) {
		System.out.println("enter the no of elements: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter the numbers");
		int b[]= new int[a];
		for(int i=0;i<a;i++) {
		 b[i]= sc.nextInt();
		}
		System.out.println("at what position you want to enter data:");
		int c = sc.nextInt();
		System.out.println("enter the value to insert");
		int e = sc.nextInt();
		int d[]= new int[a+1];
		for(int i=0;i<a+1;i++) {
			if(i<c) {
				d[i]=b[i];
			}else if(i==c) {
				d[i]=e;
			}else {
				d[i]=b[i-1];
			}
		}
		for(int i=0;i<a+1;i++) {
			System.out.println(d[i]);
			}
	}
}
