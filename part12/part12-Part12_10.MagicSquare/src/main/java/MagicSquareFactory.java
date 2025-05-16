public class MagicSquareFactory {
    public MagicSquare createMagicSquare(int size) {
        MagicSquare square = new MagicSquare(size);
        
        // Only works with odd-sized squares
        if (size % 2 == 0) {
            return square;  // Return empty square for even sizes
        }
        
        // Start with 1 at the middle of the top row
        int row = 0;
        int col = size / 2;
        
        // Place the first number
        square.placeValue(col, row, 1);
        
        // Fill in the rest of the values using Siamese method
        for (int num = 2; num <= size * size; num++) {
            // Move up and right (with wrapping)
            int newRow = (row - 1 + size) % size;
            int newCol = (col + 1) % size;
            
            // If the position is already filled, move one step down from the original position
            if (square.readValue(newCol, newRow) != 0) {
                newRow = (row + 1) % size;
                newCol = col;
            }
            
            // Set the new number at the calculated position
            square.placeValue(newCol, newRow, num);
            
            // Update current position
            row = newRow;
            col = newCol;
        }
        
        return square;
    }
}