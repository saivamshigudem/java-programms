package dataStructure;
import java.util.*;

public class TwoDimensional {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the rows");
	int n = sc.nextInt();
	System.out.println("enter the columns");
	int m = sc.nextInt();
	System.out.println("enter the values :");
	int a[][] = new int[n][m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			a[i][j]= sc.nextInt();
		}
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			System.out.print(a[i][j]+ " ");
		}
		System.out.println();
	}
	
	}

}
