package palindrome;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=scan.nextInt();
        int m=n;
        int rev=0,r;
        
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if(rev==m)
            System.out.println("Its a Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
