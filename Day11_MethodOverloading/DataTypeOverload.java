class DataTypeOverload{
    static void show(int num){
        System.out.println("Integer: " + num);
    }
    static void show(double num){
        System.out.println("Double: " + num);
    }
    public static void main(String args[]){
        show(23);
        show(23.34);
    }
}