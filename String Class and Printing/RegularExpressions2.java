package regular.expressions.pkg2;

public class RegularExpressions2 {

    public static void main(String[] args) {
        String str="a!B@c#1$2%3";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
        
        String str2="abc    def    gh";
        System.out.println(str2.replaceAll("\\s+", " "));
        
        str2=str2.replaceAll("\\s+", " ").trim();
        
        String words[]=str2.split("\\s");
        
        System.out.println(words.length);
    }
    
}
