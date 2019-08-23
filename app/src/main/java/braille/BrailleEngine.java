package braille;

import java.util.ArrayList;
import java.util.Scanner;


public class BrailleEngine {

    public  String initialState(String input) {

        input = input.toLowerCase();


        int [][] brailleChar;

        ArrayList<int[][]> arrayOfMatrices = new ArrayList<>();

        String[] inputArray = AuxFunctions.stringToCharArray(input);


        for (int i=0; i < inputArray.length; i++){

            if (AuxFunctions.isInt(inputArray[i])){
                brailleChar = Numbers.number2B(inputArray[i]);
            }
            else if (AuxFunctions.isChar(inputArray[i])){
                brailleChar = Alphabet.character2B(inputArray[i]);
            }
            else
                //probably punctuation
                brailleChar = Punctuation.punctuation2B(inputArray[i]);

            arrayOfMatrices.add(brailleChar);
        }

        return AuxFunctions.toTextView(arrayOfMatrices);
    }

}
