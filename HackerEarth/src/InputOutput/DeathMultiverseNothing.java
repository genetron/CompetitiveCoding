package InputOutput;

/*
 * 
 */

import java.util.Scanner;

public class DeathMultiverseNothing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		while(n!=0){
			int a = scanner.nextInt();
			System.out.println(a-1);
			
			n--;
		}
	}
}
