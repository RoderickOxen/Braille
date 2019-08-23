package braille;

public class Punctuation {

    public static int[][] punctuation2B(String input) {

        int[][] braillePunc = new int[3][2];

        switch (input.toLowerCase()) {
            case ",":
                braillePunc[1][0] = 1;
                break;

            case ".":
                braillePunc[0][1] = 1;
                braillePunc[1][1] = 1;
                braillePunc[2][1] = 1;
                break;

            case "-":
                braillePunc[2][0] = 1;
                braillePunc[2][1] = 1;
                break;

            case "?":
                braillePunc[1][0] = 1;
                braillePunc[2][0] = 1;
                braillePunc[2][1] = 1;
                break;

            case "!":
                braillePunc[1][0] = 1;
                braillePunc[1][1] = 1;
                braillePunc[2][0] = 1;
                break;


        }

        return braillePunc;
    }
}
