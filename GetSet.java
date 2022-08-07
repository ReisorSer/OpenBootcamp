import java.util.Scanner;

public class GetSet {
	
	public static class Persona{
	    
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
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Persona persona1 = new Persona();
		
		System.out.print("Introduce el nombre: ");
		persona1.setNombre(scan.nextLine());
		
		System.out.print("Introduce la edad de " + persona1.getNombre() + ": ");
		persona1.setEdad(scan.nextInt());
		
		System.out.print("Introduce el telefono de " + persona1.getNombre() + ": ");
		persona1.setTelefono(scan.nextInt());
		
		System.out.println("\n\nLos datos introducidos del usuario son:");
		System.out.println("Nombre: " + persona1.getNombre());
		System.out.println("Edad: " + persona1.getEdad() + " años");
		System.out.println("Telefono: " + persona1.getTelefono());
		
	}
}