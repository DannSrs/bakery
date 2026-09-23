/**
 * Classe base para o bolo de morango.
 */
public class StrawberryCake extends Cake {
    
    @Override
    public int getCost() {
        return super.getCost() * 2; // Retorna o dobro do custo base padrão (10 * 2 = 20)
    }

    @Override
    public String getDescription() {
        return "Strawberry cake";
    }
}
