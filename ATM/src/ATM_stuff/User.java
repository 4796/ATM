package ATM_stuff;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class User implements Serializable {

	
	public static int ID=0;
	private int id;
	private String name;
	private String lastName;
	private String userName;
	private String password;
	private List<Transaction> transakcije=new LinkedList<>();
	private double balance;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)  {
		if(name==null)
			throw new RuntimeException("Please type in your name");
		if(name.length()<2)
			throw new RuntimeException("Please type in your name");
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName)  {
		if(lastName==null)
			throw new RuntimeException("Please type in your Lastname");
		if(lastName.length()<2)
			throw new RuntimeException("Please type in your Lastname");
		
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) throws Exception {
		if(userName==null)
			throw new RuntimeException("Please type in your username");
		if(userName.length()<2)
			throw new RuntimeException("Please type in your username");
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) throws Exception {
		if(password==null)
			throw new RuntimeException("Please type in your password");
		if(password.length()<2)
			throw new RuntimeException("Please type in your password");
		if(password.length()<8)
			throw new RuntimeException("Please type in stronger password. Atleast 8 characters");
		this.password = password;
	}
	
	public List<Transaction> getTransakcije() {
		return transakcije;
	}
	public void setTransakcije(List<Transaction> transakcije) {
		this.transakcije = transakcije;
	}
	@Override
	public int hashCode() {
		return Objects.hash(userName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userName, other.userName);
	}
	@Override
	public String toString() {
		return id + "    " + name + "     " + lastName + "    " + userName + "    "
				+ balance;
	}
	
}
