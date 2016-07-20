package BitManipulation;

import java.util.Scanner;

/*
 * https://www.hackerearth.com/problem/algorithm/the-castle-gate-july-easy/
 */

/*
 * Status: All test cases accepted
 */

public class TheCastleGate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t!=0){
			int n = scanner.nextInt();
			int counter=0;
			for(int i=1;i<n;i++){
				for(int j=i+1;j<=n;j++){
					if((i^j)<=n)
						counter++;
				}
			}
			
			System.out.println(counter);
			t--;
		}
	}
}
