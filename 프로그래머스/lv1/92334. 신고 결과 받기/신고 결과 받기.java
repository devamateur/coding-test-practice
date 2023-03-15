import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, HashSet<String>> reportMap = new HashMap<>();       // [신고된 id, (신고한 id들)]
        Map<String, Integer> countMap = new HashMap<>();        // [신고된 id, 보내야 할 메일 수]
        
        // 초기화
        for(int i=0; i<id_list.length; i++){
            HashSet<String> reportingId = new HashSet<>();
            reportMap.put(id_list[i], reportingId);
            countMap.put(id_list[i], 0);
        }
        
        for(int i=0; i<report.length; i++){
            String reported = report[i].split(" ")[1];  // 신고된 id
            String reporting = report[i].split(" ")[0];     // 신고한 id
            reportMap.get(reported).add(reporting);
        }
        
        for(String key: reportMap.keySet()){      
            HashSet<String> users = reportMap.get(key);
            
            if(users.size() >= k){      // 해당 id를 신고한 유저가 k명 이상이면
                for(String user: users){
                    countMap.put(user, countMap.get(user)+1);   // 보내야할 메일+1
                }
            }
        }

        for(int i=0; i<answer.length; i++){
            answer[i] = countMap.get(id_list[i]);
        }
        
        return answer;
    }
}