import java.util.Scanner;

class Solution
{
    public static int min_operations(int []nums)
    {
        int minOp = 0;
        int len = nums.length;
        for (int l = len-2; l>=0; l--) {
            if(l+1<len){
                if(l-1>0){
                    if (nums[l - 1] > nums[l] && nums[l] > nums[l + 1]) {
                        // System.out.println(minOp);
                        int temp = nums[l-1];
                        nums[l-1] = nums[l] - 1;
                        minOp = minOp + temp - nums[l - 1];
                        // System.out.println(minOp);
                        temp = nums[l + 1];
                        nums[l + 1] = nums[l] + 1;
                        minOp = minOp + nums[l + 1] - temp;
                        // System.out.println("Here 1 " + minOp);
                    } else if (nums[l - 1] > nums[l] && nums[l - 1] == nums[l + 1]) {
                        int temp = nums[l-1];
                        nums[l - 1] = nums[l] - 1;
                        minOp = minOp + temp - nums[l];
                        temp = nums[l+1];
                        nums[l + 1] = nums[l] + 1;
                        minOp = minOp + temp - nums[l+1];
                        // System.out.println("Here 2 "+ minOp);
                    } else if (nums[l - 1] < nums[l] && nums[l] == nums[l + 1]) {
                        int temp = nums[l];
                        nums[l] = nums[l - 1] + 1;
                        minOp = minOp + temp - nums[l];
                        temp = nums[l+1];
                        nums[l + 1] = nums[l] + 1;
                        minOp = minOp + temp - nums[l+1];
                        // System.out.println("Here 3 "+minOp);
                    }else if(nums[l - 1] > nums[l] && nums[l] < nums[l + 1]){
                        int temp = nums[l-1];
                        nums[l-1] = nums[l]-1;
                        minOp = minOp + temp - nums[l-1];
                    }
                }else {
                    if(nums[l] > nums[l + 1]){
                        int temp = nums[l];
                        nums[l] = nums[l + 1] - 1;
                        minOp = minOp + temp - nums[l];
                        // System.out.println("Here 4" + minOp);
                    }
                }
            }
            // else{
            //     if(nums[l-1]>nums[l]){
            //         int temp = nums[l];
            //         nums[l] = nums[l - 1] + 1;
            //         minOp = minOp -temp + nums[l];
            //         // System.out.println("Here 5" + minOp);
            //     }
            // }
        }
        return minOp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        int[] nums = new int[t];
        for (int i = 0; i < t; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        int res = min_operations(nums);
        System.out.println("result   " + res);
        for (int i = 0; i < t; i++) {
            System.out.println(nums[i]);
        }
    }
}