public class StrictlyIncreasing {
    public int minOperations(int[] nums) {
        int operations =0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]>=nums[i]){
                operations = operations+nums[i-1]-nums[i]+1;
                nums[i]= nums[i-1]+1;
            }
        }
        return operations;
    }
}
