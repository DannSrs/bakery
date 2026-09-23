/**
 * Classe base para os decoradores de bolo.
 * Ela herda de Cake e repassa os métodos getCost() e getDescription() 
 * para o bolo que está sendo decorado.
 */
public abstract class CakeDecorator extends Cake {
    protected Cake cake; // O bolo que está sendo decorado

    // Construtor que recebe o bolo base
    public CakeDecorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public int getCost() {
        return cake.getCost(); // Repassa a chamada do preço para o bolo interno
    }

    @Override
    public String getDescription() {
        return cake.getDescription(); // Repassa a chamada da descrição para o bolo interno
    }
}
