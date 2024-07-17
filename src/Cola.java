public class Cola {

    public ListaLigada cola;
    public int tam; // size
    static final int TAM_MAX = 100;
    public int tamMax;

    public Cola() {
        this(TAM_MAX);
    }

    public Cola(int tamMax) {
        this.cola = new ListaLigada();
        this.tam = 0;  // elementos en la cola
        this.tamMax = tamMax;  // si se especifica tamaño máximo
    }

    public void encolar(String dato) {
        if (tieneEspacio()) {
            this.cola.agregarACola(dato);
            this.tam++;
            System.out.println("Se agrego " + dato + " a la cola, tam=" + this.tam);
        } else {
            throw new Error("La cola esta llena");
        }
    }

    public void desencolar() {
        if(!this.estaVacia()) {
            this.tam --;
            System.out.println("Se eliminó " + this.mostrarCabeza() + " , tam=" + this.tam);
        } else {
            throw new Error("La cola esta vacia");
        }
    }

    public String mostrarCabeza() {
        return this.cola.cabeza.dato;
    }

    public boolean estaVacia() {
        return this.tam == 0;
    }

    public boolean tieneEspacio() {
        return this.tam < this.tamMax;
    }
}
