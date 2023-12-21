import java.util.Scanner;
public class Desarrollador extends Empleado{
    private int horasExtras;

    public Desarrollador(String nombre, double salarioBase, int hTrabajadasPorDia, int horasExtras) {
        super(nombre, salarioBase, hTrabajadasPorDia);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario(){
        Scanner leer=new Scanner(System.in);
        System.out.println("\nIngrese los dias hábiles trabajados por el desarrolador: ");
        int dias= leer.nextInt();
        double dineroPorHoras= super.getSalarioBase()/(super.gethTrabajadasPorDia()*dias);
        double dineroHExtras=dineroPorHoras*1.5;
        return super.getSalarioBase()+(dineroHExtras*horasExtras);
    }

}
