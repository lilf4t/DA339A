

public class test1 {
    public static void main(String[] args){

        //TODO fixa så användaren själv kan input i och sätt deras input till the grid, skapa en booleanGrid med samma storlek som det orginella gridet

        // Create grid from assignment example and a booleanGrid with the same size
        int[][] grid = {{1,1,2,3,3}, {2,1,1,2,3}, {3,2,2,1,2}, {3,3,3,3,3}};
        boolean[][] booleanGrid = new boolean[4][5];

        /* Rules:
        - If the value at the current position in the grid is 3, dead -> false
        - If the value of all neighbours together sum more than 15, dead -> false
        - If the value of the current position is <= 2 and the value of all neighbours is < 15, alive -> true
        */

        // Loops through the entire grid with each position
        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[r].length; c++) {
                // Saves the value of the current position
                int posValue = grid[r][c];
                System.out.println("Pos value: " + posValue);

                /* To counteract the incoming for loops sum of the neighbours and the current position,
                we start with adding -posValue to nbrSum to make sure when its added later in the for loop it does not change anything
                */
                int nbrSum =- posValue;

                // Computes the sum of all close neighbours by one index, in total all 9 positions, all 8 around a single [r][c] and itself
                for(int i = -1; i < 2; i++) {
                    for(int j = -1; j < 2; j++) {
                        // Try catch, if the grid indexes something out of bounds it will just ignore it and continue with the next loop since the error is caught
                        try {
                            nbrSum += grid[r + i][c + j];
                        }
                        catch(Exception e){
                        }
                    }
                }

                System.out.println("NbrSum value: " + nbrSum);

                // Checks the game rules for the value of the position and the total value of all neighbours
                if(posValue <= 2 && nbrSum < 15) {
                    booleanGrid[r][c] = true;
                } else {
                    booleanGrid[r][c] = false;
                }

                System.out.println("Boolean: " + booleanGrid[r][c]);
                System.out.println();
            }

            // Prints the new booleanGrid
            System.out.println();
            for(int k = 0; k < booleanGrid.length; k++) {
                for(int a = 0; a < booleanGrid[k].length; a++) {
                    System.out.print(" " + booleanGrid[k][a]);

                }
                System.out.println();
            }
        }
    }
}
