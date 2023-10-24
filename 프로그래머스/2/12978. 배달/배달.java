class Solution {
	static int cnt; // 배달 가능한 마을 개수
    static int[][] arr; // 거리값 포함 행렬
    static int[] dist; // 거리, 방문 배열
    static boolean[] visited; // 방문 체크
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        cnt = 0;
        arr = new int[N + 1][N + 1];

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < N + 1; j++) {
                arr[i][j] = 500001;
            }
        }

        for (int i = 0; i < road.length; i++) {
            if(arr[road[i][0]][road[i][1]] > road[i][2]) {
                arr[road[i][0]][road[i][1]] = road[i][2];
                arr[road[i][1]][road[i][0]] = road[i][2];
            }
        }

        dist = new int[N + 1];
        for (int i = 2; i < N + 1; i++) {
            dist[i] = 500001;
        }
        visited = new boolean[N + 1];
        visited[1] = true;

        // 다익스트라 호출
        dijkstra(N, K);

        return cnt;
    }

    static void dijkstra(int n, int k) {

        for (int i = 1; i < n; i++) {
            int min = 500001;
            int idx = 1;

            for (int j = 2; j <= n; j++) {
                if(!visited[j] && min > dist[j]) {
                    idx = j;
                    min = dist[j];
                }
            }

            visited[idx] = true;

            for (int j = 2; j <= n ; j++) {
                if(dist[j] > dist[idx] + arr[idx][j]) {
                    dist[j] = dist[idx] + arr[idx][j];
                }
            }
        }

        for (int i = 1; i <= n ; i++) {
            if(dist[i] <= k) {
                cnt++;
            }
        }
    }
}