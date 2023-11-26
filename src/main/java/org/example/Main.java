package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рядок для перевірки на паліндром: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println("Це паліндром");
        } else System.out.println("Це не паліндром");
    }

    public static boolean isPalindrome(String str) {
        // Видаляємо пробіли та регістрові різниці
        if (str == null) {
            return true;
        }
        String cleanStr = str.replaceAll("\\s+", "");
        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}