// Type of Argument over loading
class MultiplyFun{
    static int multiply(int a, int b){
        return a*b;
    }
    static double multiply(double a, double b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println(MultiplyFun.multiply(3,4));
        System.out.println(MultiplyFun.multiply(6.6, 7.4));
    }
}
