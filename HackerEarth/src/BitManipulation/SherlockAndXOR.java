package BitManipulation;

/*PROBLEM STATEMENT
 * 
 * You are given an array A1,A2...AN. You have to tell how many pairs (i, j) exist such that 1 ≤ i < j ≤ N and Ai XOR Aj is odd.

	Input and Output 
	First line T, the number of testcases. Each testcase: first line N, followed by N integers in next line. For each testcase, print the required answer in one line.
	
	Constraints 
	1 ≤ T ≤ 10 
	1 ≤ N ≤ 105 
	0 ≤ Ai ≤ 109
*/


/* 
 * Taking long will help to pass test cases.
 * Xor of even with even and odd with odd is 0.
 * Hence pairs of even and odd is answer. 
 * So multiply number of evens with odds.
 */
import java.util.Scanner;

public class SherlockAndXOR {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t!=0){
			int n = scanner.nextInt();
			long a[] = new long[n];
			long even = 0;
			long odd = 0;
			
			for(int i = 0;i < n;i++){
				a[i]=scanner.nextLong();
				if(a[i]%2==0)
					even++;
				else
					odd++;
			}
			
			long ans = even*odd;
			System.out.println(ans);
				
			
			t--;
		}
	}
}
