public class GenerosMusicales {
    private String nombCantante;

    public GenerosMusicales(String nombCantante) {
        this.nombCantante = nombCantante;
    }

    public void mostrarInfo(){
        System.out.println("El nombre del cantantes es: "+nombCantante);
    }

    public String getNombCantante() {
        return nombCantante;
    }

    public void setNombCantante(String nombCantante) {
        this.nombCantante = nombCantante;
    }
}
