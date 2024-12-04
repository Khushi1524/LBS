package Strings;

public class Onlydigit {
    public static void main(String[] args) {
        String str = "12mg";
        boolean digit = false;
        char[] ch = str.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i] >='0' && ch[i] <='9'){
             digit = true;
             System.out.println(ch[i]+" ");
             break;
            }
        }
        if(!digit){
            System.out.println("contain no digit");
        }
    }
}
