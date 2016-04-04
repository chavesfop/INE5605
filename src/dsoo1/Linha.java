package dsoo1;

import dsoo1.interfaces.Deslocavel;

public class Linha implements Deslocavel {
	private Ponto p1;
	private Ponto p2;
	
	public Linha(Ponto p1, Ponto p2){
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public void deslocarX(float val) {
		this.p1.deslocarX(val);
		this.p2.deslocarX(val);
		
	}

	@Override
	public void deslocarY(float val) {
		this.p1.deslocarY(val);
		this.p2.deslocarY(val);
		
	}

	@Override
	public void deslocarZ(float val) {
		this.p1.deslocarZ(val);
		this.p2.deslocarZ(val);
		
	}

	@Override
	public void deslocarXY(float x, float y) {
		this.p1.deslocarXY(x,y);
		this.p2.deslocarXY(x,y);
		
	}

	@Override
	public void deslocarYZ(float y, float z) {
		this.p1.deslocarYZ(y,z);
		this.p2.deslocarYZ(y,z);
		
		
	}
}
