class AreaCalculator{
    static int area(int side){
        return side * side;
    }
    static int area(int length, int width){
        return length * width;
    }
    public static void main(String args[]){
        System.out.println("Square Area = " + area(4));
        System.out.println("Rectangle Area = " + area(2,9));
    }
}