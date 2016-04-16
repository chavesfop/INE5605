package Conteudo;

import javax.swing.*;
import java.awt.*;

/**
 * Exemplo de herança, neste caso Desenho é um Jpanel;
 */
public class Desenho extends JPanel {
	private int x; //Porém desenho tem uma propriedade X e o grafico g.
	private Graphics g;
	
	public Desenho(int x){
		this.x = x;
	} //e desenho precisa de X para ser construido.

	/**
	 * Sobrecarga de metodo de JPanel
	 */
	public void paintComponent(Graphics g) {
		this.g = g;
		super.paintComponent(this.g);
		
		this.renderFusca();
		
	}

	private void renderFusca() {
		this.g.drawArc(this.x, 125, 25, 50, 180, -90); //trazeira
		this.g.drawArc(13 + this.x, 100, 100, 50, 0, 180); //teto
		this.g.drawArc(60 + this.x, 125, 100, 50, 0, 90); //capo
		this.g.drawLine(this.x, 150, 163 + this.x, 150); //linha

		this.g.drawArc(18 + this.x, 135, 30, 30, 180, 180); //roda trazeira
		this.g.drawArc(113 + this.x, 135, 30, 30, 180, 180); //roda dianteira
		this.g.drawLine(0, 150 + 15, 400, 150 + 15); //chao
	}
	
	private void renderRetangulo() {
		this.g.drawRect()
	}
}
