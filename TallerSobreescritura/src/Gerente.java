public class Gerente extends Empleado{
    private double bono;

    public Gerente(String nombre, double salarioBase, int hTrabajadasPorDia, double bono) {
        super(nombre, salarioBase, hTrabajadasPorDia);
        this.bono = bono;
    }

    @Override
    public double calcularSalario(){
        return super.getSalarioBase()+bono;
    }
}
