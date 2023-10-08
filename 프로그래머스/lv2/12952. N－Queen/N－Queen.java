class Solution {
    
    static int[] arr;
    static int cnt;
    
    public int solution(int n) {
        int answer = 0;
        arr = new int[n];

        bt(n ,0);

        answer = cnt;
        return answer;
    }
    
    static void bt(int n, int row) {
        
        if(n == row) {
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[row] = i;
            if(possible(row)) {
                bt(n ,row + 1);
            }
        }
    }

    
    static boolean possible(int row) {
        for (int i = 0; i < row; i++) {
            
            if(arr[i] == arr[row]) {
                return false;
            }

            if(Math.abs(row - i) == Math.abs(arr[row] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}