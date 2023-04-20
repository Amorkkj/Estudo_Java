package entities;

public class Client {

	private int accNumber;
	private String name;
	private double value;
	
	public Client(int accNumber, String name, double value) {
		this.accNumber = accNumber;
		this.name = name;
		this.value = value;
	}

	public Client(int accNumber, String name) {
		this.accNumber = accNumber;
		this.name = name;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}	
	
	public void deposite(double value) {
		this.value += value;
	}
	
	public void withdraw(double value) {
		this.value -= value + 5;
	}
	
	public String toString() {
		return "Account: " + accNumber + ", Holder: " + name + ", Balance: $" + value;
	}
	
}
