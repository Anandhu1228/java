import java.util.*;
class areashape
{
	public static void main(String[] args) {
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the radius: ");
	  int r = sc.nextInt();
	  
	  	  System.out.println("Enter the length and breadth: ");
	  int l = sc.nextInt();
       int b = sc.nextInt();
	  System.out.println("Enter the base and height: ");
	  float c = sc.nextFloat();
       float h = sc.nextFloat();
       
       testclass obj = new testclass();
       obj.methodname(r);
       obj.methodname(l,b);
       obj.methodname(c,h);
	}
      class testclass
      {
          void methodname(int r)
          {
            System.out.println("Area of a circle = "+(3.14*r*r));  
          }
          void methodname(int l,int b)
          {
               System.out.println("area of rectangle = "+(l*b));
          }
          void methodname(float c,float h)
          {
               System.out.println("Area of a triangle = "+(0.5*c*h));
          }
      }
}
