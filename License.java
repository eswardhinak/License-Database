import java.util.Scanner;
public class License
{
	public String name1;
	public int age1;
	public String race;
	//protected String race1;
//	protected int age;
///	protected String eyecol;
//	protected String race;
//	protected String key;
	

	public License (String n, int a, String r)
	{
		name1 = n;
		age1 = a;
		race = r;
		//race1 = r;

	}
		
//	public boolean equals(Object other)
	//other is another license
	//returns true if the account is the same as another 
/*	{	
		public boolean check;
		License that = (License)other;
		check = (this.key == that.key);
		return check;
	}*/
	public String getName()
	{
		return name1;
	}
	public int getAge()
	{
		return age1;
	}
	
	public String getRace()
	{
		return race;
	}
/*	public int getDob()
	{
		return age;
	}
	/*public String getEyeColor()
	{
		return eyecol;
	}
	public String getRace()
	{
		return race;
	}
*/
}
	
