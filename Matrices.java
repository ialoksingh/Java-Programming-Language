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
    // Search in a sorted(row-wise as well as column-wise) matrix
    public static boolean staircaseSearch(int matrix[][],int key){
        int row = matrix.length-1, col = 0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]==key){
                System.out.println("Key found at index ("+row+","+col+")");
                return true;
            }else if(key>matrix[row][col]){
                col++;
            }else{
                row--;
            }
        }
        System.out.println("Key Not Found!");
        return false;
    }
    public static void main(String args[]){
        int matrix[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        staircaseSearch(matrix,key);
    }
}