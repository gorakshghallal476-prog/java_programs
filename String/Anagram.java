import java.util.*;
public class Anagram
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first String :");
		String s1=sc.nextLine();
		System.out.println("enter secound String :");
		
		String s2=sc.nextLine();
		if(s1.length()!=s2.length())
		{System.out.println("not anagram");
			return;
		}
		/*char [] c1=s1.toCharArray();
		char [] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		int l=0,  r=s1.length()-1;
		
		boolean isAnagram=true;
		while(l<r)
		{
			
			if(c1[l]!=c2[l])
			{
				
				isAnagram=false; break;
			}
			l++;
			
			
		}
		System.out.println(isAnagram);
		*/
		
		
		
		
		
		// frequency array method 
		
		int freq[] = new int[256];

			for(int i=0;i<s1.length();i++)
			{
				freq[s1.charAt(i)]++;
				freq[s2.charAt(i)]--;
			}

			boolean isAnagram = true;

			for(int i=0;i<256;i++)
			{
				if(freq[i] != 0)
				{
				isAnagram = false;
				break;
				}
			}
			System.out.println(isAnagram);

	}
}