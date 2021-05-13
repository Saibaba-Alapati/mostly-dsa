import java.util.*;
public class Spydetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> store = new ArrayList<ArrayList<Integer>>();
        int n = sc.nextInt();
        
        List<Integer> indexes = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            ArrayList<Integer> newlist = new ArrayList<Integer>();
            store.add(newlist); 
            int bound  = sc.nextInt();
            for(int j=0;j<bound;j++){
                store.get(i).add(sc.nextInt());
                int key = store.get(i).get(j);
                if(map.containsKey(key)){
                    map.put(store.get(i).get(j), 0);
                }else{
                    map.put(store.get(i).get(j), j+1);
                }
            }
            for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
                if(mapElement.getValue()!=0){
                    indexes.add(mapElement.getValue());
                }
            }
        }
        sc.close();
        for (Integer x : indexes) {
            System.out.println(x);
        }
    }
}
