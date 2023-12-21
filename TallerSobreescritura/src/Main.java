import javax.sound.midi.Soundbank;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Empleado em=new Empleado("Luis",500,7);
        System.out.println("El salario base de "+em.getNombre()+" es: "+em.calcularSalario());

        Gerente ge=new Gerente("Mauricio",800.30,8,50);
        System.out.println("\nEl salario total de "+ge.getNombre()+" es: "+ge.calcularSalario());

        Desarrollador de=new Desarrollador("Freddy",1200.99,8, 9);
        System.out.println("\nEl salario total de "+de.getNombre()+" es: "+de.calcularSalario());

    }
}