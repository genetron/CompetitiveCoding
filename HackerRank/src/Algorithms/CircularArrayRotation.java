package Algorithms;


/*
 * https://www.hackerrank.com/challenges/circular-array-rotation
 */

/*
 * Status : AC
 */
import java.util.Scanner;

public class CircularArrayRotation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int q = scanner.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		
		//take input
		for(int i = 0;i<n;i++){
			a[i]=scanner.nextInt();
		}
		k%=n;
		
		//rotation logic
		for(int i = 0;i<n;i++){
			if(i+k<=(n-1)){
				b[i+k]=a[i];
			}
			else{
				b[i+k-(n-1)-1]=a[i];
			}
		}
		
		
		
		while(q>0){
			int m = scanner.nextInt();
			System.out.println(b[m]);			
			
			
			q--;
		}
	}
}
