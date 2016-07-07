package Algorithms;

import java.util.Scanner;

public class SaveThePrisoners {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		
		while(t!=0){
			int prisoners = scanner.nextInt();
			int sweets = scanner.nextInt();
			int startID = scanner.nextInt();
			
			long temp = sweets+startID-1;
			long ans = 0;
			if(temp>prisoners)
				ans = temp%prisoners;
			else if(temp==0)
				ans = prisoners;
			else 
				ans = temp;
			
			if(ans==0)
				ans = prisoners;
			System.out.println(ans);
			
			t--;
		}
	}
}
