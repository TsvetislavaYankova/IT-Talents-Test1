package test1_Season13;

import java.util.Scanner;

public class Task2 {
    /*
    Write a method that takes a String variable that holds some text. The method must
    output the sentence with the longest word, the longest sentence and the number of sentences.
    It`s given that each sentence ends with a dot and each word is separated with a space.
    Example: Today is a good day for test. The sun is shining. The students are happy. The birds are blue.
    Output: Total sentences: 4
    Longest sentence: Today is a good day for test.
    Sentence with the longest word: The students are happy.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        outputMethod(text);
    }

    static void outputMethod(String text) {
        int countDots = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') {
                countDots++;
            }
        }
        System.out.println("The number of sentences is: " + countDots);
        int countMaxSentence = 0;
        int indexMaxSentence = 0;
        int max = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != '.') {
                max++;
            } else {
                if (max > countMaxSentence) {
                    countMaxSentence = max;
                    indexMaxSentence = i - max;
                }
                max = 0;
            }
        }
        System.out.print("Longest sentence: ");
        for (int i = indexMaxSentence; i < text.length(); i++) {
            if (text.charAt(i) != '.') {
                System.out.print(text.charAt(i));
            } else {
                System.out.println('.');
                break;
            }
        }
        int countMaxWord = 0;
        int maxWord = 0;
        int indexMaxWord = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != '.' && text.charAt(i) != ' ') {
                maxWord++;
            } else {
                if (maxWord > countMaxWord) {
                    countMaxWord = maxWord;
                    indexMaxWord = i - maxWord;
                }
                maxWord = 0;
            }
        }
        String longestWord = text.substring(indexMaxWord+1, (indexMaxWord + countMaxWord + 1));
        String[] array = text.split("\\.");
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(longestWord)) {
                System.out.print("Sentence with longest word:");
                System.out.print(array[i]);
                System.out.println(".");
            }
        }
    }
}
