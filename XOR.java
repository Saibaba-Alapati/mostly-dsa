import java.util.*;
class XOR {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        List<Integer> values = new Stack<Integer>();
        int len = nums.length;
        int[] res = new int[len];
        
        for (int i = 0; i < nums.length; i++) {
            
        }
        int num =0;
        int bound =(int) Math.pow(2,maximumBit);
        for (int j : nums) {
            num = num^j;
            values.add(num);
        }
        System.out.println(values);
        for (int l : values) {
            int  k=0;
            int mxvalue =0;
            int req = 0;
            for (int j = 0; j < bound; j++) {
                int temp = l ^ j;
                if(mxvalue<temp){
                    mxvalue = temp;
                    req = j;
                }
            }
            res[k] = req;
            k++;
        }
        return res;
    }
}