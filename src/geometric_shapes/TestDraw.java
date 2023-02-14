package geometric_shapes;

//pg 270 - DEITEL, Paul J.; Deitel, Harvey M. Java: como programar - 8ª edição.
//Figura 8.23: TestDraw.java
//Criando um JFrame para exibir um DrawPanel

import javax.swing.JFrame;

public class TestDraw {
	
	public static void main (String [] args) {
		
		DrawPanel panel = new DrawPanel();
		JFrame application = new JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(1200, 600);
		application.setVisible(true);
	} // fim de main

}// fim da classe TestDraw
