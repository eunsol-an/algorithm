class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.toLowerCase().split("");
		
		boolean flag = true;
		
		for (String word : words) {
			sb.append(flag ? word.toUpperCase() : word);
			flag = word.equals(" ") ? true : false;
		}
        return sb.toString();
    }
}