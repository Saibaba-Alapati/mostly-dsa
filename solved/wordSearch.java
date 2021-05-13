package solved;
import java.util.*;
public class wordSearch {
    public boolean exist(char[][] board, String word) {
        int ver = board.length;
        int hoz = board[0].length;
        List<List<Integer>> req = new ArrayList<>();
        for (int i = 0; i < ver; i++) {
            for (int j = 0; j < hoz; j++) {
                if(board[i][j] == word.charAt(0)){
                    List<Integer> g = new ArrayList<Integer>();
                    g.add(i);
                    g.add(j);
                    req.add(g);
                }
            }
        }
        for (List<Integer> list : req) {
            int i = list.get(0);
            int j = list.get(1);
            String k = "" + board[i][j];
            List<String> multipleChoices = new ArrayList<String>();
            multipleChoices.add(k);
            for (int p=0;p<multipleChoices.size();p++) {
                String s = multipleChoices.get(p);
                while (true) {
                    int m = 0;
                    String prev = s;
                    int h = i;
                    int l = j;
                    int len = s.length();
                    if (h-1>=0 && board[h-1][l] == word.charAt(len)) {
                        if (m > 0) {
                            multipleChoices.add(prev + board[h-1][l]);
                            m++;
                        }
                        else{
                            s = s + board[i - 1][j];
                            i = i - 1;
                            m++;
                        }
                    }
                    if (h+1<ver && board[h+1][l] == word.charAt(len)) {
                        if(m>0){
                            multipleChoices.add(prev + board[h + 1][l]);
                            m++;
                        }else{
                            s = s + board[i + 1][j];
                            i = i + 1;
                            m++;
                        }
                    }
                    if (l+1 < hoz && board[h][l+1] == word.charAt(len)) {
                        if(m>0){
                            multipleChoices.add(prev + board[h][l+1]);
                            m++;
                        }else{
                            s = s + board[i][j + 1];
                            j = j + 1;
                            m++;
                        }
                        
                    }
                    if (l-1 >= 0 && board[h][l-1] == word.charAt(len)) {
                        if(m>0){
                            multipleChoices.add(prev+board[h][l-1]);
                            m++;
                        }else {
                            s = s + board[i][j - 1];
                            j = j - 1;
                            m++;
                        }
                    } else {
                        break;
                    }
                    if (s.length() == word.length()) {
                        return true;
                    }
                }
                System.out.println(s);
            }
            System.out.println(multipleChoices);
        }
        return false;
    }
}