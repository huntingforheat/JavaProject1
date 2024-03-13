package obj;

public class Account {

	public String name;
	public String num;
	public int pwd;
	public int dep;
	int Account;

	public Account(String name, String num, int pwd, int dep) {
		this.name = name;
		this.num = num;
		this.pwd = pwd;
		this.dep = dep;	
	}
	
	public int getAccount() {
		return Account;
	}
}
