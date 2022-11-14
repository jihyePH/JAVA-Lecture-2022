package ch06;

public class Ex32_Account {
	private String ano;
	private String owner;
	private int balance;
	
	Ex32_Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	
	
}
