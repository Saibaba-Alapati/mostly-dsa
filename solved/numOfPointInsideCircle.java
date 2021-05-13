package solved;
public class numOfPointInsideCircle {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        int i=0;
        for (int[] q : queries) {
            int x0 = q[0];
            int y0 = q[1];
            int r = q[2];
            int numOfPoints = 0;
            for (int[] p : points) {
                int x = p[0];
                int y = p[1];
                if((x-x0)*(x-x0)+(y-y0)*(y-y0)<=r*r){
                    numOfPoints++;
                }
            }
            res[i]=numOfPoints;
            i++;
        }
        return res;
    }
}
