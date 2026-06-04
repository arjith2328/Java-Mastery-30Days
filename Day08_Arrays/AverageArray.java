class AverageArray{
    public static void main(String args[]){
        int[] marks = {80, 90, 75, 85, 95};
        int sum = 0;
        
        for(int i = 0; i < marks.length; i++){
            sum += marks[i];
        }
        double average = (double) sum / marks.length;

        System.out.println("Average = " + average);
    }
}
