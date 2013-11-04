import java.util.Scanner;

public class LicenseBank
{
	private License[] accounts;
	private int numofAccounts;
	
	public LicenseBank()
	{
		accounts = new License[100];
		numofAccounts = 0;
	}
	
	public int createNewLicense(String name, int age, String r)
	{
		License l = new License(name, age, r);
		this.addToBank(l);
		return 0;
	}
	public void addToBank(License c)
	{
		accounts[numofAccounts] = c;
		int key = 987* (numofAccounts*4500+234);
		System.out.println("Keep your key safe:" + key);
		numofAccounts++;
	}
	public void getLicense(int key)
	{	//	License object;
		int accountnumber = ((key/987)-234)/4500;
		//object = accounts[accountnumber];
		System.out.println(accounts[accountnumber].getName());
		System.out.println(accounts[accountnumber].getAge());
		System.out.println(accounts[accountnumber].getRace());


	}
		
}
