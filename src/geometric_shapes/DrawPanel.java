package geometric_shapes;

//Refer�ncia: pg 269 - DEITEL, Paul J.; Deitel, Harvey M. Java: como programar - 8� edi��o.
//Figura 8.22: DrawPanel.java
// Programa que utiliza a classe Myline, MyFilledRectangle e MyFilledOval
//para desenhar formas de tamanhos e cores aleat�rias
// foi acrescentado espa�amento extra em x para as formas diferentes n�o se sobreporem

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	//inicializa o objeto randomNumbers para podermos utilizar os m�todos Random
	private Random randomNumbers = new Random();
	
	//Cria 3 arrays com os objetos de cada forma
	private MyLine[] lines; // array de linhas
	private MyFilledRectangle[] filledRectangles; // array de ret�ngulos preenchidos;
	private MyFilledOval[] filledOvals; // array de ret�ngulos preenchidos;
	
	// m�todo para gera��o de cores aleat�rias
	public Color generateRandomColor(int max) {
		Color randomColor = new Color (
				randomNumbers.nextInt(max),
				randomNumbers.nextInt(max),
				randomNumbers.nextInt(max)
				);
		return randomColor;
	}
	
	// m�todo para gera��o de n�meros aleat�rios
	public int generateRandomNumber(int max) {
		int randomNumber = randomNumbers.nextInt(max);
		return randomNumber;
	}
	
	// construtor, cria um painel com formas aleat�rias
	public DrawPanel() {
		
		setBackground(Color.WHITE);
		
		lines = new MyLine[5 + generateRandomNumber(5)]; //cria array de linhas		
		
		//cria cada linha do array de linhas
		for (int count = 0; count < lines.length; count++) {
			
			//inicializa o objeto MyLine e adiciona a linha � lista de linhas a ser exibida
			lines[count] = new MyLine();
			
			//gera coordenadas aleat�rias
			lines[count].setCoordinates( 
					generateRandomNumber(200), 
					generateRandomNumber(200), 
					generateRandomNumber(200),
					generateRandomNumber(200));

			//gera a cor aleat�ria
			lines[count].setMyColor(generateRandomColor(256));
			
			//indica as coordenadas em console
			System.out.println(lines[count].toString());
		} // for lines final
		
		//cria array de ret�ngulos preenchidos
		filledRectangles = new MyFilledRectangle[5 + generateRandomNumber(5)];

		//cria cada ret�ngulo preenchido do array de ret�ngulos preenchidos
		for (int count = 0; count < filledRectangles.length; count++) {
			
			//inicializa o objeto MyLine e adiciona a linha � lista de linhas a ser exibida
			filledRectangles[count] = new MyFilledRectangle();
			
			//gera coordenadas aleat�rias
			filledRectangles[count].setCoordinates( 
					400 + generateRandomNumber(200), 
					generateRandomNumber(200), 
					generateRandomNumber(200),
					generateRandomNumber(200));

			//gera a cor aleat�ria
			filledRectangles[count].setMyColor(generateRandomColor(256));
			
			//indica as coordenadas em console
			System.out.println(filledRectangles[count].toString());
		} // for filledRectangles final
		
		
		//cria array de ovais preenchidos
		filledOvals = new MyFilledOval [5 + generateRandomNumber(5)];
		
		//cria cada oval preenchido do array de ovais preenchidos
		for (int count = 0; count < filledOvals.length; count++) {
			
			//inicializa o objeto MyLine e adiciona a linha � lista de linhas a ser exibida
			filledOvals[count] = new MyFilledOval();
			
			//gera coordenadas aleat�rias
			filledOvals[count].setCoordinates( 
					800 + generateRandomNumber(200), 
					generateRandomNumber(200), 
					generateRandomNumber(200),
					generateRandomNumber(200));

			//gera a cor aleat�ria
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
		//desenha os ret�ngulos preenchidos
		for (MyFilledRectangle filledRectangle : filledRectangles) {
			filledRectangle.draw(g);
		}
		//desenha os ovais preenchidos
		for (MyFilledOval filledOval : filledOvals) {
			filledOval.draw(g);
		}
	} //fim do m�todo paintComponent
} // fim da classe DrawPanel
