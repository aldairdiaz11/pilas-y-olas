public class Nodo {
    public String dato;
    public Nodo siguiente;
    public Nodo previo;

    public Nodo(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public void setSiguiente(Nodo nodo) {
        this.siguiente = nodo;
    }

    public void setPrevio(Nodo nodo) {
        this.previo = nodo;
    }

    public Nodo getSiguiente() {
        return this.siguiente;
    }

    public Nodo getPrevio() {
        return this.previo;
    }
}
