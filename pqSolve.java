import java.util.*;
public class pqSolve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = sc.nextInt();
        }
        sc.close();
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < n; i++) {
            pQueue.add(inputArray[i]);
        }
        System.out.println(pQueue);
        int[] response = new int[k];
        System.out.println(pQueue.contains(4));;
        for (int i : response) {
            System.out.println("response");
            System.out.println(i);
        }
    }
}
