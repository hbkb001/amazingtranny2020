package nz.ac.eit.amzingtrany;

import java.util.ArrayList;
import java.util.List;

public class TranslationDictionaries {

    private List<String> frenchTranslations = new ArrayList<>();
    private List<String> germanTranslations = new ArrayList<>();


    public void initializeTranslations(){

        // FRENCH TRANSLATIONS
        // 1
        frenchTranslations.add("Un");
        // 2
        frenchTranslations.add("Deux");
        // 3
        frenchTranslations.add("Trois");
        //4
        frenchTranslations.add("Quatre");
        //5
        frenchTranslations.add("Cinq");
        //6
        frenchTranslations.add("Six");
        //7
        frenchTranslations.add("Sept");
        //8
        frenchTranslations.add("Huit");
        //9
        frenchTranslations.add("Neuf");
        //10
        frenchTranslations.add("Dix");
        //11
        frenchTranslations.add("Onze");
        //12
        frenchTranslations.add("Douze");
        //13
        frenchTranslations.add("Treize");
        //14
        frenchTranslations.add("Quatorze");
        //15
        frenchTranslations.add("Quinze");
        //16
        frenchTranslations.add("Seize");
        //17
        frenchTranslations.add("Dix-Sept");
        //18
        frenchTranslations.add("Dix-Huit");
        //19
        frenchTranslations.add("Dix-Neuf");
        //20
        frenchTranslations.add("Vingt");
        //21
        frenchTranslations.add("Vingt-et-Un");
        //22
        frenchTranslations.add("Vingt-Deux");
        //23
        frenchTranslations.add("Vingt-Trois");
        //24
        frenchTranslations.add("Vingt-Quatre");
        //25
        frenchTranslations.add("Vingt-Cinq");
        //26
        frenchTranslations.add("Vingt-Six");
        //27
        frenchTranslations.add("Vingt-Sept");
        //28
        frenchTranslations.add("Vingt-Huit");
        //29
        frenchTranslations.add("Vingt-Neuf");
        //30
        frenchTranslations.add("Trente");


        // GERMAN TRANSLATIONS
        // 1
        germanTranslations.add("Eiz");
        // 2
        germanTranslations.add("Zwei");
        // 3
        germanTranslations.add("Drei");
        //4
        germanTranslations.add("vier");
        //5
        germanTranslations.add("fünf");
        //6
        germanTranslations.add("sechs");
        //7
        germanTranslations.add("sieben");
        //8
        germanTranslations.add("acht");
        //9
        germanTranslations.add("neun");
        //10
        germanTranslations.add("zehn");
        //11
        germanTranslations.add("elf");
        //12
        germanTranslations.add("zwölf");
        //13
        germanTranslations.add("dreizehn");
        //14
        germanTranslations.add("vierzehn");
        //15
        germanTranslations.add("fünfzehn");
        //16
        germanTranslations.add("sechzehn");
        //17
        germanTranslations.add("siebzehn");
        //18
        germanTranslations.add("achtzehn");
        //19
        germanTranslations.add("neunzehn");
        //20
        germanTranslations.add("zwanzig");
        //21
        germanTranslations.add("einundzwanzig");
        //22
        germanTranslations.add("zweiundzwanzig");
        //23
        germanTranslations.add("dreiundzwanzig");
        //24
        germanTranslations.add("vierundzwanzig");
        //25
        germanTranslations.add("fünfundzwanzig");
        //26
        germanTranslations.add("sechsundzwanzig");
        //27
        germanTranslations.add("siebenundzwanzig");
        //28
        germanTranslations.add("achtundzwanzig");
        //29
        germanTranslations.add("neunundzwanzig1");
        //30
        germanTranslations.add("dreißig");
    }

    public String getTranslationOf(int number, int language) throws LanguageNotSupportedException, NumberOutOfRangeException {

        // ... check number is within range

        if (number<1 || number>30){
            throw new NumberOutOfRangeException();
        }

        // ... Check that the option is 1 or 2

        if (language == 1) {
            return frenchTranslations.get(number - 1);
        } else if (language == 2) {
            return germanTranslations.get(number - 1);
        } else {
            throw new LanguageNotSupportedException();
        }
    }

}
