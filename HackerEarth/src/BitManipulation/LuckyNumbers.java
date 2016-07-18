package BitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/*PROBLEM
 * Golu wants to find out the sum of Lucky numbers.Lucky numbers are those numbers which contain exactly two set bits.This task is very diffcult for him.So Help Golu to find sum of those numbers which exactly contain two set bits upto a given number N.

3 5 10 are lucky numbers where 7 14 are not.

INPUT

First line contain number of test cases T.Each test case contains a single number N.
OUTPUT

Print sum of all Lucky Numbers upto N.Output may be large so take modulo with 1000000007.

Constraints

1<=T<=105
1<=N<=1018

NOTE: Since value of test cases and n is really large, please use fast I/O optimization techniques.
 */
public class LuckyNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while(t!=0){
			BigInteger finalCount = new BigInteger("0");
			BigInteger n = new BigInteger(br.readLine());			
			String start = startInt(n.toString(2));
			
			//array traversing logic pending//

			BigInteger current = new BigInteger(start,2);
			System.out.println(current);
			
			
			t--;
		}
		
	}

	public static String startInt(String s) {
		// TODO Auto-generated method stub
		int count = 0;
		char c[] = s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(count < 2 && c[i]=='1')
				count++;
			else if(count >= 2 && c[i]=='1')
				c[i]='0';
		}
		String first = new String(c);
		return first;
	}
}
