import java.util.Scanner;

/**
 * Write a description of class que7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que7
{
    public static void main(String[] args)
    {
    Scanner scan=new Scanner(System.in);
    
System.out.println("do you want to start");
String choice=scan.next();
while(choice==("yes"))
    {
    System.out.println("enter one numbers");
    int onenum=scan.nextInt();
       System.out.println("enter another numbers");
    int twonum=scan.nextInt();
    System.out.println("Which operation do you want to do (+,-,/,*)");
    char operator = scan.next().charAt(0);
    int result=0;
    if (operator=='+')
    {
        result=onenum+twonum;
    }
    else if(operator=='-')
    {
        result=onenum-twonum;
    }
    else if(operator=='*')
    {
        result=onenum*twonum;
    }
    else if(operator=='/')
    {
        result=onenum/twonum;
    }
    else {
System.out.println("Invalid");
    
    }
    System.out.println("Result" +result);
 System.out.print("Do you want to continue? (yes/nno): ");
    choice=scan.next();
        }    
    }      
    }
