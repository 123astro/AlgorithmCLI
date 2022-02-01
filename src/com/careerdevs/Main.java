package com.careerdevs;

import java.util.Locale;

public class Main {
      /*
      repeat a string
        Reverse a string
        two makes ten
        how many vowels
        get word count
        capture the rook
     */

    public static void main(String[] args) {
        // write your code here

        System.out.println("Welcome To The Algorithm CLI");
        mainMenu();

    }

    private static void mainMenu() {
        System.out.println(UI.lineSpacer() + " \n\t\t MAIN MENU\n" + UI.lineSpacer());
        System.out.println("1) Repeat A String");
        System.out.println("2) Reverse a String");
        System.out.println("3) Two makes Ten");
        System.out.println("4) How amy Vowels");
        System.out.println("5) Get Word Count");
        System.out.println("6) Capture the Rook");
        System.out.println("7) Exit The Program");

        int userSelection = UI.readInt("Select an option.", 1, 7);
        switch (userSelection) {
            case 1 -> repeatAString();
            case 2 -> reverseAString();
            case 3 -> twoMakesTen();
            case 4 -> howManyVowels();
            case 5 -> getWordCount();
            case 6 -> captureTheRook();

            case 7 -> System.out.println("Thank you for using the program...");
        }
    }

    private static void captureTheRook() {

    }

    private static void getWordCount() {
        String q ="Enter a string to count the words in";
        String userString = UI.readString(q).trim();
        int numOfSpaces = 0;
        for (int i = 0; i < userString.length(); i++) {
            char tempChar = userString.charAt(i);
            if (tempChar == ' '){
                numOfSpaces++;
            }
        }
        System.out.println("The number of words is equal to :  " + (numOfSpaces + 1) );
    }

    private static void howManyVowels() {
        String q = "Enter a string to count the vowels in";
        String userString = UI.readString(q).toLowerCase(Locale.ROOT);
        int numOfVowels = 0;
        for (int i = 0; i < userString.length(); i++) {
            char tempChar = userString.charAt(i);
            if (tempChar == 'a' || tempChar == 'e' || tempChar == 'i' || tempChar == 'o' || tempChar == 'u') {
                numOfVowels++;
            }
        }
        System.out.println("The String has " + numOfVowels + " vowel(s)");
        mainMenu();
    }


    private static void twoMakesTen() {
        String q1 = "Enter the first number";
        String q2 = "Enter the second number";
        int num1 = UI.readInt(q1, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int num2 = UI.readInt(q2, Integer.MIN_VALUE, Integer.MAX_VALUE);

        if (num1 == 10 || num2 == 10 || (num1 + num2 == 10)) {
            System.out.println("Makes ten");
        } else {
            System.out.println("Does not make 10");
        }

        mainMenu();
    }

    private static void reverseAString() {
        String ques1 = "Enter A String To Reverse";
        String reversedString = "";
        String strToReverse = UI.readString(ques1);
        for (int i = 0; i < strToReverse.length(); i++) {
            reversedString = strToReverse.charAt(i) + reversedString;
        }
        System.out.println(reversedString);
    }

    private static void repeatAString() {
        String strToRepeat = UI.readString("Enter a String to Repeat");
        int numOfRepeats = UI.readInt("How many times do you want it to repeat? ", 2, 1000);

        String repeatedString = strToRepeat.repeat(numOfRepeats);

        System.out.println("\nYour repeated string:\n" + repeatedString + "\n");
        mainMenu();
    }
}
