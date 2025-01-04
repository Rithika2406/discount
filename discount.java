import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner S=new Scanner(System.in);
		int t=S.nextInt();
		while(t-->0)
		{
		    int x=S.nextInt();
		    if(x<=100)
		    {
		        System.out.println(x);
		        
		    }
		    else if(x>100 && x<=1000)
		    {
		        System.out.println(x-25);
		    }
		    else if(x>1000 && x<=5000)
		    {
		        System.out.println(x-100);
		    }
		    else{
		        System.out.println(x-500);
		    }
		}

	}
}
