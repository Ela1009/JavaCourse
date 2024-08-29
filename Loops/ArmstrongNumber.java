package armstrong.number;
import java.util.*;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int n=scan.nextInt();
        
        int m=n;
        int sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r*r*r;
        }
        
        if(sum==m)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}
