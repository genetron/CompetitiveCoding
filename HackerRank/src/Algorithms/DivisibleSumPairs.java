package Algorithms;

import java.util.Scanner;

public class DivisibleSumPairs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] array = new int[n];
		
		for(int i=0;i<n;i++){
			array[i]=scanner.nextInt();
		}
		
		int counter=0;
		for(int i=0;i<n-1;i++){
			for(int j = i+1;j<n;j++){
				if((array[i]+array[j])%k==0)
					counter++;
			}
		}
		
		System.out.println(counter);
	}
}
