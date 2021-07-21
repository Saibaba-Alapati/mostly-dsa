import java.util.*;
public class maximumIncrease{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int max = 0;
        int counter = 1;
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            if (i >= 1 && nums[i - 1] < nums[i]) {
                counter++;
            } else if (i >= 1 && nums[i - 1] >= nums[i]) {
                max = max < counter ? counter : max;
                counter = 1;
            }
        }
        max = max < counter ? counter : max;
        System.out.println(max);
    }
}