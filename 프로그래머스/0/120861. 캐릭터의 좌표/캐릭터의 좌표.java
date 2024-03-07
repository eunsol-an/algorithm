class Solution {
    private static final String[] DIR = {"up", "right", "down", "left"};
    private static final int[] DY = {1, 0, -1, 0};
    private static final int[] DX = {0, 1, 0, -1};
    
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {};
        int y = 0;
        int x = 0;
        int maxY = board[1] / 2;
        int maxX = board[0] / 2;
        for (String str : keyinput) {
            for (int i = 0 ; i < 4; i++) {
                if (DIR[i].equals(str)) {
                    y += DY[i];
                    x += DX[i];
                    if (y < -maxY || y > maxY || x < -maxX || x > maxX) {
                        y -= DY[i];
                        x -= DX[i]; 
                    }
                    break;
                }
            }
        }
        answer = new int[] {x,y};
        return answer;
    }
}