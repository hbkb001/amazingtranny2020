package nz.ac.eit.amzingtrany;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Amazing Translator
 * aka Amazing Trany
 */
public class App {
    public static void main(String[] args) {

        TranslationDictionaries translationDictionaries=new TranslationDictionaries();
        translationDictionaries.initializeTranslations();


        String letterAsString;
        do {
            System.out.println("Type a number between 1-30");
            Scanner scanner = new Scanner(System.in);
            String numberAsString = scanner.nextLine();
            Integer number = null;
           
            try {
                number = Integer.parseInt(numberAsString);
                System.out.println(number);
            } catch (NumberFormatException nfe) {
                System.out.println("The Number has to be Numeric");

            }

            System.out.println("What is the language to be used? Type 1 for French or 2 for German");
            String optionAsString = scanner.nextLine();
            Integer option = null;
            try {
                option = Integer.parseInt(optionAsString);
                System.out.println(option);
            } catch (NumberFormatException nfe) {
                System.out.println("The option has to be Numeric");
                System.exit(100);
            }
            // Check that the option is 1 or 2

            try {
                System.out.println(translationDictionaries.getTranslationOf(number,option));
            } catch (LanguageNotSupportedException e) {
                e.printStackTrace();
            } catch (NumberOutOfRangeException e) {
                e.printStackTrace();
            }

            // Recycle Program
            System.out.println("Do you want to translate another number? /n If Yes type Y if No type N");
            letterAsString = scanner.nextLine();
        }
        while (letterAsString.equalsIgnoreCase("Y")||letterAsString.equalsIgnoreCase("Yes"));

    }
}
