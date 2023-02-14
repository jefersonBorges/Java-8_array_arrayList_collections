package geometric_shapes;

//pg 269 - DEITEL, Paul J.; Deitel, Harvey M. Java: como programar - 8� edi��o.
//Figura 8.21: MyLine.java
//Declara��o da classe MyLine

import java.awt.Graphics;

public class MyLine extends MyShape {

	//Desenha a linha na cor especificada
	public void draw(Graphics g) {
		g.setColor(myColor);
		g.drawLine(coordinate1, coordinate2, coordinate3, coordinate4);
	} // fim do m�todo draw

	
	@Override
	public String toString() {
		return "MyLine [coordinate1=" + coordinate1 
				+ ", coordinate2=" + coordinate2 
				+ ", coordinate3=" + coordinate3
				+ ", coordinate4=" + coordinate4 + "]";
	}
	
} // fim da classe Myline
