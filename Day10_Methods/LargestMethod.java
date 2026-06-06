class LargestMethod{
    static int largest(int a, int b){
        if(a > b){
            return a;
        }
        return b;
    }
    public static void main(String args[]){
        int result = largest(23, 35);
        System.out.println("Largest = " + result);
    }
}