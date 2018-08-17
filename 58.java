import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int cnt=0;
		for(int j=0;j<n;j++)
		{
			if(a[j]==k)
			{
			cnt=1;break;
			}
		}
		if(cnt==1)
		System.out.print("yes");
		else
		System.out.print("no");
		
	}
}
