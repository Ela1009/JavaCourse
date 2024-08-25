package regular.expressions;

public class RegularExpressions {
    
    public static void main(String[] args) {
        int b=1000110;
        String str=String.valueOf(b);
        System.out.println(str.matches("[01]+"));
        
        String str2="234AB";
        System.out.println(str2.matches("[0-9A-F]+"));
    }
}
