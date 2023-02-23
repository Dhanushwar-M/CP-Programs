import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int sum=0,sum1=0;
	    for(int i=1;i<=a-1;i++)
	    {
	        if(a%i==0)
	        {
	            sum=sum+i;
	        }
	    }
	    for(int j=1;j<=sum-1;j++)
	    {
	        if(sum%j==0)
	        {
	            sum1=sum1+j;
	        }
	    }
	    if(a==sum1)
	    {
	        System.out.println("1");
	    }
	    else{
	        System.out.println("0");
	    }
	}
}
