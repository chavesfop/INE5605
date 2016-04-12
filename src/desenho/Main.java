package desenho;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	static JPanel tela;
	public static int x;
	  public static void main(String[] dsfs) throws InterruptedException {
		
	    JFrame f;
	    f = new JFrame();
	    tela = new Desenho(0);
	    
	 

	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    f.setContentPane(tela);
	    f.setSize(400,300);
	    
	    KeyListener l = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				
				switch(keycode){
				case KeyEvent.VK_LEFT:
					x--;
					break;
				case KeyEvent.VK_RIGHT:
					x++;
					break;
				}
				
				
			}
		};
		
	    f.addKeyListener(l);
	    f.setVisible(true);
	    int y = 0;
	    while(1 == 1){
	    	y++;
	    	if (y > 400){
	    		y = 0;
	    	}
	    	tela = new Desenho(y);
	    	f.setContentPane(tela);
	    	f.revalidate();
	    	int sleepTime = 10;
	    	sleepTime -= x*5;
	    	if (sleepTime < 10){
	    		sleepTime = 10;
	    	}
	    	Thread.sleep(sleepTime);
	    }
	    
	  }
}
