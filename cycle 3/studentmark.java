import java.util.*;
class studentmark
{
    public static void main (String[] args)
    {
        Student s=new Student();
        s.Read();
        s.Display();
    }
}
class Student
{
    String name;
    int rollno,i;
    int m[]=new int[5];
    
    void Read()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=in.nextLine();
        System.out.println("Enter your roll number:");
        rollno=in.nextInt();
        System.out.println("Enter the marks of 5 subjects.");
        for(i=0;i<5;i++)
        {
            System.out.println("Enter marks of subject"+(i+1));
            m[i]=in.nextInt();
        }
    }
    void Display()
    {
        System.out.println("The entered list is:");
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+rollno);
        for(i=0;i<5;i++)
        {
            System.out.println("Marks of subject "+(i+1)+" is "+m[i]); 
        }
    }
}
