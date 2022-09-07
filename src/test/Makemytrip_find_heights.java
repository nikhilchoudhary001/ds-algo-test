package test;

public class Makemytrip_find_heights {

	/* Problem: There are n ppl standing in a queue.
They are all of n distinct Heights: [1,2,3,4, ......n]
Below array represents the number of ppl standing in front of a person that are taller than him.
A : [0,1,1 .......] n entries
Print the heights of each person in the queue in the order they are standing in the queue.
Ex-1:
n: 3
A : [0,1,1]
	 3 1 2
	3	1 2

solution : 3 1 2
Ex-2:
n: 6
A: [0,0,0,2,2,4]
	1 5 6 3 4 2     {6, 5, -1, 3, -1, 1}
Solution: 1 5 6 3 4 2   
  Ex - 3
4 3 2 5 1 6
0 1 2 0 4 0
	 */
	public static void main(String[] args) {
		int[] heights = {0, 1, 2, 0, 4, 0};
		 int n = 6;
		int[] arr = new int[n];
		
		int res[] = new int[n];
		
		int temp = n;
		for(int i = 0; i < n; i++) {
			arr[i] = temp;
			temp--;
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		int idx = n-1;
		while(idx >= 0) {
			int tallAhead = heights[idx];
			int curr = 0;
			
			while(tallAhead != 0) {
				if(arr[curr] != -1) {
					tallAhead--; // 0
					
				}
				curr++; // 4
			}
			
			while(curr < n && arr[curr] == -1) {
				curr++;
			}
			//System.out.println(curr);
			res[idx] = arr[curr];
			arr[curr] = -1;
			idx--;
		}
		
		for(int i : res) {
			System.out.print(i + " ");
		}
		
		System.out.println(" ");
		}

	}
