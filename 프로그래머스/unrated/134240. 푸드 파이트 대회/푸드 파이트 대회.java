class Solution {
    public String solution(int[] food) {
        // 2, 3 => 1 / 4, 5 => 2 / 6, 7 => 3
        // food 의 i 번째 수를 2 로 나눈 몪을 변수 count 에 대입
        // count 만큼 돌면서 i 를 반복해서 찍음
        // 반쪽짜리 완성되면 0 붙이고 역정렬해서 다시 붙임

        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int count = food[i] / 2;
            sb.append(Integer.toString(i).repeat(count));
        }
        answer = sb + "0";
        return answer + sb.reverse();
    }
}