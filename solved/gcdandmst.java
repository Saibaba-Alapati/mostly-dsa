package solved;
import java.util.*;
public class gcdandmst {
    static class Edge {
        int src;
        int des;
        int w;

        public Edge(int src, int des, int w){
            this.src = src;
            this.des = des;
            this.w  = w;
        }
    }
    static class Graph{
        int numofvertices;
        LinkedList<Edge> [] adjacencyList;

        Graph(int numofvertices){
            this.numofvertices = numofvertices;
            this.adjacencyList = new LinkedList[numofvertices];
            for (int i = 0; i < numofvertices; i++) {
                adjacencyList[i] = new LinkedList<>();
            }
        }
        public void addEdge(int src, int des, int w){
            Edge edge = new Edge(src, des, w);
            adjacencyList[src].add(edge);
        }
    }
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(a, b);
    }
    public static int findGCD(List<Integer> vertices,int n){
        int result = vertices.get(0);
        for (int i = 1; i < n; i++) {
            result = gcd(vertices.get(i), result);
            if(result==1){
                return 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            Graph G =  new Graph(n);
            List<Integer> vertices = new ArrayList<Integer>();
            for (int k = 0; k < n; k++) {
                vertices.add(sc.nextInt());
            }
            for (int j = 0; j < n; j++) {
                if(j+1 <n){
                    G.addEdge(vertices.get(j), vertices.get(j+1), p);
                }
            }
            for (int j = 0; j < args.length; j++) {
                for (int j2 = 0; j2 < args.length; j2++) {
                    if(j<j2){
                        int min = Collections.min(vertices.subList(j, j2));
                        int gcd = findGCD(vertices, n);
                        if (min == gcd) {
                            G.addEdge(vertices.get(j), vertices.get(j2), gcd);
                        }
                    }
                }
            }
            //Creating graph completed

            
        }
        sc.close();
    }
}
