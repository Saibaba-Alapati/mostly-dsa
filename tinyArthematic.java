import java.util.*;
public class tinyArthematic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i]= sc.nextInt();
        }
        sc.close();
        if (2 * arr[2] == arr[1] + arr[0]) {
            System.out.println("Yes");
        } else if (2 * arr[1] == arr[2] + arr[0]) {
            System.out.println("Yes");
        } else if (2 * arr[0] == arr[1] + arr[2]) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
