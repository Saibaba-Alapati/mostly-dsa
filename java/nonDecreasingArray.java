public class nonDecreasingArray {
    public static boolean checkPossibility(int[] nums) {
        int counter = 0;
        int len = nums.length;
        int[] p = new int[len];
        for (int i = 0; i < len; i++) {
            if (i - 1 >= 0) {
                if ((nums[i - 1] < nums[i] && p[i - 1] == 1)) {
                    // System.out.println("djjdjnd");
                    int j = i - 1;
                    while (j > 0) {
                        if (p[j] == 0) {
                            if (nums[j] > nums[i]) {
                                p[i] = 1;
                                counter++;
                            }
                        }
                        j--;
                    }
                }
                if (nums[i - 1] > nums[i]) {
                    // System.out.println("h");
                    p[i] = 1;
                    // System.out.println("i is"+i);
                    System.out.println(p[i]);
                    counter++;
                }
            }
        }
        System.out.println("arrsy");
        // for (int i : p) {
        // System.out.println(i);
        // }
        // System.out.println(counter);
        if (counter <= 1) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {4,2,1};
        boolean g =  checkPossibility(nums);
        System.out.println(g);
    }
}
