public class MainArray {
    public static void main(String[] args) {

        GestorCalificaciones g = new GestorCalificaciones(10);

        g.agregar(3.5);
        g.agregar(4.2);
        g.agregar(2.8);
        g.agregar(5.0);
        g.agregar(3.0);
        g.agregar(3.5);
        g.agregar(4.2);
        g.agregar(2.8);
        g.agregar(5.0);
        g.agregar(3.0);

        g.mostrar();

        System.out.println("======================================");
        System.out.println("  TECHSTORE YOPAL - INFORME DE NOTAS  ");
        System.out.println("======================================");


        
        System.out.println("Promedio: " + g.promedio());
        System.out.println("Mayor: " + g.mayor());
        System.out.println("Menor: " + g.menor());
        System.out.println("Aprobados: " + g.contarAprobados(3.0));

        g.ordenarBurbuja();
        System.out.println("Ordenado:");
        g.mostrar();
    }
}