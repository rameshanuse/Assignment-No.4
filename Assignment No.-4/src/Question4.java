//Q4-> WAP to count the number of consonants, vowels, special characters in a String.

public class Question4 {

	public static void main(String[] args) {
		String s1="Alive*is*Awesome$";
		String s3="";
		
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				s3=s3+(char)(s1.charAt(i)+32);
			}
			else
			{
				s3=s3+s1.charAt(i);
			}
		}
		System.out.println(s3);
		
		char[] ch1=s3.toCharArray();
		
		//Char array ch1 to integer array 

		int[] ar= new int[ch1.length];
		int j=0;
		for(int i=0; i<ch1.length; i++)
		{
			ar[i]=ch1[j];
			j++;
		}
		for(int elem:ar)
		{
			//System.out.print(elem+" ");
		}
		
		//Bouble sort		
		int n=ar.length;
		for(int i=0;i<n; i++)
		{
			for(int k=1;k<n-i;k++)
			{
				if(ar[k]<ar[k-1])
				{
					int tempVar=ar[k];
					ar[k]=ar[k-1];
					ar[k-1]=tempVar;
				}
			}
		}
		
		for(int elem:ar)
		{
			//System.out.print(elem+" ");
		}	
		
		//Count Spatial char
		int countSpacialChar=0;
		for(int i=0; i<n; i++)
		{
			if(ar[i]>=33 && ar[i]<=64)
			{
				countSpacialChar++;
			}
		}
		System.out.println("Number of Spscial characters in a string are");
		
		System.out.println(countSpacialChar);
		
		String s2="aeiou";
		char[] ch2=s2.toCharArray();
		int n1=ch2.length;
		//Char array ch2 of to integer array 

		int[] ar1= new int[ch2.length];
		int h=0;
		for(int i=0; i<ch2.length; i++)
		{
			ar1[i]=ch2[h];
			h++;
		}
		for(int elem:ar1)
		{
			//System.out.print(elem+" ");
		}
		int countVowels=0;
		for(int i=0; i<ar.length; i++)
		{
			for(int k=0; k<ar1.length; k++)
			{
				if(ar1[k]==ar[i])
				{
					countVowels++;
				}
				else {
					
				}
			}
		}
		System.out.println("Number of vowels in String are");
		System.out.println(countVowels);
		
		String s4="bcdfghjklmnpqrstvwxyz";
		char[] ch3=s4.toCharArray();
		int n3=ch3.length;
		//Char array ch3 of to integer array 

		int[] ar3= new int[ch3.length];
		int m=0;
		for(int i=0; i<ch3.length; i++)
		{
			ar3[i]=ch3[m];
			m++;
		}
		for(int elem:ar3)
		{
			//System.out.print(elem+" ");
		}
		
		
		int countConsonents=0;
		System.out.println();
		for(int i=0; i<ar.length; i++)
		{
			for(int k=0; k<ar3.length; k++)
			{
				if(ar[i]==ar3[k])
				{
					countConsonents++;
				}
			}
		}
		System.out.println("Number of consonents in a String are");
		System.out.println(countConsonents);
	} 

}
