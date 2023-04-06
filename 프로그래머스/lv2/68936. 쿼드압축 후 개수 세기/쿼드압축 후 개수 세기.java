class Solution {
    // 쿼드 압축 후 배열에 최종적으로 남는 0과 1의 개수를 리턴
    static int zeros=0;
    static int ones=0;
    public int[] solution(int[][] arr) {

        quad(0, 0, arr.length, arr);
        return new int[] {zeros, ones};
    }
    static void quad(int y, int x, int size, int[][] arr) {
        if (check(y, x, size, arr)) { 
            if (arr[y][x] == 0) {
                zeros++;
            } else {
                ones++;
            }
            return;
        }

        quad(y, x, size/2, arr);                        // 왼쪽 위
        quad(y, x + size/2, size/2, arr);               // 오른쪽 위
        quad(y + size/2, x, size/2, arr);               // 왼쪽 아래
        quad(y + size/2, x + size/2, size/2, arr);      // 오른쪽 아래
    }

    // 범위 내의 모든 수가 같은 값인지 확인
    static boolean check(int y, int x, int size, int[][] arr) {
        for (int i = y; i < y + size; i++) {
            for (int j = x; j < x + size; j++) {
                if (arr[i][j] != arr[y][x]) {
                    return false;
                }
            }
        }

        return true;
    }
}