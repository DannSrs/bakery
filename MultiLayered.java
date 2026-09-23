/**
 * Decorador que adiciona várias camadas ao bolo.
 */
public class MultiLayered extends CakeDecorator {
    
    public MultiLayered(Cake cake) {
        super(cake);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5; // Adiciona $5 ao custo do bolo que foi embrulhado
    }

    @Override
    public String getDescription() {
        return "Multi-layered " + super.getDescription(); // Coloca o texto antes do nome
    }
}
