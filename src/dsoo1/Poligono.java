package dsoo1;

import dsoo1.interfaces.Deslocavel;


/*
 * Em java tudo é objeto.
 * length é uma propriedade de um objeto Array.
 * 
 */
public class Poligono implements Deslocavel{
	private Linha[] linhas;
	
	/**
	 * Construtor de classe	
	 */
	public Poligono(Linha[] val_linhas){
		//linhas é array
		this.linhas = val_linhas;
	}

	@Override
	public void deslocarX(float val) {
		for(int x = 0; x < this.linhas.length; x++){
			//linhas[x] é um objeto, que esta no array linhas.
			this.linhas[x].deslocarX(val);
		}
	}

	@Override
	public void deslocarY(float val) {
		for(int x = 0; x < this.linhas.length; x++){
			//linhas[x] é um objeto, que esta no array linhas.
			this.linhas[x].deslocarY(val);
		}
	}

	@Override
	public void deslocarZ(float val) {
		for(int x = 0; x < this.linhas.length; x++){
			//linhas[x] é um objeto, que esta no array linhas.
			this.linhas[x].deslocarZ(val);
		}
	}

	@Override
	public void deslocarXY(float x, float y) {
		this.deslocarX(x);
		this.deslocarY(y);
	}

	@Override
	public void deslocarYZ(float y, float z) {
		this.deslocarY(y);
		this.deslocarZ(z);
		
	}
	
}
