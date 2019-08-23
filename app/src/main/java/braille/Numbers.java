package braille;

public class Numbers {

    public static int[][] number2B(String input) {
        int[][] brailleNumb = new int[3][2];

        switch (input.toLowerCase()) {
            case "1":
                brailleNumb[0][0] = 1;
                break;

            case "2":
                brailleNumb[0][0] = 1;
                brailleNumb[1][0] = 1;
                break;

            case "3":
                brailleNumb[0][0] = 1;
                brailleNumb[0][1] = 1;
                break;

            case "4":
                brailleNumb[0][0] = 1;
                brailleNumb[0][1] = 1;
                brailleNumb[1][1] = 1;
                break;

            case "5":
                brailleNumb[0][0] = 1;
                brailleNumb[1][1] = 1;
                break;

            case "6":
                brailleNumb[0][0] = 1;
                brailleNumb[0][1] = 1;
                brailleNumb[1][0] = 1;
                break;

            case "7":
                brailleNumb[0][0] = 1;
                brailleNumb[0][1] = 1;
                brailleNumb[1][0] = 1;
                brailleNumb[1][1] = 1;
                break;

            case "8":
                brailleNumb[0][0] = 1;
                brailleNumb[1][0] = 1;
                brailleNumb[1][1] = 1;
                break;

            case "9":
                brailleNumb[0][1] = 1;
                brailleNumb[1][0] = 1;
                break;

            case "0":
                brailleNumb[0][1] = 1;
                brailleNumb[1][0] = 1;
                brailleNumb[1][1] = 1;
                break;

        }
        return brailleNumb;
    }
}