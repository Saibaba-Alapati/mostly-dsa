import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        List<Integer> res = new ArrayList<Integer>();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String ins = sc.next();
            for (int j = 0; j < m; j++) {
                int l = sc.nextInt()-1;
                int r= sc.nextInt()-1;
                int num=0;
                List<Integer> uniqueNumbers = new ArrayList<Integer>();
                uniqueNumbers.add(0);
                for (int k = 0;k < n; k++) {
                    if(k<l || k>r){
                        String str = "";
                        str = str+ins.charAt(k);
                        if(str.equals("-")){
                            num = num-1;
                        }
                        if(str.equals("+")){
                            num = num+1;
                        }
                        if(!uniqueNumbers.contains(num)){
                            uniqueNumbers.add(num);
                        }
                    }
                }
                res.add(uniqueNumbers.size());
            }
        }
        sc.close();
        for(int x: res){
            System.out.println(x);
        }
    }
}
