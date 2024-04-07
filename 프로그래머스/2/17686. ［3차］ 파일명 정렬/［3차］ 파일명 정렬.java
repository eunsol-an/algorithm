import java.util.Arrays;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (o1, o2) -> {
            String head1 = o1.split("[0-9]")[0].toLowerCase();
            String head2 = o2.split("[0-9]")[0].toLowerCase();
            if (head1.compareTo(head2) == 0) {
                int number1 = getNumber(o1.substring(head1.length()));
                int number2 = getNumber(o2.substring(head2.length()));
                return number1 - number2;
            } else {
                return head1.compareTo(head2);
            }
        });

        return files;
    }
    
    private static int getNumber(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append(c);
            } else {
                return Integer.parseInt(result.toString());
            }
        }
        return Integer.parseInt(result.toString());
    }
}