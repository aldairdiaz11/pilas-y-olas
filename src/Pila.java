public class Pila {

    public ListaLigada pila;
    public int tam; // tamaño
    static final int TAM_MAX = 100;
    public int tamMax;

    public Pila() {
        this(TAM_MAX);
    }

    public Pila(int tamMax) {
        this.pila = new ListaLigada();
        this.tam = 0;  // elementos en la pila
        this.tamMax = tamMax;  // tamaño máximo especificado
    }

    public void apilar(String dato) {
        if (this.tieneEspacio()) {
            this.pila.agregarACabeza(dato);
            this.tam++;
            System.out.println("Se agregó " + dato + " a la pila, tam=" + this.tam);
        } else {
            throw new Error("La pila está llena");
        }
    }

    public void desapilar() {
        if (!estaVacia()) {
            String datoEliminado = this.pila.quitarCabeza();
            this.tam--;
            System.out.println("Se eliminó " + datoEliminado + " de la pila, tam=" + this.tam);
        } else {
            throw new Error("La pila está vacía");
        }
    }

    public String mostrarTope() {
        return this.pila.cabeza.dato;
    }

    public boolean estaVacia() {
        return this.tam == 0;
    }

    public boolean tieneEspacio() {
        return this.tam < this.tamMax;
    }
}
