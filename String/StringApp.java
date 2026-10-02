// all String method program 

public class StringApp
{
	public static void main(String x[])
	{
		String s=" my name is Goraksh  ";
		String s1=" surname is ghallal  ";
		System.out.println("first String :" + s);
		System.out.println("secound String :"+ s1);
		System.out.println("operatio on String 1");
		System.out.println("length os string is : " + s.length());
		System.out.println("uppercase  : " + s.toUpperCase());
		System.out.println("index   : " + s.indexOf('b'));
		System.out.println("cahr at position  : " + s.charAt(15));
		System.out.println("cahr at position  : " + s.endsWith("Goraksh"));
		System.out.println("concatination :"+ s.concat(s1));
		System.out.println("subString  :" + s.substring(5,12));
		String [] str=s.split(" ");// sepration string is neccesary 
		
		for(String n:str)
		{
			System.out.print(n+" ");
		}
	}
}