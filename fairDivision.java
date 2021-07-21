import java.util.*;
public class fairDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int total=0;
            int twos=0;
            int ones=0;
            for (int j = 0; j < n; j++) {
                int ele = sc.nextInt();
                total = total+ele;
                if(ele==2){
                    twos++;
                }
                if(ele==1){
                    ones++;
                }
            }
            if(total%2==0){
                int r = total/2;
                while (r > 0 && (twos != 0 || ones != 0)) {
                    if (twos > 0 && r >= 2) {
                        r = r - 2;
                        // System.out.println("twos:" + r);
                        // System.out.println(twos);
                        twos--;
                    } else if (ones == 0 && r == 1) {
                        break;
                    } else if (ones > 0 && r >= 1) {
                        r = r - 1;
                        ones--;
                        // System.out.println("ones:" + r);
                        // System.out.println(ones);
                    }
                }
                // System.out.println(twos * 2 + ones);
                if(!(ones == 0 && r == 1)&&twos*2+ones==total/2){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}