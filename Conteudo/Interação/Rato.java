import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Classe de exemplo de eventos de mouse.
 * @author Rodrigo Chaves
 *
 */
public class Rato extends MouseAdapter {
	
	public void mouseClicked(MouseEvent e){
		int x = e.getX(),
			y = e.getY(),
		System.out.println("clique("+x+","+y+")");
	}
	
}
