package geometric_shapes;

//Refer�ncia: pg 176, 269 - DEITEL, Paul J.; Deitel, Harvey M. Java: como programar - 8� edi��o.
//Declara��o da classe MyFilledRectangle
import java.awt.Graphics;

public class MyFilledRectangle extends MyShape {

	//Desenha o ret�ngulo preenchido na cor especificada
	public void draw(Graphics g) {
		g.setColor(myColor);
		g.fillRect(coordinate1, coordinate2, coordinate3, coordinate4);
	} // fim do m�todo draw

	@Override
	public String toString() {
		return "MyFilledRectangle [coordinate1=" + coordinate1 
				+ ", coordinate2=" + coordinate2 + ", coordinate3="
				+ coordinate3 + ", coordinate4=" + coordinate4 + "]";
	}

}
