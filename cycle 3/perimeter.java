import java.util.*;
public class perimeter
{
	public static void main(String[] args) {
	
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r = obj.nextInt();
		System.out.println("Enter the length and breadth: ");
		int l = obj.nextInt();
		int b = obj.nextInt();
		
			testclass obj1 = new testclass(r);
		obj1 = new testclass(l,b);
	}
	
	class testclass
	{
	    testclass(int r)
	    {
	        System.out.println("Perimeter of a circle ="+(2*3.14*r));
	    }
	    
	    testclass(int l,int b)
	    {
	       System.out.println("Perimeter of a rectangle ="+(2*(l+b)));  
	    }
	}
}
