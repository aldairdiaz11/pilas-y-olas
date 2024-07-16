public class ListaLigada {

    public Nodo cabeza;

    public ListaLigada() {
        this.cabeza = null;
    }

    public void agregarACabeza(String dato) {
        Nodo nuevaCabeza = new Nodo(dato);
        Nodo cabezaActual = this.cabeza;
        this.cabeza = nuevaCabeza;
        if (cabezaActual != null) {
            this.cabeza.setSiguiente(cabezaActual);
        }
    }

    public void agregarACola(String dato) {
        Nodo cola = this.cabeza;
        if (cola == null) {
            this.cabeza = new Nodo(dato);
        } else {
            while (cola.getSiguiente() != null) {
                cola = cola.getSiguiente();
            }
            cola.setSiguiente(cola.getSiguiente());
        }
    }

    public String quitarCabeza() {
        Nodo cabezaActual = this.cabeza;
        if (cabezaActual == null) {
            return null;
        }
        this.cabeza = cabezaActual.getSiguiente();
        return cabezaActual.dato;
    }

    public String imprimirLista() {
        Nodo nodoActual = this.cabeza;
        StringBuilder resultado = new StringBuilder();      // String resultado = ""
        while (nodoActual != null) {
            resultado.append(nodoActual.dato).append(" ");  // Originalmente resultado += nodoActual.dato + " "
            nodoActual = nodoActual.getSiguiente();         // Se cambia por recomendación del editor
        }
        return resultado.toString();
    }
}
