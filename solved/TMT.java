package solved;
import java.util.*;
public class TMT {
    public static void main(String[] args) {
        class Element{
            String data;
            Boolean visited;
            Element(String s){
                data = s;
                visited =false;
            }
        }
        List<String> res = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            String str = sc.next();
            List<Element> subs = new ArrayList<Element>();
            if(m%3==0){
                for(int k=0;k<m;k++){
                    if(k+2 < m){
                        if(str.substring(k,k+1).equals("T")&&str.substring(k+1,k+2).equals("T")){
                            subs.add(new Element("T"));
                        }else if(str.substring(k,k+1).equals("T")&&str.substring(k+1,k+2).equals("M")){
                            subs.add(new Element("TM"));
                            k++;
                        }else if(str.substring(k,k+1).equals("M")&&str.substring(k+1,k+2).equals("T")){
                            subs.add(new Element("MT"));
                            k++;
                        }
                    }else{
                        subs.add(new Element(str.charAt(k)+""));
                    }
                }
                for (int l=0;l<subs.size();l++) {
                    Element element = subs.get(l);
                    if( element.visited ==true){
                        continue;
                    }
                    String seq = "";
                    switch (element.data) {
                        case "T":
                            seq = "MT";
                            break;
                        case "TM":
                            seq = "T";
                            break;
                        case "M":
                            seq = "T";
                            break;
                        default:
                            break;
                    }
                    // System.out.println(seq);
                    if(element.data=="M"){
                        for (int v=l+1;v<subs.size();v++) {
                            Element element2 = subs.get(v);
                            
                            if(element2.visited==false&&element2.data.equals(seq)){
                                element2.visited = true;
                                element.visited=true;
                                break;
                            }
                        }
                        for (int w=0;w<l;w++) {
                            Element element2 = subs.get(w);
                            if(element2.visited==false&&element2.data.equals(seq)){
                                element2.visited = true;
                                element.visited=true;
                                break;
                            }
                        } 
                    }
                    for (int z=l+1;z<subs.size();z++) {
                        Element element2 = subs.get(z);
                        
                        if(element2.visited==false&&element2.data.equals(seq)){
                            element2.visited = true;
                            element.visited=true;
                            break;
                        }
                    }
                }
                String iden  = "YES";
                for (Element element : subs) {
                    if(element.visited==false){
                        iden="NO";
                        break;
                    }
                }
                if(iden.equals("NO")){
                    iden = "YES";
                    for (int p = subs.size()-1;p>0;p--) {
                        Element element = subs.get(p);
                        if( element.visited ==true){
                            continue;
                        }
                        String seq = "";
                        switch (element.data) {
                            case "T":
                                seq = "MT";
                                break;
                            case "TM":
                                seq = "T";
                                break;
                            default:
                                break;
                        }
                        // System.out.println(seq);
                        for (int q=p-1;q>0;q--) {
                            Element element2 = subs.get(q);
                            if(element2.visited==false&&element2.data.equals(seq)){
                                element2.visited = true;
                                element.visited=true;
                                break;
                            }
                        }
                    }
                };
                for (Element element : subs) {
                    if(element.visited==false){
                        iden="NO";
                        break;
                    }
                }
                // for (Element element : subs) {
                //     System.out.println(element.data+","+element.visited);
                // }
                res.add(iden);
                
            }else{
                res.add("NO");
            }
            
        }
        sc.close();
        for (String r: res){
            System.out.println(r);
        }
    }
    
}