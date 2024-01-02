public class Matrices{
    // Spiral Matrix
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0, startCol = 0, endRow = matrix.length-1, endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            // top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            // right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            // left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    // Diagonal Sum
    public static void diagonalSum(int matrix[][]){
        int sum = 0;

        // Brute Force Approach
        // for(int i=0;i<matrix.length;i++){
        //     sum+=matrix[i][i];
        //     for(int j=0;j<matrix[0].length;j++){
        //         if((i+j)==matrix.length-1 && (i!=j)){
        //             sum+=matrix[i][j];
        //         }
        //     }
        // }
        
        // Optimised Approach
        for(int i=0;i<matrix.length;i++){
            // Primary Diagonal
            sum+=matrix[i][i];
            // Secondary Diagonal
            if(i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println("Diagonal Sum: "+sum);
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3,},{4,5,6},{7,8,9}};
        diagonalSum(matrix);
    }
}