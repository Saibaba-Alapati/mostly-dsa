package solved;
import java.util.*;
public class minNumberOfBills{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetSum = sc.nextInt();
        sc.close();
        int notes = 0;
        while (targetSum!=0&&targetSum>0) {
            if(targetSum>=100){
                targetSum = targetSum-100;
                notes++;
            }else if(targetSum>=20){
                targetSum = targetSum-20;
                notes++;
            }else if(targetSum>=10){
                targetSum = targetSum-10;
                notes++;
            }else if(targetSum>=5){
                targetSum = targetSum-5;
                notes++;
            }else if(targetSum >=1){
                targetSum = targetSum-1;
                notes++;
            }
        }
        System.out.println(notes);
    }
}