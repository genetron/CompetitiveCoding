import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TheNextPalindrome {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		//scanner.nextLine();

		while(t>0){
			String s = br.readLine();
			char c[] = s.toCharArray();

			//check length
			boolean isLengthEven;
			if(s.length()%2==0)
				isLengthEven=true;
			else isLengthEven=false;


			//Logic for all 9
			//check if all 9
			boolean isAll9 = true;
			for(int i=0;i<s.length();i++){
				if(c[i]!='9'){
					isAll9=false;
					break;
				}
			}
			//if all 9, increment by 2
			if(isAll9){
				StringBuilder sb = new StringBuilder("");
				for(int i = 0;i<=s.length();i++)
					sb.append('0');
				sb.setCharAt(0, '1');
				sb.setCharAt(s.length(), '1');
				System.out.println(sb);
				continue;
			}


			//Logic for palindrome
			boolean ispalin = ispalin(s);

			if(ispalin){
				//if even length
				if(isLengthEven){
					//if middle element is not 9
					if(c[s.length()/2-1]!='9'){
						c[(c.length/2)-1]+=1;
					}
					else{
						c=forwardCarry(c,(c.length/2)-1);						
					}
				}

				//odd length
				else if(!isLengthEven){
					//if middle element is not 9
					if(c[s.length()/2]!='9'){
						c[c.length/2]+=1;
					}
					else{
						c=forwardCarry(c, c.length/2);
					}
				}		

				//mirror and print
				String ans = mirror(c);
				System.out.println(ans);
			}

			//Logic for non-palin
			else{
				//if even
				if(isLengthEven){
					String ans="";
					for(int i=(c.length/2)-1,j=c.length/2;i>=0;i--,j++){
						int ip=c.length/2-1,jp=c.length/2;
						if(c[i]>c[j]){
							ans=mirror(c);
							break;
						}
						else if(c[i]<c[j]){
							c[i]+=1;
							ans=mirror(c);
							break;
						}
						else{
							if(c[ip]=='9')
								c=forwardCarry(c, c.length/2-1);
							else
								c[ip]+=1;
							
							ans = mirror(c);
							break;		
						}
						
					}
					System.out.println(ans);
				}
				//if odd
				else{
					String ans="";
					for(int i=(c.length/2)-1,j=(c.length/2)+1;i>=0;i--,j++){
						int ip=c.length/2;
						if(c[i]>c[j]){
							ans=mirror(c);
							break;
						}
						else if(c[i]<c[j]){
							if(c[ip]=='9')
								c=forwardCarry(c, c.length/2);
							else
								c[ip]+=1;
							
							ans = mirror(c);
							break;			
						}
						else{
							if(c[ip]=='9')
								c=forwardCarry(c, c.length/2);
							else
								c[ip]+=1;
							
							ans = mirror(c);
							break;									
						}
					}
					System.out.println(ans);
					
				}

			}
			t--;
		}




	}
	private static char[] forwardCarry(char[] c, int i) {
		do {
			c[i]='0';
			i--;
		} while (c[i]=='9');
		c[i]+=1;

		return c;
	}


	private static String mirror(char[] c) {

		for(int i=0,j=c.length-1,k=0;k<=c.length/2;i++,j--,k++){
			c[j]=c[i];
		}

		return new String(c);
	}

	private static boolean ispalin(String s) {
		boolean isPalin = true;
		for(int i=0,j=s.length()-1,k=0;k<=s.length()/2;i++,j--,k++){
			if(s.charAt(i)!=s.charAt(j)){
				isPalin=false;
				break;
			}
		}
		return isPalin;

	}
}
