import java.util.Scanner;

public class Arith_SimpleArithmetics {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		scanner.nextLine();
		
		while(t>0){
			String s = scanner.nextLine();
			String []parts = s.split("\\+|\\-|\\*");
			String part1 = parts[0];
			String part2 = parts[1];
			
			String ans="";
			if(s.contains("+"))
				add(part1,part2);
			else if(s.contains("-"))
				sub(part1,part2);
			else if(s.contains("*"))
				mul(part1,part2);
			
			t--;
		}
	}

	private static void mul(String part1, String part2) {
		// TODO Auto-generated method stub
		
	}

	private static void sub(String part1, String part2) {
		// TODO Auto-generated method stub
		
	}

	private static void add(String part1, String part2) {
		if(part1.length()>part2.length())
			part2=zeroAdd(part1.length(),part2);
		else if(part1.length()<part2.length())
			part1=zeroAdd(part2.length(), part1);
		
		System.out.println(part1);
		System.out.println(part2);
		char ans[]=new char[part1.length()];
		int carry=0;
		int finalCarryFlag=0;
		for(int i=part1.length()-1;i>=0;i--){
			int addition=Character.getNumericValue(part1.charAt(i))+Character.getNumericValue(part2.charAt(i))+carry;
			if(addition>=10){
				ans[i]=Integer.toString(addition).charAt(1);
				carry=1;
			}
			else{
				ans[i]=Integer.toString(addition).charAt(0);
				carry=0;
			}		
		}
		String s = new String(ans);
		if(carry!=0)
			s="1"+s;
		
		
		System.out.println(s);
	}

	private static String zeroAdd(int length, String part2) {
		int numberOfSpaces = length-part2.length();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<numberOfSpaces;i++){
			sb.append("0");
		}
		sb.append(part2);
		return sb.toString();
	}
}
