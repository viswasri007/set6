import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int cnt=0;
		if(n!=0)
		{
		while(n!=0)
		{
			cnt++;
			n=n/10;
		}
		
		System.out.print(cnt);	
		}
		else
		System.out.print("1");
		
		
	}
}
