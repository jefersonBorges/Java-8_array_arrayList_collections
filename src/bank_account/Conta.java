package bank_account;

public class Conta {

	private double saldo;
	private int codigo;
	
	public Conta(int codigo){
		this.setSaldo(0);
		this.codigo = codigo;	
	}

	int getCodigo(){
		return codigo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	void exibeTipo(){
		System.out.println("Conta: " + getCodigo());
	}

}
