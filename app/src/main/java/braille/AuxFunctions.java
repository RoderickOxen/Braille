package braille;

import java.util.ArrayList;
import java.util.Arrays;

public class AuxFunctions {


    public static boolean isInt(String targetValue) {
        String[] arr = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        return Arrays.asList(arr).contains(targetValue);
    }

    public static boolean isChar(String targetValue) {
        String[] arr = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o","p","q","r","s","t","u","v","w","x","y","z" };
        return Arrays.asList(arr).contains(targetValue);
    }

    public static String[] stringToCharArray(String input){

        String[] res = new String[input.length()];

        for (int i = 0; i < input.length(); i++) {
            res[i] = Character.toString(input.charAt(i));
        }

        return res;
    }

    public static void soutWord2dot(ArrayList<int[][]> arrayOfMatrices){

        //for all 3 lines
        for (int i=0;i < 3;i++){

            //for all matrices (matrix=character)
            for (int[][] array: arrayOfMatrices) {

                //for all columns of each matrix
                for (int j = 0; j < array[i].length; j++) {

                    //prints first the first line of each matrix
                    //then skips to the other line and repeats

                    if (array[i][j]==1){
                        System.out.print("." + " ");
                    }
                    else
                        System.out.print(" " + " ");
                    if (j==1){
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static String toTextView(ArrayList<int[][]> arrayOfMatrices){
        String output = "";

        //for all 3 lines
        for (int i=0;i < 3;i++){

            //for all matrices (matrix=character)
            for (int[][] array: arrayOfMatrices) {

                //for all columns of each matrix
                for (int j = 0; j < array[i].length; j++) {

                    //prints first the first line of each matrix
                    //then skips to the other line and repeats

                    if (array[i][j]==1){
                        output += ".   ";
                        //System.out.print("." + " ");
                    }
                    else{
                        output += "    ";
                        //System.out.print(" " + " ");

                    }
                    if (j==1){
                        //output += " ";
                        System.out.print(" ");
                    }
                }
            }
            output += "\n";
            //System.out.println();
        }

        System.out.println(output);
        return  output;
    }


}
