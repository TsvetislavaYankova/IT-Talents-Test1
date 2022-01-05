package test1_Season13;

import java.util.Scanner;

public class Task1 {
    /*
    Write a program that reads five characters separated by space – each one – the
    strength of a card. Possible inputs are from 2..9 or T, J, Q, K, A. If the input is invalid the
    program must output the following: “Invalid cards given!”. The inputs are infinite. The
    program must stop when 4 consecutive packs with a pair are dealt. A pack with a pair is a
    group of five cards where there is at least one card that is dealt twice. Finally, the program
    must print the number of tries.
     */
    public static void main(String[] args) {
        int tries = 0;
        int counter = 0;
        while (true) {
            String isPair = readInputLine();
            if (!(isPair.equals("pair"))) {
                counter = 0;
            } else {
                counter++;
            }
            tries++;
            if (counter == 4) {
                System.out.println("The number of tries is: " + tries);
                break;
            }
        }
    }

    static String readInputLine() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if (text.length() != 9) {
            System.out.println("Invalid cards given!");
            return "invalid";
        } else {
            String[] array = text.split(" ");
            for (int i = 0; i < array.length; i++) {
                if (!(array[i].equals("2") || array[i].equals("3") || array[i].equals("4") || array[i].equals("5") || array[i].equals("6") ||
                        array[i].equals("7") || array[i].equals("8") || array[i].equals("9") || array[i].equalsIgnoreCase("t") || array[i].equalsIgnoreCase("j")
                        || array[i].equalsIgnoreCase("q") || array[i].equalsIgnoreCase("k") || array[i].equalsIgnoreCase("a"))) {
                    System.out.println("Invalid cards given!");
                    return "invalid";
                }
            }
            for (int times = 0; times < array.length - 1; times++) {
                for (int i = times + 1; i < array.length - 1 - times; i++) {
                    if (array[times].equalsIgnoreCase(array[i])) {
                        return "pair";
                    }
                }
            }
            return "No pair!";
        }
    }
}
