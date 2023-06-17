import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        Queue<Integer> minHeap = new PriorityQueue<>(); // 최소힙
	    Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // 최대힙

        for (int i = 0; i < operations.length; i++) {
            // 삽입
            if (operations[i].charAt(0) == 'I') { 
                int data = Integer.parseInt(operations[i].split(" ")[1]);
                minHeap.add(data);
                maxHeap.add(data); 
            } 
            // 삭제
            else {
                if(operations[i].split(" ")[1].equals("1")) { // 최댓값 삭제 
                    minHeap.remove(maxHeap.poll()); 
                }
                else{        // 최솟값 삭제
                    maxHeap.remove(minHeap.poll()); 
                }
            }

        }
        if(minHeap.isEmpty()){
            return new int[] {0, 0};
        }
        
        return new int[] {maxHeap.poll(), minHeap.poll()};
    }
}