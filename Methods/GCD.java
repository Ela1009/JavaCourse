package gcd;

public class GCD {

    static int greatestCommonDivisor(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)
                m=m-n;
            else
                n=n-m;
        }
        return m;
    }
    
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(25,15));
    }
}
