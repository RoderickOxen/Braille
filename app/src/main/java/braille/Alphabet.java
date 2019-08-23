package braille;

public class Alphabet {

    public static int[][] character2B(String input) {
        int[][] brailleChar = new int[3][2];


        switch (input.toLowerCase()) {
            case "a":
                brailleChar[0][0] = 1;
                break;

            case "b":
                brailleChar[0][0] = 1;
                brailleChar[1][0] = 1;
                break;

            case "c":
                brailleChar[0][0] = 1;
                brailleChar[0][1] = 1;
                break;

            case "d":
                brailleChar[0][0] = 1;
                brailleChar[0][1] = 1;
                brailleChar[1][1] = 1;
                break;

            case "e":
                brailleChar[0][0] = 1;
                brailleChar[1][1] = 1;
                break;

            case "f":
                brailleChar[0][0] = 1;
                brailleChar[0][1] = 1;
                brailleChar[1][0] = 1;
                break;

            case "g":
                brailleChar[0][0] = 1;
                brailleChar[0][1] = 1;
                brailleChar[1][0] = 1;
                brailleChar[1][1] = 1;
                break;

            case "h":
                brailleChar[0][0] = 1;
                brailleChar[1][0] = 1;
                brailleChar[1][1] = 1;
                break;

            case "i":
                brailleChar[0][1] = 1;
                brailleChar[1][0] = 1;
                break;

            case "j":
                brailleChar[0][1] = 1;
                brailleChar[1][0] = 1;
                brailleChar[1][1] = 1;
                break;

            case "k":
                brailleChar[0][0] = 1;
                brailleChar[2][0] = 1;
                break;

            case "l":
                brailleChar[0][0] = 1;
                brailleChar[1][0] = 1;
                brailleChar[2][0] = 1;
                break;

            case "m":
                brailleChar[0][0] = 1;
                brailleChar[0][1] = 1;
                brailleChar[2][0] = 1;
                break;

            case "n":
                brailleChar[0][0] = 1;
                brailleChar[0][1] = 1;
                brailleChar[1][1] = 1;
                brailleChar[2][0] = 1;
                break;

            case "o":
                brailleChar[0][0] = 1;
                brailleChar[1][1] = 1;
                brailleChar[2][0] = 1;
                break;

            case "p":
                brailleChar[0][0] = 1;
                brailleChar[0][1] = 1;
                brailleChar[1][0] = 1;
                brailleChar[2][0] = 1;
                break;

            case "q":
                brailleChar[0][0] = 1;
                brailleChar[0][1] = 1;
                brailleChar[1][0] = 1;
                brailleChar[1][1] = 1;
                brailleChar[2][0] = 1;
                break;

            case "r":
                brailleChar[0][0] = 1;
                brailleChar[1][0] = 1;
                brailleChar[1][1] = 1;
                brailleChar[2][0] = 1;
                break;

            case "s":
                brailleChar[0][1] = 1;
                brailleChar[1][0] = 1;
                brailleChar[2][0] = 1;
                break;

            case "t":
                brailleChar[0][1] = 1;
                brailleChar[1][0] = 1;
                brailleChar[1][1] = 1;
                brailleChar[2][0] = 1;
                break;

            case "u":
                brailleChar[0][0] = 1;
                brailleChar[2][0] = 1;
                brailleChar[2][1] = 1;
                break;

            case "v":
                brailleChar[0][0] = 1;
                brailleChar[1][0] = 1;
                brailleChar[2][0] = 1;
                brailleChar[2][1] = 1;
                break;

            case "w":
                brailleChar[0][1] = 1;
                brailleChar[1][1] = 1;
                brailleChar[1][0] = 1;
                brailleChar[2][1] = 1;
                break;

            case "x":
                brailleChar[0][0] = 1;
                brailleChar[0][1] = 1;
                brailleChar[2][0] = 1;
                brailleChar[2][1] = 1;
                break;

            case "y":
                brailleChar[0][0] = 1;
                brailleChar[0][1] = 1;
                brailleChar[1][1] = 1;
                brailleChar[2][0] = 1;
                brailleChar[2][1] = 1;
                break;

            case "z":
                brailleChar[0][0] = 1;
                brailleChar[1][1] = 1;
                brailleChar[2][0] = 1;
                brailleChar[2][1] = 1;
                break;

        }

        return brailleChar;
    }
}
