// palindrome check
import java.util.*;
public class Palindrome
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input :");
		String str=sc.nextLine();
		int l=0,  r=str.length()-1;
		boolean isPalindrome=true;
		while(l<r)
		{
			
			if(str.charAt(l)!=str.charAt(r))
			{
				
				isPalindrome=false; break;
			}
			l++;
			r--;
			
		}
		System.out.println(isPalindrome);
	}
}