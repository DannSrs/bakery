/**
 * Decorador que adiciona granulado ao bolo.
 */
public class Sprinkles extends CakeDecorator {

    public Sprinkles(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return super.getCost() + 2; // Adiciona $2 ao custo
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with sprinkles"; // Adiciona no final do texto
    }
}
