package Lucas;

public class Main {
    public static void main(String[] args) {
        Desarrolador empleado1 = new Desarrolador(20, "Luis", "Java", 10);
        System.out.println("Luis tiene un salario de: " + empleado1.calcularSalario());
        Desarrolador empleado2 = new Desarrolador(18, "Asyra", "C", 15);
        System.out.println("Asyra tiene un salario de: " + empleado2.calcularSalario());

        Diseñador diseñador1 = new Diseñador(19, "Lucas", "Python", 5);
        System.out.println("Lucas tiene un salario de: " + diseñador1.calcularSalario());
    }
}
