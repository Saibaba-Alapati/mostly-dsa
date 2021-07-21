import java.util.*;
public class Main {
    public static void main(String[] args) {
        SortedMap<String,Integer> sm = new TreeMap<String,Integer>();
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String mountain = sc.next();
            int h = sc.nextInt();
            sm.put(mountain,h);
        }
        sc.close();
        int c=0;
        for (Map.Entry<String,Integer> entry : sm.entrySet()) {
                System.out.println(entry.getKey());
        }
        for (Map.Entry<String,Integer> entry : sm.entrySet()){
            if(c==n-2){
                System.out.println("answer"+entry.getKey());
                break;
            }
            c++;
        }
    }
}
