import java.util.*;
public class employee 
{
    String name ;
    int empno,phn;
    void Enteremp()  
      {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Name :");
        name = obj.nextLine();  
       
        System.out.print("Enter Employee No :"); 
        empno = obj.nextInt();
        
        System.out.print("Enter Phone no :"); 
        phn = obj.nextInt();
      }
       
    void Printemp()
      {
        
        System.out.println("Name : "+name);
        
        System.out.println("Empo No : "+empno); 

        System.out.println("Phone no : "+phn); 
      }

    public static void main(String[] args) 
      {
        int i;  
        Employee obj[] = new Employee[50];

        for(i=0;i<5;i++) 
          {  
            obj[i] = new Main();
            obj[i].Enteremp(); 
          }
          
        for(i=0;i<5;i++) 
          {
            obj[i].Printemp();
          }
       }
}
