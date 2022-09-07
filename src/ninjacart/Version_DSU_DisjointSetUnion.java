package ninjacart;

import java.util.ArrayList;
import java.util.List;

// Mistakes I did during interview are mentioned in comments 
public class Version_DSU_DisjointSetUnion {
	
	// Can also use ArrayList but we need to initialize rank and parent list with 1 as value in entire rank list before using it in union
//	List<Integer> parent;
//	List<Integer> rank;
	
	int[] parent;
	int[] rank;
	
	Version_DSU_DisjointSetUnion(){
		parent = new int[100];
		rank = new int[100];
		
		for(int i = 0; i < 100; i++) {
			parent[i] = i;
		}
		for(int i = 0; i < 100; i++) {
			rank[i] = 1;
		}
	}

	public boolean isCompatible(int sV, int Tv) {
		
		if(findParent(sV) == findParent(Tv)) {
			System.out.println("Parent "+  parent[sV] + " " + parent[Tv]);
			return true;
		}else {
			System.out.println("Parent "+  parent[sV] + " " + parent[Tv]);
			return false;
		}
		
	}

	public void addNewVersion(int sV, boolean isCompatible) {
	
		if(isCompatible) {
			union(sV, sV - 1);
		}
	}
	
	private void union(int v1, int v2) { // 2 1
		int p1 = findParent(v1); // 2
		int p2 = findParent(v2); // 0
		
		//System.out.println(p1 + " " + p2);
		
		if(p1 != p2) {
			if(rank[p1] < rank[p2]) {  // IMP : should not be rank[v1] < rank[v2], otherwise it will give wrong o/p
				parent[p1] = p2;
				rank[p2]++;
			}else if(rank[p1] > rank[p2]) {
				parent[p2] = p1;
				rank[p1]++;
			}else {
				parent[p1] = p2;
				rank[p2]++;
			}
		}
	//HUGE MISTAKE : In all above if conditions, I did rank[v1],rank[v2],parent[v1],parent[v2] instead of checking for p1,p2
	}
	
	public void printRank() {
		for(int i = 0; i <= 9; i++) {
			System.out.print(rank[i] + " ");
		}
		System.out.println( " ");
	}
	
	public void printParent() {
		for(int i = 0; i <= 9; i++) {
			System.out.print(parent[i] + " ");
		}
	}
	
	private int findParent(int v) {
		if(parent[v] == v) {
			return v;
		}
		
		int temp = findParent(parent[v]);
		// Path Compression used to point each member directly to parent - TC - O(1) instead of going one by one - TC O(N)
		parent[v] = temp;
		return temp;
	}
	
}
