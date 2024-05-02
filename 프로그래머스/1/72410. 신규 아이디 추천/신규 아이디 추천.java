class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        String recoID = new_id.toLowerCase();
        recoID = recoID.replaceAll("[^a-z0-9_.-]","");
        recoID = recoID.replaceAll("\\.{2,}",".");
        recoID = recoID.replaceAll("^\\.|\\.$","");
        if (recoID.length() == 0) {
            recoID = "a";
        } else if (recoID.length() > 15) {
            recoID = recoID.substring(0, 15);
        }
        recoID = recoID.replaceAll("\\.$","");
        if (recoID.length() < 3) {
            String last = recoID.substring(recoID.length() - 1);
            while (recoID.length() < 3) {
                recoID += last;
            }
        }
        answer = recoID;
        return answer;
    }
}