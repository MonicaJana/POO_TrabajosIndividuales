public class Clasica extends GenerosMusicales{

    public String intrumP;

    public Clasica(String nombCantante, String intrumP) {
        super(nombCantante);
        this.intrumP = intrumP;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Instrumento principal: "+intrumP);
    }
}
