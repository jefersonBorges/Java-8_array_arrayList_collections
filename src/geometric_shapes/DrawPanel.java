package geometric_shapes;

//Referência: pg 269 - DEITEL, Paul J.; Deitel, Harvey M. Java: como programar - 8ª edição.
//Figura 8.22: DrawPanel.java
// Programa que utiliza a classe Myline, MyFilledRectangle e MyFilledOval
//para desenhar formas de tamanhos e cores aleatórias
// foi acrescentado espaçamento extra em x para as formas diferentes não se sobreporem

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	//inicializa o objeto randomNumbers para podermos utilizar os métodos Random
	private Random randomNumbers = new Random();
	
	//Cria 3 arrays com os objetos de cada forma
	private MyLine[] lines; // array de linhas
	private MyFilledRectangle[] filledRectangles; // array de retângulos preenchidos;
	private MyFilledOval[] filledOvals; // array de retângulos preenchidos;
	
	// método para geração de cores aleatórias
	public Color generateRandomColor(int max) {
		Color randomColor = new Color (
				randomNumbers.nextInt(max),
				randomNumbers.nextInt(max),
				randomNumbers.nextInt(max)
				);
		return randomColor;
	}
	
	// método para geração de números aleatórios
	public int generateRandomNumber(int max) {
		int randomNumber = randomNumbers.nextInt(max);
		return randomNumber;
	}
	
	// construtor, cria um painel com formas aleatórias
	public DrawPanel() {
		
		setBackground(Color.WHITE);
		
		lines = new MyLine[5 + generateRandomNumber(5)]; //cria array de linhas		
		
		//cria cada linha do array de linhas
		for (int count = 0; count < lines.length; count++) {
			
			//inicializa o objeto MyLine e adiciona a linha à lista de linhas a ser exibida
			lines[count] = new MyLine();
			
			//gera coordenadas aleatórias
			lines[count].setCoordinates( 
					generateRandomNumber(200), 
					generateRandomNumber(200), 
					generateRandomNumber(200),
					generateRandomNumber(200));

			//gera a cor aleatória
			lines[count].setMyColor(generateRandomColor(256));
			
			//indica as coordenadas em console
			System.out.println(lines[count].toString());
		} // for lines final
		
		//cria array de retângulos preenchidos
		filledRectangles = new MyFilledRectangle[5 + generateRandomNumber(5)];

		//cria cada retângulo preenchido do array de retângulos preenchidos
		for (int count = 0; count < filledRectangles.length; count++) {
			
			//inicializa o objeto MyLine e adiciona a linha à lista de linhas a ser exibida
			filledRectangles[count] = new MyFilledRectangle();
			
			//gera coordenadas aleatórias
			filledRectangles[count].setCoordinates( 
					400 + generateRandomNumber(200), 
					generateRandomNumber(200), 
					generateRandomNumber(200),
					generateRandomNumber(200));

			//gera a cor aleatória
			filledRectangles[count].setMyColor(generateRandomColor(256));
			
			//indica as coordenadas em console
			System.out.println(filledRectangles[count].toString());
		} // for filledRectangles final
		
		
		//cria array de ovais preenchidos
		filledOvals = new MyFilledOval [5 + generateRandomNumber(5)];
		
		//cria cada oval preenchido do array de ovais preenchidos
		for (int count = 0; count < filledOvals.length; count++) {
			
			//inicializa o objeto MyLine e adiciona a linha à lista de linhas a ser exibida
			filledOvals[count] = new MyFilledOval();
			
			//gera coordenadas aleatórias
			filledOvals[count].setCoordinates( 
					800 + generateRandomNumber(200), 
					generateRandomNumber(200), 
					generateRandomNumber(200),
					generateRandomNumber(200));

			//gera a cor aleatória
			filledOvals[count].setMyColor(generateRandomColor(256));
			
			//indica as coordenadas em console
			System.out.println(filledOvals[count].toString());
		} // for filledOvals final
		
	}// fim do construtor DrawPanel
	
	//para cada array de forma, desenha as formas individuais
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//desenha as linhas
		for (MyLine line : lines) {
			line.draw(g);
		}
		//desenha os retângulos preenchidos
		for (MyFilledRectangle filledRectangle : filledRectangles) {
			filledRectangle.draw(g);
		}
		//desenha os ovais preenchidos
		for (MyFilledOval filledOval : filledOvals) {
			filledOval.draw(g);
		}
	} //fim do método paintComponent
} // fim da classe DrawPanel
