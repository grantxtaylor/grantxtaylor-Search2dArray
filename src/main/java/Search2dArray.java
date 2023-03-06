public class Search2dArray {
    /**
     * Receive a 2d array of ints. (That's an array of arrays!)
     * Your task is to search the array for a matching value, return true if found false otherwise.
     * You'll need to use a for loop within a for loop - each for loop handles searching in a particular dimension.
     * I recommend reasoning through this problem on pencil and paper.
     *
     * @param nums a two dimensional array - meaning, an array of arrays.
     * @param target a value that may be contained within nums.
     * @return true if nums contains target, and false otherwise.
     */
    
        public static boolean search(int[][] array, int value) {
            // Iterate over each row
            for (int i = 0; i < array.length; i++) {
                // Iterate over each column in the current row
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] == value) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
    

