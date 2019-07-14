import java.io.*;
import java.util.*;
class SriBubble
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		int len = 5; 
		int a=0;
		boolean read=true;
        	ArrayList<Integer> myIntArray = new ArrayList<Integer>(len);
		while(read == true)
		{ 
			System.out.println("Enter Number"); 
			a = in.nextInt();
			if(a!=0)
			{
				myIntArray.add(a);
			}
			else
			   read =false;
		}
		int n=myIntArray.size();
		for(int i=0;i<n;i++)
		{
			System.out.println(myIntArray.get(i));
		}
		for(int i=0; i<n-1; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{      
				if(myIntArray.get(j)>myIntArray.get(j+1))
				{
					int temp;
					temp=myIntArray.get(j);
					myIntArray.set(j,myIntArray.get(j+1));
					myIntArray.set(j+1,temp);
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(myIntArray.get(i));
		}
	}
}
