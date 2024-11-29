package Strings;

public class Repetative { 
    public static void main(String[] args) {
        String str1 = "khushi Tiwari";

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    System.out.println(str1.charAt(i));
                }
            }
        }
    }
}
