public class Opera extends Clasica{

    public String generacion;

    public Opera(String nombCantante, String intrumP, String generacion) {
        super(nombCantante, intrumP);
        this.generacion = generacion;
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Generacion: "+generacion);
    }
}
