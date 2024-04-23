package Lucas;

public class Diseñador extends Empleado {
    private String SoftwareDeDiseño;
    private int Proyectos;
    public Diseñador(int edad, String nombre, String SoftwareDeDiseño, int Proyectos) {
        super(edad, nombre);
        this.SoftwareDeDiseño = SoftwareDeDiseño;
        this.Proyectos = Proyectos;
    }
    public int calcularSalario() {
        int salarioBase =  1000;
        int bonificacion = Proyectos * 100;
        return salarioBase + bonificacion;
    }

}
