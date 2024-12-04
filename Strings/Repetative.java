package Strings;

public class Repetative { 
    public static void main(String[] args) {
        String str = "wwwqfgg".toLowerCase();
        int[] frequency = new int[256];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            frequency[ch]++;
        }

        for(int i=0;i<256;i++){
            if(frequency[i] > 1 && i != ' '){
                System.out.println((char)i);
            } 
        }


    }
}
