package BitManipulation;

/*
 * https://www.hackerearth.com/problem/algorithm/xsquare-and-two-strings-1/
 */

/*
 * Status: AC
 */

import java.util.Scanner;

public class XsquareAndTwoStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		
		
		while(t!=0){
			int a[]=new int[150];
			int b[]=new int[150];
			String s1 = scanner.nextLine();
			String s2 = scanner.nextLine();
			
			for(int i=0;i<s1.length();i++)
				a[s1.charAt(i)]=1;
			for(int i=0;i<s2.length();i++)
				b[s2.charAt(i)]=1;
			String ans="No";
			for(int i=33;i<=130;i++){
				if(a[i]==1 && b[i]==1){
					ans="Yes";
					break;
				}
			}
			System.out.println(ans);
			t--;
		}
	}
}
