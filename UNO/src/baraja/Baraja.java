package baraja;
import java.util.ArrayList;

/*
 * 
 * @param <T>
 */

@SuppressWarnings("rawtypes")
public abstract class Baraja<T extends Carta> {

    //Atributos
    protected Pila<T> cartas;
    protected Pila<T> cartasMonton;
    protected int numCartas;
    protected int cartasPorPalo;

    public Baraja() {
        this.cartas = new Pila<>();
        this.cartasMonton = new Pila<>();
    }

    /**
     * Metodo abstracto crearBaraja
     */
    public abstract void crearBaraja();

    /**
     * Baraja todas las cartas
     */
    public void barajar() {

        int posAleatoria = 0;
        T carta;

        while (!this.cartasMonton.isEmpty()) {
            this.cartas.push(this.cartasMonton.pop());
        }

        ArrayList<T> cartasBarajar = new ArrayList<>();

        while (!this.cartas.isEmpty()) {
            cartasBarajar.add(this.cartas.pop());
        }

        for (int i = 0; i < cartasBarajar.size(); i++) {

            do {
                posAleatoria = (int) (Math.random()* (cartasBarajar.size() - 1)+1);
                carta = cartasBarajar.get(posAleatoria);
            } while (carta == null);

            this.cartas.push(carta);
            cartasBarajar.set(posAleatoria, null);

        }

    }

    /**
     * Devuelve la siguiente carta
     *
     * @param monton
     * @return carta del arreglo
     */
    public T siguienteCarta(boolean monton) {

        T carta = null;

        if (!this.cartas.isEmpty()) {
            carta = cartas.pop();
            if (monton) {
                this.cartasMonton.push(carta);
            }
        }

        return carta;
        

    }

    /**
     * Devuelve un numero de cartas. Controla si hay mas cartas de las que se
     * piden
     *
     * @param numCartas
     * @param monton
     * @return
     */
    public ArrayList<T> darCartas(int numCartas, boolean monton) {

        if (numCartas > numCartas || cartasDisponible() < numCartas) {
            return null;
        } else {

            ArrayList<T> cartasDar = new ArrayList<>();

            //recorro el array que acabo de crear para rellenarlo
            for (int i = 0; i < numCartas; i++) {
                cartasDar.add(siguienteCarta(monton)); //uso el metodo anterior
            }

            //Lo devuelvo
            return cartasDar;

        }

    }

    /**
     * Indica el numero de cartas que hay disponibles
     *
     * @return
     */
    public int cartasDisponible() {
        return this.cartas.size();
    }

    /**
     * Muestro las cartas que ya han salido
     */
    
    
    
    
    public void cartasMonton() {

        if (cartasDisponible() == numCartas) {
            System.out.println("No se ha sacado ninguna carta");
        } else {
            System.out.println(this.cartasMonton.toString());
        }

    }

    /**
     * Muestro las cartas que aun no han salido
     */
    public void mostrarBaraja() {

        if (cartasDisponible() == 0) {
            System.out.println("No hay cartas que mostrar");
        } else {
            System.out.println(this.cartas.toString());
        }

    }

    public void agregarCartaMonton(T carta){
        this.cartasMonton.push(carta);
    }

}