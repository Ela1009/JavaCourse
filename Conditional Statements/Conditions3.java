package conditions3;
import java.util.*;

public class Conditions3 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year=scan.nextInt();
        
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("It is a Leap Year");
                }
                else
                {
                    System.out.println("Not a Leap Year");
                }
            }
            else
            {
                System.out.println("It is a Leap Year");
            }
        }
        else
        {
            System.out.println("Not a Leap Year");
        }
    }
}
