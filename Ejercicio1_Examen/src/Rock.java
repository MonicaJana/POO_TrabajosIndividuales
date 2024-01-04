public class Rock extends Alternativa{
    public int integrantes;

    public Rock(String nombCantante, String pais, int integrantes) {
        super(nombCantante, pais);
        try {
            this.integrantes = integrantes;
        }catch (Exception e){
            System.out.println("Debe ingresar un número");
        }
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Integrantes: "+integrantes);
    }
}
