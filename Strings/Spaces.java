package Strings;

public class Spaces {
    public static void main(String[] args) {
        String str1 = "khushi Tiwari";
        for(int i=0;i<str1.length();i++){
           if(str1.charAt(i) == ' '){
            continue;
           }else{
            System.out.print(str1.charAt(i));
           }
            
        }
    }
}
