package Java05;

public class Deposito {
	
	private int Number;
	private String Nome;
	private double Saldo;
	
	public Deposito(int Number, String Nome, double Saldo){
		this.Number = Number;
		this.Nome = Nome;
		this.Saldo = Saldo;
	}
	
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	public void Deposito(double saldo){
		this.Saldo += saldo;
	}
	
	public void Saque(double saldo){
		this.Saldo -= saldo;
	}
	
	public String toString() {
		return "Conta: "+Number+
				", Nome: "+Nome+
				", Saldo: "+String.format("%.2f", Saldo);
	}
	
}
