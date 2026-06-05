class LargestInMatrix{
    public static void main(String args[]){
        int[][] matrix = {{10,20,30},{5,90,34},{43,45,60}};
        int largest = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Lagrest = " + largest);
    }
}