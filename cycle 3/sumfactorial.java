import java.util.*;

class sumfactorial
{
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
        sumfactorial c=new sumfactorial();
        System.out.println("Enter an Integer");
        n=sc.nextInt();
        c.Factorial(n);
        c.Sum(n);
    }
    void Factorial(int n)
    {
        int i,fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial is: "+fact);
    }
    void Sum(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println("Sum of digits of the given integer is: "+sum);
    }
    
}
