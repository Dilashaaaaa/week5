import java.util.Scanner;

/**
 * Write a description of class Tut_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tut_5
{
    public static void main(String[] args){
        
        //for loop
    int sum=0;
    Scanner input=new Scanner(System.in);
    System.out.println("enter range");
    int range=input.nextInt();
    for(int i=1;i<=range;i++)
    
    {
    
    sum=sum+i;
 
    }
        System.out.println(sum);
        
        
        //  while loop
        int j=1;
        while(j<=5)
        
        {
        
        System.out.println(j);
        j++;
        }
        
        //do while
        int k=1;
        do
        {
        System.out.println(k);
        k++;  
        }
        while(k<1);
        
        
          // breakle exit 
          for(int d=1; d<=10;d++)
          {
              if(d==3)
            {
            
            break;
            
            }
                System.out.println(d);
            }
            
            //continue le skip 
            
            for(int e=1; e<=10;e++)
          {
              if(e==3)
            {
            
            continue;
            
            }
                System.out.println(e);
            }
            
            // odd num 
            for(int f=1; f<=10;f++)
          {
              if(f%2==1)
            {
            
            continue;
            
            }
                System.out.println(f);
            }
            
    }
}