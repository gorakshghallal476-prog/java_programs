// extract digit from String 

import java.util.*;
public class ExtractDigit
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter input :");
		String str=sc.nextLine();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='0' && c<='9')
			{
				
				result.append(c);
			}
			
		}
		System.out.println(result);
	}
}