public class TwoDimensionalArray{
    public static void main(String[] args) {
        char[][] twoDimensionalArray = getTwoDimensionalArray(7);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(twoDimensionalArray[i][j]);
                }
            System.out.println();
            }
        }
    public static char[][] getTwoDimensionalArray(int size) {
        char[][] twoDimensionalArray = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == (size - 1)) {
                    twoDimensionalArray[i][j] = 'x';
                } else {
                    twoDimensionalArray[i][j] = ' ';
                }
            }
        }
        return twoDimensionalArray;
    }
}


