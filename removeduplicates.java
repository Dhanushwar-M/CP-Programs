import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   StringBuffer a=new StringBuffer();
	   a.append(sc.nextLine());
	   for(int i=0;i<a.length()-1;i++)
	   {
	       for(int j=i+1;j<a.length();j++)
	       {
	           if(a.charAt(i)==a.charAt(j))
	           {
	               a.deleteCharAt(j);
	           }
	   }
	}
	System.out.println(a);
}
}
