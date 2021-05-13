import java.util.ArrayList;
import java.util.*;

public class balancethebits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<String> responses = new ArrayList<String>();
        for (int i = 0; i < t; i++) {
            int n =sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            String reverse = new StringBuilder(s).reverse().toString();
            if(reverse.equals(s)||k==0){
                responses.add("YES");
            }else{
                responses.add("NO");
            }
            
        }
        sc.close();
        for(String r: responses){
            System.out.println(r);
        }
    }
}
