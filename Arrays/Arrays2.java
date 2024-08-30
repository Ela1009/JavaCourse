package arrays2;

public class Arrays2 {

    public static void main(String[] args) {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
        
        int temp=A[0];
        
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
        
        
        int A2[]=new int[10];
        A2[0]=3;A2[1]=9;A2[2]=7;A2[3]=5;
        
        int n=4;
        
        for(int i=0;i<n;i++)
            System.out.print(A2[i]+",");
        System.out.println("");
        
        int x=20;
        int index=2;
        
        for(int i=n;i>index;i--)
            A2[i]=A2[i-1];
        
        A2[index]=x;
            
        for(int i=0;i<n+1;i++)
            System.out.print(A2[i]+",");
        System.out.println("");
        
    }  
}
