package ninjacart;

public class NinjaCart {

	public static void main(String[] args) {
		Version_DSU_DisjointSetUnion version = new Version_DSU_DisjointSetUnion();
		version.addNewVersion(1, true);
		version.addNewVersion(2, true);
		version.addNewVersion(3, false);
		version.addNewVersion(4, true);
		version.addNewVersion(5, true);
		version.addNewVersion(6, true);
		version.addNewVersion(7, false);
		version.addNewVersion(8, true);
		version.addNewVersion(9, true);

		System.out. println(version.isCompatible(1, 2));
		System.out. println(version.isCompatible(1, 3));
		System.out. println(version.isCompatible(4, 6));
		System.out. println(version.isCompatible(3, 7));
		System.out. println(version.isCompatible(6, 3));

		
		version.printRank();
		version.printParent();
	}

}

// Console Output
//True
//False
//True
//False
//True

//Version Management 
//
//0 is the initial version
//
//Void addNewVersion(int sV, boolean isCompatible);
//Boolean isCompatible(int sV, int Tv);
//
//addNewVersion(1, true)
//addNewVersion(2, true)
//addNewVersion(3, false)
//addNewVersion(4, true)
//addNewVersion(5, true)
//addNewVersion(6, true)
//addNewVersion(7, false)
//addNewVersion(8, true)
//addNewVersion(9, true)
//
//isCompatible(1, 2) == true
//isCompatible(1, 3) == false
//isCompatible(2, 4) == false
//isCompatible(3, 6) == true
//isCompatible(3, 7) == false
//isCompatible(6, 3) == true
//isCompatible(3, 1) == false
//
//Class Version {
//Boolean isCompatible(int sV, int Tv) {
//
//Return false;
//}
//
//Void addNewVersion(int sV, boolean isCompatible) {
//
//}
//
//psvm(String[] args) {
//addNewVersion(1, true);
//addNewVersion(2, true);
//addNewVersion(3, false);
//addNewVersion(4, true);
//addNewVersion(5, true);
//addNewVersion(6, true);
//addNewVersion(7, false);
//addNewVersion(8, true);
//addNewVersion(9, true);
//
//System.out. println(isCompatible(1, 2));
//System.out. println(isCompatible(1, 3));
//System.out. println(isCompatible(4, 6));
//System.out. println(isCompatible(3, 7));
//System.out. println(isCompatible(6, 3));
//
//}





