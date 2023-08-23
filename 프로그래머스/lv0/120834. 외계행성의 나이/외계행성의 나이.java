class Solution {
    public String solution(int age) {
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] split = Integer.toString(age).split("");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (j == Integer.parseInt(split[i])) {
                    answer.append(alphabet[j]);
                    break;
                }
            }
        }
        return answer.toString();
    }
}