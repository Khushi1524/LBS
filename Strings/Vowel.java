package Strings;

class VowelChecker {
    public static void main(String[] args) {
        String str = "khushi Tiwari";
        boolean containsVowel = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                
                System.out.println("Vowel: " + ch);
                containsVowel = true;
            }
        }

        if (!containsVowel) {
            System.out.println("No vowels found in the string.");
        }
    }
}
