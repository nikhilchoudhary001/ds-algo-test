package test;

public class JungleeGames {

	public static void main(String[] args) {
		int arr[] = {0, 1, 2, 3, 4, 6};
		int totalSp = 15;
		
		int dp[] = new int[arr.length + 1];			 
		int max = helper(arr, dp, totalSp);
		
		for(int i : dp) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(max);
	}
	
	
	// write recurrence relation
//	static int helper(int arr[], int[] dp, int sp) {
//
//		
//		if(totalSp % curr == 0) {
//			max = Math.max(max, (totalSp / curr) * arr[curr]);
//			helper(arr, totalSp, totalSp, 0,curr + 1);
//		}
//		
//		int currDays = (totalSp % curr);
//		currMax = ((totalSp  - currDays)/ curr) * arr[curr];
//		helper(arr , totalSp, currDays, curr + 1, currMax);
//		
//		return max;
//	}
	
	// Solved using bottom-up DP instead of top down memorization
	static int helper(int arr[], int[] dp, int sp) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i < arr.length; i++) {
			int curr = 0;
			if(sp % i == 0) {
				curr = (sp / i) * arr[i];
				max = Math.max(max, (sp / i) * arr[i]);
				dp[i] = curr;
			}else {
				int remSp = (sp % i);
				curr = ((sp  - remSp)/ i) * arr[i] + arr[remSp];
				max = Math.max(max, curr);
				dp[i] = curr;
			}
		}
		
		return max;
	}

	
}
