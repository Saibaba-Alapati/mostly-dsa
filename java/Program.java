import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        Map<String,List<List<Integer>>> reqMap = new LinkedHashMap<String,List<List<Integer>>>();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String ins = sc.next();
            List<List<Integer>> tempList  =new ArrayList<List<Integer>>();
            if(reqMap.containsKey(ins)){
                tempList  = reqMap.get(ins);
            }
            for (int j = 0; j < m; j++) {
                List<Integer> temp = new ArrayList<Integer>();
                int l = sc.nextInt()-1;
                int r = sc.nextInt()-1;
                temp.add(l);
                temp.add(r);
                tempList.add(temp);
                reqMap.put(ins,tempList);
            }
            // System.out.println(tempList);
        }
        sc.close();
        List<Integer> res = new ArrayList<Integer>();
        for(Map.Entry<String,List<List<Integer>>> element : reqMap.entrySet()){
            String ins = element.getKey();
            int n = ins.length();
            List<List<Integer>> arr = element.getValue();
            for(List<Integer> valueArray: arr){
                int l = valueArray.get(0);
                int r = valueArray.get(1);
                // System.out.println(valueArray);
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
                // System.out.println("arr"+uniqueNumbers);
                res.add(uniqueNumbers.size());
            }
        }
        for(int x:res){
            System.out.println(x);
        }
    }
}

