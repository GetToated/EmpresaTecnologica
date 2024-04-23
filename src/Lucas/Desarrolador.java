package Lucas;

public class Desarrolador extends Empleado{
    private String LenguajeDeProgra;
    private int experiencia;
    public Desarrolador (int edad, String nombre, String LenguajeDeProgra, int experiencia) {
        super(edad, nombre);
        this.LenguajeDeProgra = LenguajeDeProgra;
        this.experiencia = experiencia;

    }
    public int calcularSalario() {
        int salarioBase = 1000;
        int bono = experiencia * 100;
        return salarioBase + bono;
    }
}
