package Algorithms;

import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		Stack s1 = new Stack();
		Stack s2 = new Stack<>();
		Stack s3 = new Stack();
		int a1=0,a2=0,a3=0;
		
		for(int i = 0; i<n1;i++){
			int a = scanner.nextInt();
			a1=a1+a;
			s1.push(a);
			
		}
		for(int i = 0; i<n2;i++){
			int a = scanner.nextInt();
			s2.push(a);
			a2+=a;
		}
		for(int i = 0; i<n3;i++){
			int a = scanner.nextInt();
			s3.push(a);
			a3+=a;
		}
		
		s1 = reverseStarck(s1);
		s2 = reverseStarck(s2);
		s3 = reverseStarck(s3);

		
		while(!(a1==a2 && a2==a3 && a1==a3)){
			int poppingStack = maxAdditionStack(a1,a2,a3);
			if(poppingStack==1){
				a1-=(Integer)s1.peek();
				s1.pop();
			}
			else if(poppingStack==2){
				a2-=(Integer)s2.peek();
				s2.pop();
			}
			else{
				a3-=(Integer)s3.peek();
				s3.pop();
			}
							
		}
		
		System.out.println(a1);
	}

	private static Stack reverseStarck(Stack s1) {
		Stack temp = new Stack();
		while(!s1.isEmpty()){
			temp.push(s1.peek());
			s1.pop();
		}
		return temp;
	}

	private static int maxAdditionStack(int a1, int a2, int a3) {
		
		if(a1>=a2 && a1 >= a3)
			return 1;
		else if(a2>=a1 && a2>=a3)
			return 2;
		else
			return 3;
		
	}

	private static int add(Stack s1) {
		int ans=0;
		for (Object object : s1) {
			ans+=(Integer)object;
		}
		return ans;
	}
}
