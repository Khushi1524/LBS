package Strings;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        sortArray(arr1);
        sortArray(arr2);

        boolean isAnagram = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are not Anagrams");
        }
    }

    public static void sortArray(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
