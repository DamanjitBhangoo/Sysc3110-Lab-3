import java.util.*;

public class BuddyInfo {

	static String name="Daman";
	int phonenumber;
	int houseadress;
	String streetname;	
	
	public BuddyInfo(String name){
		this.name=name;
	}
	public static String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}


	public int getHouseadress() {
		return houseadress;
	}


	public void setHouseadress(int houseadress) {
		this.houseadress = houseadress;
	}


	public String getStreetname() {
		return streetname;
	}


	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world!");
		System.out.print(getName());
	}


	public static void add(BuddyInfo x) {
		// TODO Auto-generated method stub
		
	}

}
