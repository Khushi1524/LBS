package Strings;

public class StringEquality {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        
        if (str1.length() != str2.length()) {
            System.out.println("Strings are not equal");
        } else {
            boolean isEqual = true;

            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) {
                System.out.println("Strings are equal");
            } else {
                System.out.println("Strings are not equal");
            }
        }
    }
}
