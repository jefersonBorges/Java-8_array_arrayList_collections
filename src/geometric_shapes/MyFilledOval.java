package geometric_shapes;

//Refer�ncia: pg 176, 269 - DEITEL, Paul J.; Deitel, Harvey M. Java: como programar - 8� edi��o.
//Declara��o da classe MyFilledOval

import java.awt.Graphics;

public class MyFilledOval extends MyShape {
	
	//Desenha o oval preenchido na cor especificada
	public void draw(Graphics g) {
		g.setColor(myColor);
		g.fillOval(coordinate1, coordinate2, coordinate3, coordinate4);
	} // fim do m�todo draw

	@Override
	public String toString() {
		return "MyFilledOval [coordinate1=" + coordinate1 
				+ ", coordinate2=" + coordinate2 + ", coordinate3="
				+ coordinate3 + ", coordinate4=" + coordinate4 + "]";
	}
	
}
