//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Pruebas con colas
        Cola nuevaCola = new Cola(5);
        nuevaCola.encolar("Juan");
        nuevaCola.encolar("Maria");
        nuevaCola.encolar("Ana");
        nuevaCola.encolar("Jose");

        nuevaCola.desencolar();

        // Prueba con pilas
        Pila pilaDePizzas = new Pila(5);  // pila de pizzas en una pizzeria
        pilaDePizzas.apilar("Pizza #1");
        pilaDePizzas.apilar("Pizza #2");
        pilaDePizzas.apilar("Pizza #3");
        pilaDePizzas.apilar("Pizza #4");
        pilaDePizzas.apilar("Pizza #5");
        // pilaDePizzas.apilar("Pizza #6"); lanza error por no tener mas espacio
        System.out.println("La primera pizza a repartir es: " + pilaDePizzas.mostrarTope());

        pilaDePizzas.desapilar();
        pilaDePizzas.desapilar();
        pilaDePizzas.desapilar();
        pilaDePizzas.desapilar();
        pilaDePizzas.desapilar();

    }
}