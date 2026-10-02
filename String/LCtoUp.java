//lc to up without inbuilt function 

import java.util.*;
public class LCtoUp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter lowercase String ");
		String str=sc.nextLine();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='a' && c<='z')
			{
				c=(char)((int)c-32);
			}
			result.append(c);
		}
		System.out.print(result);
	}
}