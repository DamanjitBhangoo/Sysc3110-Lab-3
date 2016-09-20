import java.util.*;

public class AddressBook {

	static ArrayList<BuddyInfo> list = new ArrayList<BuddyInfo>();
	
	public void addBuddy(BuddyInfo x) {
		if (x != null ){
			list.add(x);
		}
	}
	
	public void removeBuddy(int x) {
		if (x >= 0 && x <list.size() ){
			list.remove(x);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BuddyInfo x = new BuddyInfo("hi");
		AddressBook AB = new AddressBook();
		System.out.println("Hello world!");
		AB.addBuddy(x);
	}

}
