package desenho;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Desenho extends JPanel {
	private int x;
	
	public Desenho(int x){
		this.x = x;
	}
	
	public void paintComponent(Graphics g) {	
		super.paintComponent(g);
		g.drawLine(this.x, 150, 163+this.x, 150); //linha
		g.drawLine(0, 150+15, 400, 150+15); //chao
	    g.drawArc(60+this.x, 125, 100, 50, 0, 90); //capo
	    g.drawArc(13+this.x, 100, 100, 50, 0, 180); //teto
	    g.drawArc(this.x, 125, 25, 50, 180, -90); //trazeira 
	    g.drawArc(18+this.x, 135, 30, 30, 180, 180); //roda traz.
	    g.drawArc(113+this.x, 135, 30, 30, 180, 180); //roda frente.
	    
	}
}
