/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Cria a ordem
        Order order = new Order();

        // 1. Bolo de chocolate puro
        order.addCake(new ChocolateCake());

        // 2. Bolo de baunilha com o dizer "PLAIN!"
        order.addCake(new Saying(new VanillaCake(), "PLAIN!"));

        // 3. Bolo de baunilha com granulado e dizendo "FANCY!"
        order.addCake(new Saying(new Sprinkles(new VanillaCake()), "FANCY!"));

        // 4. Bolo complexo de morango!
        // Podemos fazer instanciando passo a passo numa variável para ficar mais claro:
        Cake complexCake = new StrawberryCake();
        complexCake = new MultiLayered(complexCake);
        complexCake = new Sprinkles(complexCake); // 1º granulado
        complexCake = new Sprinkles(complexCake); // 2º granulado
        complexCake = new Saying(complexCake, "One of");
        complexCake = new Saying(complexCake, "EVERYTHING");

        order.addCake(complexCake);

        // Imprime a ordem na tela
        order.printOrder();
    }
}
