package ATM_stuff;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Transaction implements Serializable  {

	private double balance;
	private LocalDateTime time;
	private boolean deposit;
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public Transaction() {
		this.time=LocalDateTime.now();
	}
	public boolean isDeposit() {
		return deposit;
	}
	public void setDeposit(boolean deposit) {
		this.deposit = deposit;
	}
	@Override
	public String toString() {
		if(deposit==true)
			return "+"+balance + "       " + time.getDayOfMonth()+"."+time.getMonthValue()+"."+time.getYear()+".  "+time.getHour()+":"+time.getMinute()+":"+time.getSecond();
		else
			return "-"+balance + "       " + time.getDayOfMonth()+"."+time.getMonthValue()+"."+time.getYear()+".  "+time.getHour()+":"+time.getMinute()+":"+time.getSecond();
	}
	
}
