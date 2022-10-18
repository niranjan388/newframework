package Generic;

public class vowles {

	public static void main(String[] args) {
		int vcount=0,ccount=0;
		 String Str="This is new One";
		 String St = Str.toLowerCase();

		for(int i=0; i<Str.length(); i++)
		{
		 
		if(St.charAt(i)=='a' || St.charAt[i]=='e' || St.charAt[i]=='i' || St.charAt[i]=='o' || St.charAt[i]=='u')
		{
		 vcount++;
		}
		else
		{

		 ccount++;
		}

		}
		System.out.println("The no of vowles is "+vcount);
		System.out.println("The no of consonates "+ccount);
		}
		}
	}

}
