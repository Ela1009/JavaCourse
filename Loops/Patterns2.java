package patterns2;

public class Patterns2 {

    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=5;i++)
        {
            //for(int j=1;j<=i;j++)
            for(int j=1;j<=5-i+1;j++)
            {
                count++;
                //System.out.print(j+" ");
                //System.out.print(count+" ");
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
}
