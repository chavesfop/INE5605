package dsoo1;
import dsoo1.interfaces.Deslocavel;

public class Ponto implements Deslocavel  {
	
	private float x;
	private float y;
	private float z;
	
	public Ponto(float x, float y, float z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Ponto(float x, float y){
		this.x = x;
		this.y = y;
		this.z = 0;
	}
	
	public float normaX(Ponto p2){
		return Math.abs(p2.x - this.x);
	}
	
	public float normaY(Ponto p2){
		return Math.abs(p2.y - this.y);
	}
	
	public float normaZ(Ponto p2){
		return Math.abs(p2.z - this.z);
	}
	
	public void deslocarX(float val){
		this.x += val;
	}
	
	public void deslocarY(float val){
		this.y += val;
	}
	
	public void deslocarZ(float val){
		this.z += val;
	}
	
	public void distanciaAte(Ponto p2){
		Math.pow((Math.pow(this.normaX(p2),2)+Math.pow(this.normaY(p2),2)+Math.pow(this.normaZ(p2),2)), 0.5);
	}
}
