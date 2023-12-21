public class Empleado {
    private String nombre;
    private double salarioBase;
    private int hTrabajadasPorDia;

    public Empleado(String nombre, double salarioBase, int hTrabajadasPorDia) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.hTrabajadasPorDia = hTrabajadasPorDia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int gethTrabajadasPorDia() {
        return hTrabajadasPorDia;
    }

    public void sethTrabajadasPorDia(int hTrabajadasPorDia) {
        this.hTrabajadasPorDia = hTrabajadasPorDia;
    }

    public double calcularSalario(){
        return salarioBase;
    }
}
