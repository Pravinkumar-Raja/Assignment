package com.example;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Polindrome {

	
	public String polindrome(String s)//mmom
	{
		
		String longest="";
		for(int i=0;i<s.length();i++)//i=0;i<4;i++
		{
			for(int j=i+1;j<=s.length();j++)//j=1;j<=4;j++
			{
				String sub=s.substring(i,j);//sub=substrin(0,1);
				boolean bool=true;
				int k=0;
				int l=sub.length()-1;//l=2;
				
				while(k<l)
				{
				
					if(sub.charAt(k)!=sub.charAt(l))
					{
						bool=false;
						break;
					}
					
					k++;
					l--;
				}
				
	
				if(bool==true && sub.length()>longest.length())
				{
					longest=sub;
				}
				
			}
			
		}
		return longest;
	}
	
	public boolean polindromeNor(String s)
	{
		boolean bool1=false;
		StringBuffer sb=new StringBuffer(s);
		
		if(s.equals(sb.reverse().toString()))
		{
			bool1=true;
		}
		System.out.println(bool1);
		return bool1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();//mmom
		Polindrome p=new Polindrome();
		
		System.out.println(p.polindrome(s));
		boolean bool=p.polindromeNor(s);
	
		if(bool==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a polindrome");
		}
	}
}
