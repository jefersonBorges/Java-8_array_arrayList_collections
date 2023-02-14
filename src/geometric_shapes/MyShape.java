package geometric_shapes;

/*Caracter�sticas comuns �s classes filhas:
 * Construtor com 4 coordenadas e 1 cor;
 * M�todo Draw
 */

import java.awt.Color;
import java.awt.Graphics;

public abstract class MyShape {

	int coordinate1; 
	int coordinate2;
	int coordinate3;
	int coordinate4;
	Color myColor;
	
	// construtor principal comum �s formas linha, ret�ngulo e oval
	public MyShape(int coordinate1, int coordinate2, int coordinate3, int coordinate4, Color myColor) {
		super();
		this.coordinate1 = coordinate1;
		this.coordinate2 = coordinate2;
		this.coordinate3 = coordinate3;
		this.coordinate4 = coordinate4;
		this.myColor = myColor;
	}
	
	// construtor vazio para permitir criar os objetos com os m�todos de set
	public MyShape() {
		
	}

	//todas as formas das classes filhas t�m 4 coordenadas
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
	
	// m�todo utilizado para desenhar as formas na cor especificada
	// cada classe dever� acrescentar a forma a ser desenhada
	public void draw(Graphics g){
		g.setColor(getMyColor());
	}
	
	// M�todo necess�rio para expor as coordenadas utilizadas para a cria��o das formas
	public abstract String toString();

}
