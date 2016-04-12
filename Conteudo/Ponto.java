package Conteudo;

/**
 * Classe de representação de um ponto em um plano cartesiano.
 */
class Ponto implements Deslocavel { //implementa a interface Deslocavel,
    //portanto todas as assinaturas devem ser implementadas.
    private float x; //representação da posição no eixo da abscissa
    private float y; //representação da posição no eixo da ordenada

    /**
     * Construtor de classe 'referencia'
     */
    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Exemplo de sobrecarga da método, neste caso o construtor.
     */
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * exemplo de sobrecarga de método com uma quantidade de parametros diferentes do Construtor denominado aqui como 'referencia'.
     */
    public Ponto(int x) {
        this.x = x;
        this.y = 0;
    }

    public String toString() {
        return "(" + this.x + "," + this.y + ")"; //(0,0)
    }

    /**
     * @return distancia no eixo das abscissas deste ponto a um ponto p2
     */
    private float normaX(Ponto p2) {
        return Math.abs(p2.x - this.x);
    }

    /**
     * @return distancia no eixo das ordenadas deste ponto a um ponto p2
     */
    private float normaY(Ponto p2) {
        return Math.abs(p2.y - this.y);
    }

    /**
     * incrementa em val o valor de x neste ponto
     */
    public void deslocarX(float val) {
        this.x += val;
    }

    /**
     * incrementa em val o valor de y neste ponto
     */
    public void deslocarY(float val) {
        this.y += val;
    }

    /**
     * Reutilização dos metodos normaX e normaY, para aplicação em um triangulo e em seguida aplicação de
     * pitagoras para descobrir a hipotenusa do triangulo retangulo com medidas dos catetos normaY e normaX.
     * Sendo um numero elevado a 1/2, isto equivale ser uma raiz quadrada, portanto Math.pow(numero, 0.5), equivale a raiz.
     *
     * @return distancia deste ponto até p2.
     */
    double distanciaAte(Ponto p2) {
        return Math.pow((Math.pow(this.normaX(p2), 2) + Math.pow(this.normaY(p2), 2)), 0.5);
    }
}