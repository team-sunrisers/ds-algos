import java.io.*;
import java.util.*;
class SriSelection
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
			for(int j=i+1; j<n; j++)
			{      
				if(myIntArray.get(i)>myIntArray.get(j))
				{
					int temp;
					temp=myIntArray.get(j);
					myIntArray.set(j,myIntArray.get(i));
					myIntArray.set(i,temp);
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(myIntArray.get(i));
		}
	}
}
