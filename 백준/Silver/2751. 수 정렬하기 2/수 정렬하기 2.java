import java.io.*;

public class Main {
	static int[] arr = new int[1000000];
	static void merge(int list[], int left, int mid, int right) {
		int i = left, j = mid+1, k = left;
		
		while(i<=mid && j<=right) {
			if(list[i]<=list[j])
				arr[k++] = list[i++];
			else
				arr[k++] = list[j++];
		}
		
		// 한쪽 부분에 남은 값들 복사 
		if(i>mid) {		// 왼쪽 부분의 모든 값이 오른쪽 부분보다 작은 경우
			for(int l = j; l <= right; l++)
				arr[k++] = list[l];
		}
		else {			// 오른쪽 부분의 모든 값이 왼쪽 부분보다 작은 경우
			for(int l = i; l <= mid; l++)
				arr[k++] = list[l];
		}
		
		// 기존 배열에 값 복사 
		for(int l = left; l<=right; l++)
			list[l] = arr[l];
	}

	//합병 정렬 
	static void mergeSort(int list[], int left, int right) {
		int mid;
		
		if(left < right) {
			mid = (left+right)/2;	
			mergeSort(list, left, mid); 	// 왼쪽 정렬(정복) 
			mergeSort(list, mid+1, right); 	// 오른쪽 정렬(정복) 
			merge(list, left, mid, right);	// 정렬된 부분 합병
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		int[] numbers = new int[n];

		for(int i=0; i<n; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		mergeSort(numbers, 0, numbers.length-1);
		
		for(int i=0; i<n; i++)
			bw.write(String.valueOf(numbers[i]) + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}