package programmer;

public abstract class Funcionario {
	
	private String nome;
	private String dataAdmissao;
	private String funcao;
	
	public Funcionario(String nome, String dataAdmissao, String funcao) {
		super();
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.funcao = funcao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", dataAdmissao=" + dataAdmissao + ", funcao=" + funcao + "]";
	}

	
}
