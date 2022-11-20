// WAP to find the maximum occurring character in a String.
public class Question8 {

	public static void main(String[] args) {
		
		String s1="SURESH IS MY BEST FRIEND";
		System.out.println(s1);
		int[] ar=new int[127];
		
		for(int i=0;i<s1.length(); i++)
		{
			ar[s1.charAt(i)]=ar[s1.charAt(i)]+1;		
		}
		
		int max=-1;
		char c=' ';
		for(int i=0;i<s1.length(); i++)
		{
			if(max<ar[s1.charAt(i)])
			{
				max=ar[s1.charAt(i)];
				c=s1.charAt(i);
			}
		}
		System.out.println("The maximum occurring character in a String is "+"->"+" "+(c));
	}

}
