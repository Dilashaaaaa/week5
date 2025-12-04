import java.util.Scanner;

/**
 * Write a description of class que9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class que9
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer");
        int num = scan.nextInt();
        int rev=0;
        int rem=0;
        while (num > 0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;

    
        }
         System.out.print("Reversed Number is: "
                         + rev);
    }
}