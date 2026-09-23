/**
 * Decorador que adiciona uma mensagem personalizada ao bolo.
 */
public class Saying extends CakeDecorator {
    private String saying; // Guarda a frase escolhida

    // Note que aqui recebemos a mensagem além do bolo!
    public Saying(Cake cake, String saying) {
        super(cake);
        this.saying = saying;
    }

    @Override
    public String getDescription() {
        // Usamos as barras (\") para conseguir imprimir as aspas duplas de fato no console
        return super.getDescription() + " with saying \"" + this.saying + "\"";
    }
}
