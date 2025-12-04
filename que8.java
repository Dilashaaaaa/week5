import java.util.Scanner;

/**
 * Write a description of class que8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que8
{
    public static void main(String[] args)
    {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter one numbers");
    int num=scan.nextInt();
    System.out.println("Multiplication Table of "+num +":");
    for(int i =1;i<=10;i++)
    {
    System.out.println(num + "x" + i + "="+(num *i));
    
    
    }
    
}
}