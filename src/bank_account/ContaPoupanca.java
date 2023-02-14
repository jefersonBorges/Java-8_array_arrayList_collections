package bank_account;

public class ContaPoupanca extends Conta {
	
	private int diaAbertura;
	
	public ContaPoupanca(int codigo, int diaAbertura){
		super(codigo);
		this.setDiaAbertura(diaAbertura); 
	}

	public int getDiaAbertura() {
		return diaAbertura;
	}

	public void setDiaAbertura(int diaAbertura) {
		this.diaAbertura = diaAbertura;
	}

	void exibeTipo(){
		System.out.println("Conta Poupança: " + getCodigo());
	}
}
