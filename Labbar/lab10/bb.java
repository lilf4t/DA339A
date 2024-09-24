class bb {
 public static void main(String[] args) {
 // inits
 int board[][] =
 { { 1, 1, 2, 3, 3, 2},
 { 2, 1, 1, 2, 3},
 { 3, 2, 2, 1, 2},
 { 3, 3, 2, 2, 1},
 };
 boolean result[][] = new boolean[board.length][board[0].length];

 printArray(board);
 printArraySum(board);
 for (int i=0; i < result.length; i++) {
 for (int j=0; j < result[i].length; j++ ) {
 result[i][j] = calculateCell(i,j, board);
 }
 }
 printArray(result);
 }

 // Calculate a cell 'death-value' and return result
 public static boolean calculateCell(int row, int col, int[][] board){
 boolean result = false;
 if (board[row][col] >= 3){
 result = false;
 }
 else {
 int sum = sumNeighbours(row, col, board);
 if (sum >= 15) {
 result = false;
 }
 else{
 result = true;
 }
 }
 return result;
 }

 // sum all neighbour cells excluding current tile (row, col)
 public static int sumNeighbours(int row, int col, int[][] board){
 int sum = 0;
 for (int i=row-1; i <= row+1; i++) {
 for (int j=col-1; j <= col+1; j++ ) {
 if (i != row || j != col)
 sum += getValidCellValue(i, j, board);
 }
 }

 return sum;
 }

 // return a cells value if it is on the board (check index)
 public static int getValidCellValue(int row, int col, int[][] board){
 if (row >= 0 && row < board.length && col >= 0 && col < board[row].length){
 return board[row][col];
 }
 else{
 return 0;
 }
 }

 public static void printArray(int[][] arr)

 {
 for (int i=0; i < arr.length; i++) {
 for (int j=0; j < arr[i].length; j++ ) {
 System.out.print(arr[i][j] + " ");
 }
 System.out.println();
 }
 System.out.println();
 }

 public static void printArraySum(int[][] arr)
 {
 for (int i=0; i < arr.length; i++) {
 for (int j=0; j < arr[i].length; j++ ) {
 System.out.print(sumNeighbours(i, j, arr) + " ");
 }
 System.out.println();
 }
 System.out.println();
 }

 public static void printArray(boolean[][] arr)
 {
 for (int i=0; i < arr.length; i++) {
 for (int j=0; j < arr[i].length; j++ ) {
 if (arr[i][j])
 System.out.print("T ");
 else
 System.out.print("F ");
 }
 System.out.println();
 }
 System.out.println();
 }
}
