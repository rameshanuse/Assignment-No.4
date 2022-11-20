//Q5->WAP to implement Anagram Checking least inbuilt methods being used.
import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		
		// Using logics of String and arrays.
		
		String s1="Race";
		String s2="carE";
		
		String s3="";
		String s4="";
		
		//To make "Race" caps 
		for(int i=0; i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				s3=s3+(char)(s1.charAt(i)-32);
			}
			else
			{
				s3=s3+s1.charAt(i);
			}
		}
		System.out.println(s3);
		
		//To make "carE" caps
		for(int i=0; i<s2.length(); i++)
		{
			if(s2.charAt(i)>='a' && s2.charAt(i)<='z')
			{
				s4=s4+(char)(s2.charAt(i)-32);
			}
			else
			{
				s4=s4+s2.charAt(i);
			}
		}
		System.out.println(s4);
		
		char[] ch1=s3.toCharArray();
		char[] ch2=s4.toCharArray();
		
		//This Step-> character array to integer array
		int[] ar= new int[ch1.length];
		int j=0;
		for(int i=0; i<ch1.length; i++)
		{
			ar[i]=ch1[j];
			j++;
		}
		System.out.println("Before sorted");
		for(int elem: ar)
		{
			System.out.print(elem+" ");
		}
		
		//sorting of int array by bubble sort
		for(int i=0; i<ar.length; i++)
		{
			for(int k=1; k<ar.length-i; k++)
			{
				if(ar[k]<ar[k-1])
				{
					int tempVar=ar[k];
					ar[k]=ar[k-1];
					ar[k-1]=tempVar;
				}
			}
		}
		System.out.println();
		System.out.println("After sorted array ar");
		for(int elem: ar)
		{
			System.out.print(elem+" ");
		}
		
		//Convert int array to char array.
		char[] ch3= new char[ar.length];
		int m=0;
		for(int i=0; i<ch3.length; i++)
		{
			ch3[i]=(char) ar[m];
			m++;
		}
		System.out.println();
		
		
		System.out.println("The sorted char array ch3 ");
		for(char elem:ch3)
		{
			System.out.print(elem);
		}
		System.out.println();
		 
		//This Step-> char[] ch2=s4.toCharArray(); character array to integer array
		int[] a= new int[ch2.length];
		int n=0;
		for(int i=0; i<ch2.length; i++)
		{
			a[i]=ch2[n];
			n++;
		}
		System.out.println("Before sorted");
		for(int elem: a)
		{
			System.out.print(elem+" ");
		}
				
		//sorting of int array by bubble sort
		for(int i=0; i<ar.length; i++)
		{
			for(int k=1; k<a.length-i; k++)
			{
				if(a[k]<a[k-1])
				{
					int tempVar=a[k];
					a[k]=a[k-1];
					a[k-1]=tempVar;
				}
			}
		}
		System.out.println();
		System.out.println("After sorted array a");
		for(int elem: a)
		{
			System.out.print(elem+" ");
		}
				
		//Convert int array to sorted char array.
		char[] ch4= new char[a.length];
		int p=0;
		for(int i=0; i<ch4.length; i++)
			{
				ch4[i]=(char) a[p];
				p++;
			}
		System.out.println();
				
				
		System.out.println("The sorted char array ch4 ");
		for(char elem:ch4)
			{
				System.out.print(elem);
			}
		
		System.out.println();
		if(Arrays.equals(ch3, ch4))
		 {
			 System.out.println("The array is anagrame");
		 }
		 else
		 {
			 System.out.println("The array is not anagram");
		 }
	}
}
