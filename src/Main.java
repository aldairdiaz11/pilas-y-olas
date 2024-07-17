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
    }
}