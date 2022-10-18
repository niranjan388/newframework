package Generic;

public class upercase {

	
	public static void main(String[] args)

	{

	int sc=0,uc=0,lc=0;
	int Sum=0;

	String s="This is A eveint %&* ANd";
	 Sum=s.length();

	   char[] st=s.toCharArray();
	    

	for(int i=0; i<st.length; i++)
	{
	 if(st[i]>='a' && st.charAt(i)<='z')
	{
	 lc++;
	}
	else if(st.charAt(i)>='A' && st.charAt(i)<='Z')
	{
	 uc++;
	}
	else 
	{
	 sc++;
	}
	}

	System.out.println("upercase"+uc);
	System.out.println("Lowercase"+lc);
	System.out.println("spacialchar"+sc);
	System.out.println("totla"+Sum);
	}
	}

}
