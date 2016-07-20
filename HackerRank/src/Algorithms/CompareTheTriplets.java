package Algorithms;


/*
 * https://www.hackerrank.com/challenges/compare-the-triplets
 */

/*
 * Status : All test case passed
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriplets {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[3];
		int b[] = new int[3];
		
		for(int i = 0;i < 3;i++){
			a[i]=scanner.nextInt();
		}
		for(int i = 0;i < 3;i++){
			b[i]=scanner.nextInt();
		}
		
		int ca=0;
		int cb=0;
		for(int i=0;i<3;i++){
			if(a[i]>b[i])
				ca++;
			else if(a[i]<b[i])
				cb++;
		}
		
		System.out.println(ca+" "+cb);
		
	}
}
