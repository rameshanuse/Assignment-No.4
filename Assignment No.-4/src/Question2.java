//Q2-> WAP to print Duplicates characters from the String.

public class Question2 {

	public static void main(String[] args) {
		String s1="lJkdtKjSdseet";//
		String s2="";
		
		// Converting String s1 to lower case
		for(int i=0; i<s1.length(); i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				s2=s2+(char)(s1.charAt(i)+32);
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}
		
		System.out.print(s2);
		
		char[] ch=s2.toCharArray();
		
		//char array to integer array
		
		int[] ar= new int[ch.length];
		int j=0;
		for(int i=0; i<ch.length; i++)
		{
			ar[i]=ch[j];
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
		int d=0;
		for(int i=0; i<n-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				d++;
			}
		}
		if(ar[n-1]==ar[n-2])
		{
			d++;
		}
		
		//Separation of duplicates from array
		
		int[] ar1=new int[n-d];
		int s=0;
		for(int i=0; i<n-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				ar1[s]=ar[i];
				s++;
			}
		}
		
		for(int el:ar1) 
		{
			//System.out.print(el+" ");
		}
		System.out.println();		
		System.out.println("The duuplicates present in a String are");
		
		//Converting integer to char array
		char[] ch1=new char[n-d];
		for(int i=0; i<ar1.length;i++)
		{
			ch1[i]=(char)ar1[i];
		}
		for(char el:ch1) {
			System.out.print(el+" ");
		}
	}

}
