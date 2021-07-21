//number of aruguments overloading

public class argumentoverloading {
    public static int mult(int a,int b){
        return a*b;
    }
    public static int mult(int a, int b, int c){
        return a*b*c;
    }
    public static void main(String[] args) {
        System.out.println(mult(3, 4));
        System.out.println(mult(3, 4, 5));
    }
}
