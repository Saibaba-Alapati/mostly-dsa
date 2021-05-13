package solved;
class findTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        int[]  boom = new int[N];
        for (int[] arr : trust) {
            boom[arr[1]-1] = boom[arr[1]-1] +1;
            boom[arr[0] - 1] = boom[arr[0] - 1] - 1;
        };
        for (int i = 0; i < N; i++) {
            if(boom[i] == N-1){
                return i+1;
            }
        }
        return -1;
    }
}