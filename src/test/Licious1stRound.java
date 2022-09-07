package test;

//1,2,3,4,5,6,6,6,7,8,8,9
//target=6
//
//5,6,6,6,7,8,8,9,1,2,3,4
//Direction -> Any
//Number-> Not limited 0<=r<=1000000
//
//
//6,6,6,6,1,2,6,6,6,6,6,6,6,6,6,6,6
public class Licious1stRound {

	public static void main(String[] args) {
		//int[] arr = {5,6,6,6,7,8,8,9,1,2,3,4};
		int arr[] = {6,6,6,6,1,2,6,6,6,6,6,6,6,6,6,6,6};
		
	 System.out.println(searchTarget(1, arr));
 	}

	private static int searchTarget(int target, int[] arr) {
		int mid = 0;
		int l = 0;
		int h = arr.length - 1; // 11
		
		while(l <= h) {
			
			mid = (l + h) / 2;
			//System.out.println(mid);
			
			if(arr[mid] == target) {
				return mid;
			}
			
			// instead of checking like below, I checked arr[l] < arr[mid-1] which caused bug
			if(arr[l] < arr[mid]) {
				if(target >= arr[l] && target <= arr[mid]) {
					h = mid - 1;
				}else {
					l = mid + 1;
				}
			}else if(arr[mid] < arr[h]) {
				if(target >= arr[mid] && target <= arr[h]) {
					l = mid + 1;
				}else {
					h = mid - 1;
				}
			}else {
				return linearSearch(target, l, h, arr);
			}
		}
		
		return -1;
	}

	private static int linearSearch(int target, int l, int h,int[] arr) {
		System.out.println("linearSearch");
		for(int i = l ; i < h; i++) {
			if(target == arr[i]) {
				return i;
			}
		}
		return -1;
		
	}

}
