public class Program {

    public static String arrayAsString(int[][] array) {
        // Use StringBuilder for efficient string concatenation.
        StringBuilder result = new StringBuilder();

        // Iterate through each row of the 2D array.
        for (int[] row : array) {
            // Iterate through each element in the current row.
            for (int element : row) {
                // Append the element to the StringBuilder.
                result.append(element);
            }
            // Append a newline character after each row.
            result.append("\n");
        }
        //Remove the last new line character to match the output
        if (result.length() > 0) {
            result.delete(result.length() - 1, result.length());
        }
        // Convert the StringBuilder to a String and return it.
        return result.toString();
    }

    public static void main(String[] args) {
        // Example usage of the arrayAsString method.
        int rows = 2;
        int columns = 3;
        int[][] matrix1 = new int[rows][columns];
        matrix1[0][1] = 5;
        matrix1[1][0] = 3;
        matrix1[1][2] = 7;
        System.out.println("Matrix 1:");
        System.out.println(arrayAsString(matrix1));

        System.out.println("\nMatrix 2:");
        int[][] matrix2 = {
                {3, 2, 7, 6},
                {2, 4, 1, 0},
                {3, 2, 1, 0}
        };
        System.out.println(arrayAsString(matrix2));

        int[][] matrix3 = {{1,2},{3,4}};
        System.out.println("\nMatrix 3:");
        System.out.println(arrayAsString(matrix3));
    }
}
