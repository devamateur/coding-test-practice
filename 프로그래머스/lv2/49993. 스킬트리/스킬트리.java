class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        // skill에 포함 안 된 문자는 모두 제거
        for(int i=0; i<skill_trees.length; i++){
            skill_trees[i] = skill_trees[i].replaceAll("[^"+skill+"]", "");
        }    
        
        // 스킬트리에 skill이 순서대로 있으면 answer 증가
        for(int i=0; i<skill_trees.length; i++){
            System.out.println(skill_trees[i]);
            // 다른 스킬은 순서에 상관없이 배울 수 있음
            if (skill_trees[i].equals("")) {
                answer++;
                continue;
            }
            for(int j=0; j<skill.length(); j++){
                if(skill_trees[i].equals(skill.substring(0, j+1))){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}