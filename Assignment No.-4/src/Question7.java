//Q7->WAP to find if String contains all unique characters.
public class Question7 {

	public static void main(String[] args) {
		String s1="SACHIN";
		boolean flag=false;
		System.out.println(s1);
		
		char[] ch=s1.toCharArray();
		
		//Convert to integer Array		
		int k=0;
		int[] ar=new int[ch.length];
		for(int i=0; i<ch.length; i++)
		{
			ar[i]=ch[k];
			k++;
		}
		for(int elem:ar)
		{
			//System.out.print(elem+" ");
		}
		
		//Bouble sort
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=1; j<ar.length-1; j++)
			{
				if(ar[j]<ar[j-1])
				{
					int tempVar=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=tempVar;
				}
			}
		}
		for(int elem:ar)
		{
			//System.out.print(elem+" ");
		}
	
		//Convert to char Array
		char[] ch1=new char[ar.length];
		
		for(int i=0; i<ar.length; i++)
		{
			ch1[i]=(char)ar[i];
		}
		for(char elem:ch1)
		{
			System.out.print(elem+" ");
		}
		System.out.println();
		
		
		for(int i=0; i<ch1.length-1;i++)
		{
			if(ch1[i]==ch1[i+1])
			{
				System.out.println("The String does not have all unique characters");
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("String contains all unique characters");
		}

	}

}
