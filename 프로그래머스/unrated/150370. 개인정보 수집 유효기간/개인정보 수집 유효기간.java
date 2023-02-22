import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        today = today.replaceAll("\\D","");
        int todayInt = Integer.parseInt(today);
        List<Integer> ret = new ArrayList<>();
        HashMap<String, String> maps = new HashMap<>();
        for(int i=0;i<terms.length;i++) {
            String[] temp = terms[i].split(" ");
            maps.put(temp[0], temp[1]);
        }
        int expMonth = 0;
        int expYear = 0;
        int expDay = 0;
        for(int i=0; i<privacies.length;i++) {

            String pastDate= privacies[i].replaceAll("\\D","");

            int pastMonth = Integer.parseInt(pastDate)/100%100;
            int pastYear = Integer.parseInt(pastDate)/10000;
            char type = privacies[i].charAt(privacies[i].length()-1);
            int addMonth = Integer.parseInt(maps.get(""+type));
            int addYear  =0 ;

            if(pastMonth+addMonth > 12 ) {
                addYear = (pastMonth+addMonth-1)/12; //
                addMonth = (addMonth-(12*addYear)); //
            }
            expMonth = addMonth+pastMonth;
            expYear = pastYear+addYear;
            expDay = Integer.parseInt(pastDate)%100;


            int expDate = expDay+(expMonth*100)+(expYear*10000);

            if(todayInt >= expDate)
                ret.add(i+1);


        }

        int answer[] = new int[ret.size()];
        for(int i=0;i<answer.length;i++)
        {
            answer[i]= ret.get(i);
        }
        Arrays.sort(answer);


        return answer;
    }
}