package geometric_shapes;

/*Características comuns às classes filhas:
 * Construtor com 4 coordenadas e 1 cor;
 * Método Draw
 */

import java.awt.Color;
import java.awt.Graphics;

public abstract class MyShape {

	int coordinate1; 
	int coordinate2;
	int coordinate3;
	int coordinate4;
	Color myColor;
	
	// construtor principal comum às formas linha, retângulo e oval
	public MyShape(int coordinate1, int coordinate2, int coordinate3, int coordinate4, Color myColor) {
		super();
		this.coordinate1 = coordinate1;
		this.coordinate2 = coordinate2;
		this.coordinate3 = coordinate3;
		this.coordinate4 = coordinate4;
		this.myColor = myColor;
	}
	
	// construtor vazio para permitir criar os objetos com os métodos de set
	public MyShape() {
		
	}

	//todas as formas das classes filhas têm 4 coordenadas
	public void setCoordinates(int c1, int c2, int c3, int c4) {
		this.coordinate1 = c1;
		this.coordinate2 = c2;
		this.coordinate3 = c3;
		this.coordinate4 = c4;
	}
	
	public Color getMyColor() {
		return myColor;
	}

	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}
	
	// método utilizado para desenhar as formas na cor especificada
	// cada classe deverá acrescentar a forma a ser desenhada
	public void draw(Graphics g){
		g.setColor(getMyColor());
	}
	
	// Método necessário para expor as coordenadas utilizadas para a criação das formas
	public abstract String toString();

}
