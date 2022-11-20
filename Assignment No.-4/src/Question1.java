//Q1-> WAP to remove Duplicates from a String.(Take any String ex with duplicates character)

public class Question1 {

	public static void main(String[] args)
	{
		String ex="Dkkddree";
		ex.replace(" ", "");
		String ex2="";
		
		//Convert String to caps
		
		for(int i=0; i<ex.length();i++)
		{
			if(ex.charAt(i)>='a' && ex.charAt(i)<='z')
			{
				ex2=ex2+(char)(ex.charAt(i)-32);
			}
			else
			{
				ex2=ex2+ex.charAt(i);
			}
		}		
		System.out.println(ex2);
	
		char[] ch1=ex2.toCharArray();
		
		//To integer array
		int[] ar= new int[ch1.length];
		int j=0;
		for(int i=0; i<ch1.length; i++)
		{
			ar[i]=ch1[j];
			j++;
		}
		// System.out.println("Before sorted");
	
		for(int elem: ar)
		{
			//System.out.print(elem+" ");
		}
	
		
		//Bouble sort 

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
		// System.out.println("After sorted array ar");
		for(int elem: ar)
		{
			//System.out.print(elem+" ");
		}
		System.out.println();
		
		int n=ar.length;
		int s=0; 
		for(int i=0; i<n-1; i++)
		{
			if(ar[i]==ar[i+1])
			{
				s++;
			}
		}		
		
		int[] br= new int[n-s];
		int d=0;
		for(int i=0; i<n-1; i++)
		{
			if(ar[i]!=ar[i+1])
			{
				br[d]=ar[i];
				d++;
			}
		}
		if(ar[n-1]!=ar[n-2])
		{
			br[d]=ar[n-1];
		}
		
		for(int elem:br)
		{
			// System.out.print(elem+" ");	
		}	
		
		//convert int array to char array
		
		char [] ch=new char[br.length];
		int p=0;
		
		for(int i=0; i<br.length; i++)
		{
			ch[i]=(char) br[i];
			p++;
		}
		
		System.out.println("After removing Duplicates from a String ");
		for(char elem:ch)
		{
			System.out.print(elem);
		}
		System.out.println();
		
	}
}
