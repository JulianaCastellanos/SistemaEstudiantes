
public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Sofia", 3.5, 3.9, 4.5);
        e1.mostrarinfo();
        System.out.println("El promedio es: " + e1.calcularPromedio());
        System.out.println(e1.estaAprobado(3.0));

        System.out.println("");

        Estudiante e2 = new Estudiante("Laura");
        e2.asignarNotas(3.1, 2.5, 1.4);
        e2.mostrarinfo();
        System.out.println("El promedio es: " + e2.calcularPromedio());
        System.out.println(e2.estaAprobado(3.0));


    }
}