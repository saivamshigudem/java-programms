package dataStructure;
import java.util.*;
public class ArrayDeletion {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	  System.out.println("enter the no of elements : ");
	  int n = sc.nextInt();
	  int a[] = new int[n];
	  System.out.println("enter the values");
	  for(int i=0;i<n;i++) {
		 a[i]=sc.nextInt();
	  }
	  System.out.println("at what position you want to delete the element");
	  int m = sc.nextInt();
	  int b[] = new int[n-1];
	  for(int i=0;i<n;i++) {
		  if(i<m) {
			  b[i]=a[i];
		  }else if(i==m) {
			  continue;
		  }else {
			  b[i-1]= a[i];
		  }
	  }
	  for(int i=0;i<n-1;i++) {
		  System.out.println(b[i]);
	  }
	}

}
