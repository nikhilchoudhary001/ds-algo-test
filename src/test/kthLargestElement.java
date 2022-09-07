package test;

import java.util.PriorityQueue;

public class kthLargestElement {

	public static void main(String[] args) {
		 int[] a = {-1, 100, 0, 1, 50, 2,20};
		 int k = 2;
		System.out.println(getKthLargest(a, k));

	}

	public static int getKthLargest(int[] arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		    for(int i = 0; i < k; i++){
		        pq.add(arr[i]);
		    } // -1, 0, 100
		    // [-1, 100, 0, 1, 5, 2]
		    
		    for(int j = k; j < arr.length; j++){
		        if(pq.peek() < arr[j]){ // -1 < 1
		            pq.poll(); // -1
		            pq.add(arr[j]); // 
		        }
		    }
		    
		    return pq.poll();
		}
}
