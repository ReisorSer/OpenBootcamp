public class Coche{

    String coche = "Coche";
    int puertas = 4;

    public void anadirPuerta(){
        puertas += 1;
    }

    public static void main(String[] args){
        Coche coche1 = new Coche();

        System.out.println(coche1.puertas);

        coche1.anadirPuerta();

        System.out.println(coche1.puertas);
    }
}