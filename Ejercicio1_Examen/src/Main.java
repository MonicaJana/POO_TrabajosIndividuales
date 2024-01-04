// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Opera op1=new Opera("Angelica","violin","90's");
        Opera op2=new Opera("Hayley","guitarra","80's");

        Opera[] arrayDeObjetos = new Opera[2];

        arrayDeObjetos[0]= op1;
        arrayDeObjetos[1]= op2;

        for (int i=0;i<2;i++){
            System.out.println(arrayDeObjetos[i]);
        }
    }
}