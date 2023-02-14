package bank_account;

public class ContaEspecial extends Conta{

	private double limite;
	
	public ContaEspecial(int codigo, double limite){
		super(codigo);
		this.setLimite(limite); 
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	void exibeTipo(){
		System.out.println("Conta Especial: " + getCodigo());
	}
}
