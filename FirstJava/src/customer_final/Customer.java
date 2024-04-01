package customer_final;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;

public class Customer implements Serializable {
	
	HashMap<String, HashMap<String, Integer>> customer;
	
	File saveFile = null;
	String savePath = "saveFile/CustomerManager.txt";
	
	private static final long serivalVersionUID = -1L;
	
	private String name;
	private String gender;
	private String email;
	private int birthYear;
	
	public Customer() {
		
		customer = new HashMap<>();
		saveFile = new File(savePath);
		if(!saveFile.exists()) {
			File dir = new File(saveFile.getParent());
			dir.mkdir();
		}
		load();
	}
	
	private void load() {
		// TODO Auto-generated method stub
		
	}

	public Customer(String name, String gender, String email, int birthYear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", email=" + email + ", birthYear=" + birthYear + "]";
	}
	
	
}
