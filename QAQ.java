import java.util.*;
public class QAQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        str = str.replaceAll("[B-P,R-Z]", "");
        // System.out.println(str);
        int res=0;
        int len  = str.length();
        for (int i = 0; i < len; i++) {
            char at = str.charAt(i);
            switch (at) {
                case 'Q':
                    for (int j = 0; j <= i-1; j++) {
                        if (j+1<=i-1&& str.subSequence(j, j+1).equals("QA")) {
                            res++;
                        }
                    }
                    for (int j = i+1; j < len; j++) {
                        if (j + 1 < len && str.subSequence(j, j + 1).equals("QA")) {
                            res++;
                        }
                    }
                    break;
                case 'A':
                    for (int j = 0; j <= i - 1; j++) {
                        if (str.charAt(j)=='Q') {
                            for (int k = i + 1; k < len; k++) {
                                if (str.charAt(k)=='Q') {
                                    res++;
                                }
                            }
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println(res);
    }
}
