package Strings;

public class Substring {
    public static void main(String[] args) {
        String str = "Hello world";
        String substr = "ld";
        int count = 0;

        for (int i = 0; i <= str.length() - substr.length(); i++) { 
            boolean match = true;

            for (int j = 0; j < substr.length(); j++) {
                if (str.charAt(i + j) != substr.charAt(j)) { 
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        System.out.println("The substring \"" + substr + "\" appears " + count + " times.");
    }
}
