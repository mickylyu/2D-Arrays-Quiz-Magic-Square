public class

MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for (int col = 0; col < array2d[0].length; col++) {
            sum = sum + array2d[0][col];
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        for (int row = 0; row < array2d.length; row++) {
            int sum = 0;
            for (int col = 0; col < array2d[0].length; col++) {
                sum += array2d[row][col];
            }
            if (sum != checkSum) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        for (int col = 0; col < array2d[0].length; col++) {
            int sum = 0;
            for (int row = 0; row < array2d.length; row++) {
                sum = sum + array2d[row][col];
            }
            if (sum != checkSum) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array2d.length; i++) {
            sum1 = sum1 + array2d[i][i];
            sum2 = sum2 + array2d[i][array2d.length-1-i];
        }
        return (sum1 == checkSum && sum2 == checkSum);
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int checkSum = calculateCheckSum(array2d);
        return (magicRows(array2d, checkSum) && magicColumns(array2d, checkSum) && magicDiagonals(array2d, checkSum));
    }

}
