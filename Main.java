import java.util.Scanner;

class Persona{

    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String _nombre){
        nombre = _nombre;
    }
    public String getNombre(){
        return nombre;
    }

    public void setEdad(int _edad){
        edad = _edad;
    }
    public int getEdad(){
        return edad;
    }

    public void setTelefono(int _telefono){
        telefono = _telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}

class Cliente extends Persona{

    private float credito;

    public void setCredito(float _credito) {
        credito = _credito;
    }
    public float getCredito() {
        return credito;
    }
}

class Trabajador extends Persona{

    private float salario;

    public void setSalario(float _salario) {
        salario = _salario;
    }
    public float getSalario() {
        return salario;
    }
}


public class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        //Creamos un cliente, introducimos los datos y los imprimimos por pantalla

        Cliente cliente1 = new Cliente();

        System.out.print("Introduce el nombre del cliente: ");
        cliente1.setNombre(scan.nextLine());
        System.out.print("Introduce la edad de " + cliente1.getNombre() + ": ");
        cliente1.setEdad(scan.nextInt());
        System.out.print("Introduce el telefono de " + cliente1.getNombre() + ": ");
        cliente1.setTelefono(scan.nextInt());
        System.out.print("Introduce el credito de " + cliente1.getNombre() + ": ");
        cliente1.setCredito(scan.nextFloat());

        System.out.println("\nLos datos del cliente introducido son:");
        System.out.println("Nombre: " + cliente1.getNombre());
        System.out.println("Edad: " + cliente1.getEdad() + " años");
        System.out.println("Telefono: " + cliente1.getTelefono());
        System.out.println("Credito: " + cliente1.getCredito() + "€");

        //Introducimos espacios ara separar la entrada y la imprimicion de datos de los 2 objetos,
        // y añadimos un scan.nextLine para limpiar buffer del objeto Scanner.

        System.out.println("\n\n\n");
        scan.nextLine();


        //Creamos un Trabajador, introducimos los datos y los imprimimos por pantalla

        Trabajador trabajador1 = new Trabajador();

        System.out.print("Introduce el nombre del trabajador: ");
        trabajador1.setNombre(scan.nextLine());
        System.out.print("Introduce la edad de "+ trabajador1.getNombre() + ": ");
        trabajador1.setEdad(scan.nextInt());
        System.out.print("Introduce el telefono de " + trabajador1.getNombre() + ": ");
        trabajador1.setTelefono(scan.nextInt());
        System.out.print("Introduce el salario de " + trabajador1.getNombre() + ": ");
        trabajador1.setSalario(scan.nextFloat());

        System.out.println("\nLod datos del trabajador introducido son:");
        System.out.println("Nombre: " + trabajador1.getNombre());
        System.out.println("Edad: " + trabajador1.getEdad() + " años");
        System.out.println("Telefono: " + trabajador1.getTelefono());
        System.out.println("Salario: " + trabajador1.getSalario() + "€");






    }

}
