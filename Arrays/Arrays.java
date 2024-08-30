package arrays;

public class Arrays {

    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        int sum=0;
        int max=A[0];
        int max2=A[0];
        
        for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
            
            if(A[i]>max)
            {
                max2=max;
                max=A[i];
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        System.out.println("Sum is: "+sum);
        System.out.println("Largest element is: "+max);
        System.out.println("Second largest element is: "+max2);
    }
}
