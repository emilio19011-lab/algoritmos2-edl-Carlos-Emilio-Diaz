public class GestorCalificaciones {

    private double[] calificaciones;
    private int total;

    public GestorCalificaciones(int capacidad) {
        calificaciones = new double[capacidad];
        total = 0;
    }

    public boolean agregar(double nota) {
        if (total >= calificaciones.length) return false;
        calificaciones[total++] = nota;
        return true;
    }

    public double promedio() {
        double suma = 0;
        for (int i = 0; i < total; i++) {
            suma += calificaciones[i];
        }
        return total == 0 ? 0 : suma / total;
    }

    public double mayor() {
        double max = calificaciones[0];
        for (int i = 1; i < total; i++) {
            if (calificaciones[i] > max) max = calificaciones[i];
        }
        return max;
    }

    public double menor() {
        double min = calificaciones[0];
        for (int i = 1; i < total; i++) {
            if (calificaciones[i] < min) min = calificaciones[i];
        }
        return min;
    }
    public int buscarNota(double nota) {
        for (int i = 0; i < total; i++) {
            if (calificaciones[i] == nota) return i;
        }
        return -1;
    }
    public void ordenarBurbuja() {
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - i - 1; j++) {
                if (calificaciones[j] > calificaciones[j + 1]) {
                    double temp = calificaciones[j];
                    calificaciones[j] = calificaciones[j + 1];
                    calificaciones[j + 1] = temp;
                }
            }
        }
    }
    public int contarAprobados(double min) {
        int cont = 0;
        for (int i = 0; i < total; i++) {
            if (calificaciones[i] >= min) cont++;
        }
        return cont;
    }
    public void mostrar() {
        for (int i = 0; i < total; i++) {
            System.out.print(calificaciones[i] + " ");
        }
        System.out.println();
    }
}