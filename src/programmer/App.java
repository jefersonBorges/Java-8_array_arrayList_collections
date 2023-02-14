package programmer;

public class App {

	public static void main(String[] args) {

		Programador p1 = new Programador("Jeferson", "ABR/2020","Programador");
		Programador p2 = new Programador("Borges", "ABR/2019","Programador");
		
		p2.setLinguagem("Java", "JavaScript", "CSS");
		p2.setExperiencia(2, 1, 1);
		
		p1.setLinguagem("CSS", "Phyton", "JavaScript");
		p1.setExperiencia(2, 3, 1);

		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	
		
		switch(p1.compareTo(p2, "Java")) {
		case -1:
			System.out.println("O funcionario " + p1.getNome() + " possui menor experiencia na linguagem em comparacao ao programador " + p2.getNome());
			break;
		case 0:
			System.out.println("O funcionario " + p1.getNome() + " possui tanta experiencia na linguagem quanto em comparacao ao programador " + p2.getNome());
			break;
		case 1:
			System.out.println("O funcionario " + p1.getNome() + " possui maior experiencia na linguagem em comparacao ao programador " + p2.getNome());
			break;
		case 2:
			System.out.println("O funcionario " + p1.getNome() + " nao possui experiencia na linguagem em comparacao ao programador " + p2.getNome());
			break;
		}
		
	}
	
}
