package nz.ac.eit.amzingtrany;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Amazing Translator
 * aka Amazing Trany
 */
public class App 
{
    public static void main( String[] args )
    {
        // Need To Finish adding the French & German numbers up to "30"
        List<String> frenchTranslations=new ArrayList<>();
        frenchTranslations.add("UN");
        frenchTranslations.add("Deux");
        frenchTranslations.add("Trois");


        List<String> germanTranslations=new ArrayList<>();
        // 1
        germanTranslations.add("Eiz");
        // 2
        germanTranslations.add("Zwei");
        // 3
        germanTranslations.add("Drei");
// finish in here
       //30
        germanTranslations.add("dreißig");

        System.out.println( "What Is The Number To Translate?" );
        Scanner scanner=new Scanner(System.in);
        String numberAsString=scanner.nextLine();
        Integer number=null;
        try {
            number=Integer.parseInt(numberAsString);
            System.out.println(number);
        }
        catch (NumberFormatException nfe){
            System.out.println( "The Number has to be Numeric");
            System.exit(100);
    }
        System.out.println("What is the language to be used? Type 1 for French or 2 for German");
        String optionAsString=scanner.nextLine();
        Integer option=null;
        try {
            option=Integer.parseInt(numberAsString);
            System.out.println(option);
        }
        catch (NumberFormatException nfe){
            System.out.println( "The option has to be Numeric");
            System.exit(100);
        }
        // Check that the option is 1 or 2

        if (option==1){
            System.out.println(frenchTranslations.get(number-1));
        }
        else if (option==2){
            System.out.println(germanTranslations.get(number-1));
        }
        else {
            System.out.println("You need to select either French or German");
        }

    }
}
