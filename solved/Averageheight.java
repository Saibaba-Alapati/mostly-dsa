import java.util.*;

public class Averageheight {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j <t; j++) {
            int m = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<Integer>();
            for(int i=0; i<m; i++){
                int val = sc.nextInt();
                int iden = val%2;
                if(iden==1){
                    list.addFirst(val);
                }
                if(iden==0||list.size()==0){
                    list.add(val);
                }
            }
            for (Integer x : list) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}