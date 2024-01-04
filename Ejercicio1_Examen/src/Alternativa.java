public class Alternativa extends GenerosMusicales{

    public String pais;

    public Alternativa(String nombCantante, String pais) {
        super(nombCantante);
        this.pais = pais;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Pais: "+pais);
    }
}
