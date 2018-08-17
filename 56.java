import java.util.*;
import java.lang.*;
import java.io.*;
class Guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();int al=0,dt=0;
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(Character.isLetter(ch))
			{
				al=1;
			}
			else if(Character.isDigit(ch))
			{
				dt=1;
			}
		}
		if(al==1 && dt==1)
		System.out.print("Yes");
		else
		System.out.print("No");
	}
}
