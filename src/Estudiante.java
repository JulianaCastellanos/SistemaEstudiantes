public class Estudiante {
    // atributos de la clase

    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;


    public Estudiante() {
    }

    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nombre = nombre;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }

    //Metodos propios

    //metodo mostrar información

    public void mostrarinfo() {

        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Nota 1: " + this.getNota1());
        System.out.println("Nota 2: " + this.getNota2());
        System.out.println("Nota 3: " + this.getNota3());

    }

    //metodo que permita asignar las notas

    public void asignarNotas(double n1, double n2, double n3) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;

    }

    //metodo sin parametros que permita calcular el promedio de las notas

    public double calcularPromedio(){

        return (nota1 + nota2 + nota3)/3;

    }

    public String estaAprobado(double notaMinima) {
        double promedio = calcularPromedio();
        if (promedio >= notaMinima) {
            return ("Estudiante aprobado");
        } else{
            return ("Estudiante reprobado");
        }

    }


}
