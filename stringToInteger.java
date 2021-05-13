import java.util.*;
public class stringToInteger {
    public int myAtoi(String s) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int res = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            int sl = result.size();
            if (Character.isWhitespace(c)) {
                if (sl != 0) {
                    break;
                }
                continue;
            } else if (Character.isDigit(c)) {
                int l = c - 48;
                if (sl == 0 && l != 0) {
                    result.add(0);
                }
                if (sl == 1 && l == 0) {
                    continue;
                }
                result.add(l);
            } else if (c == '-') {
                if (i - 1 > 0 && s.charAt(i - 1) == 48) {
                    break;
                }
                if (sl != 0) {
                    break;
                }
                result.add(1);
            } else if (c == '+') {
                if (i - 1 > 0 && s.charAt(i - 1) == 48) {
                    break;
                }
                if (sl != 0) {
                    break;
                }
                result.add(0);
            } else {
                break;
            }
        }
        int sie = result.size();
        if (sie > 0) {
            if (result.get(0) == 0) {
                if (sie > 11) {
                    return 2147483647;
                } else if (sie == 11) {
                    int leng = sie;
                    if (result.get(1) > 2) {
                        return 2147483647;
                    }
                    for (int i = 2; i < leng; i++) {
                        int temp = result.get(i);
                        res = res + temp * (int) Math.pow(10, leng - 1 - i);
                    }
                    if (result.get(1) >= 2 && res >= 147483647) {
                        return 2147483647;
                    } else {
                        return res = res + result.get(1) * 1000000000;
                    }
                } else if (sie < 11) {
                    int leng = sie;
                    for (int i = 1; i < leng; i++) {
                        int temp = result.get(i);
                        res = res + temp * (int) Math.pow(10, leng - 1 - i);
                    }
                    return res;
                }
            }
            if (result.get(0) == 1) {
                if (sie > 11) {
                    return -2147483648;
                } else if (sie == 11) {
                    int leng = sie;
                    if (result.get(1) > 2) {
                        return -2147483648;
                    }
                    for (int i = 2; i < leng; i++) {
                        int temp = result.get(i);
                        res = res + temp * (int) Math.pow(10, leng - 1 - i);
                    }
                    if (result.get(1) >= 2 && res >= 147483648) {
                        return -2147483648;
                    } else {
                        res = res + result.get(1) * 1000000000;
                    }
                    return res * -1;
                } else if (sie < 11) {
                    int leng = sie;
                    for (int i = 1; i < leng; i++) {
                        int temp = result.get(i);
                        res = res + temp * (int) Math.pow(10, leng - 1 - i);
                    }
                    return res * -1;
                }
            }
        }
        return res;
    }
}
