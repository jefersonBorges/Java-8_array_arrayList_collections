package programmer;

import java.util.ArrayList;

public class Programador extends Funcionario{

	private ArrayList<String> linguagens;
	private ArrayList<Integer> experiencias;
	
	public Programador(String nome, String dataAdmissao, String funcao) {
		super(nome, dataAdmissao, funcao);
		this.linguagens = new ArrayList <String>();
		this.experiencias = new ArrayList <Integer>();
	}
	
	public int compareTo(Programador nome, String linguagem) {
		
		if (this.linguagens.contains(linguagem)) {
		
			int index1 = this.linguagens.indexOf(linguagem);
			int index2 = nome.linguagens.indexOf(linguagem);
			
			int exp1 = this.experiencias.get(index1);
			int exp2 = nome.experiencias.get(index2);
			
			if (exp1 > exp2) {
				return -1;
			} else if (exp1 == exp2) {
				return 0;
			} else if (exp1 < exp2) {
				return 1;
			} else {
				return 2;
			}
		} else {
			return 2;
		}
	}
	
	public void setLinguagem(String linguagem0, String linguagem1, String linguagem2) {
		this.linguagens.add(linguagem0);
		this.linguagens.add(linguagem1);
		this.linguagens.add(linguagem2);
	}
	
	public ArrayList<String>getLinguagens(){
		return linguagens;
	}
	
	public void setExperiencia(int experiencia0, int experiencia1, int experiencia2) {
		this.experiencias.add(experiencia0);
		this.experiencias.add(experiencia1);
		this.experiencias.add(experiencia2);
	}
	
	public ArrayList<Integer>getExperiencia(){
		return experiencias;
	}

	public ArrayList<Integer> getExperiencias() {
		return experiencias;
	}

	public void setExperiencias(ArrayList<Integer> experiencias) {
		this.experiencias = experiencias;
	}

	public void setLinguagens(ArrayList<String> linguagens) {
		this.linguagens = linguagens;
	}

	@Override
	public String toString() {
		return super.toString() +"Programador [linguagens=" + linguagens + ", experiencias=" + experiencias + "]";
	}
	
	
	
}
