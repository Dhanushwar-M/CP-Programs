import java.util.Scanner;

public class Pn {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int[] s=new int[a];
        for(int i=0;i<a;i++)
        {
            s[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(i%2!=0 && s[i]>0)
                {
                    int temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
                else
                {
                    if(i%2==0 && s[i]<0)
                    {
                        int temp=s[i];
                        s[i]=s[j];
                        s[j]=temp;
                    }
                }
            }
            System.out.print(s[i]+" ");
        }

    }
}
