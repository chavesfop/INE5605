package Conteudo;

/**
 * Classe de representação de uma linha reta no plano cartesiano xy,
 * onde o ponto inicial é p1 e o ponto final é p2.
 */
public class Linha implements Deslocavel {
    /*
     * abaixo exemplo de reutilização da classe Ponto, nesta classe.
     */
    private Ponto p1;
    private Ponto p2;

    /**
     * Construtor
     *
     * @param p1 Ponto 1 como parametro
     * @param p2 Ponto 2 como parametro
     */
    public Linha(Ponto p1, Ponto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    /**
     * Reutilização dos objetos pontos para reaproveitamento de código.
     */
    public String toString() {
        return p1 + " até " + p2 + ", tamanho: " + this.p1.distanciaAte(p2);
    }

    /**
     * Abaixo implementação da interface
     */
    public void deslocarX(float val) {
        this.p1.deslocarX(val);
        this.p2.deslocarX(val);

    }

    public void deslocarY(float val) {
        this.p1.deslocarY(val);
        this.p2.deslocarY(val);

    }
}
