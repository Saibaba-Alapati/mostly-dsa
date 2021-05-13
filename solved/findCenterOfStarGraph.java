package solved;

import java.util.*;

public class findCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        Map<Integer,Integer> boom = new HashMap<Integer,Integer>();
        int[] max = {0,0};
        for (int[] arr : edges) {
            if (!(boom.containsKey(arr[1]) || boom.containsKey(arr[0]))) {
                boom.put(arr[0], 1);
                boom.put(arr[1], 1);
            }
            if(boom.containsKey(arr[0])){
                int val = boom.get(arr[0]);
                boom.put(arr[0], val + 1);
            }
            if(boom.containsKey(arr[1])){
                int val = boom.get(arr[1]);
                boom.put(arr[1], val + 1);
            }
            if(boom.get(arr[0])!=null){
                int comp = boom.get(arr[0]);
                if (boom.get(arr[0])!=null&&max[1] <= comp) {
                    max[1] = comp;
                    max[0] = arr[0];
                }
            }
            if(boom.get(arr[1]) != null){
                int comp = boom.get(arr[1]);
                if (max[1] <= comp) {
                    max[1] = comp;
                    max[0] = arr[1];
                }
            }
        };
        System.out.println(boom);
        return max[0];
    }
}
