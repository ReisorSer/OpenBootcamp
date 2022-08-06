import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int numeroIf;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        String estacion;

        System.out.println("\t\t##### EJERCICIOS TEMA 4 #####\n\n");


        //Ejercicio condicional if

        System.out.println("\t\t-- EJERCICIO CONDICIONAL IF --\n");

        System.out.print("Introduce un número entero para ejecutar el condicional if: ");
        numeroIf = scan.nextInt();


        if(numeroIf > 0){
            System.out.println("El número introducido es POSITIVO.");
        }
        else if(numeroIf < 0){
            System.out.println("El número introducido es NEGATIVO.");
        }
        else{
            System.out.println("El número introducido es 0.");
        }

        System.out.println("\n\n");


        //Ejercicio bucle while

        System.out.println("\t\t  -- EJERCICIO BUCLE WHILE --\n");

        while(numeroWhile < 3){
            System.out.println("El valor de la variable numeroWhile es: " + numeroWhile);
            numeroWhile++;
        }

        System.out.println("\n\n");


        //Ejercicio bucle do while

        System.out.println("\t\t -- EJERCICIO BUCLE DO WHILE --\n");

        do{
            System.out.println("El valor de la variable numeroDoWhile es: " + numeroDoWhile);
            numeroDoWhile++;
        }while(numeroDoWhile < 1);

        System.out.println("\n\n");


        //Ejercicio bucle for

        System.out.println("\t\t    -- EJERCICIO BUCLE FOR --\n");

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("El valor de la variable numeroFor es: " + numeroFor);
        }

        System.out.println("\n\n");


        //Ejercicio condicional switch

        System.out.println("\t\t-- EJERCICIO CONDICIONAL SWITCH --\n");

        System.out.print("Introduce una estacion del año: ");
        estacion = scan.next();

        switch(estacion.toLowerCase()){
            case "primavera":
                System.out.println("Es Primavera.");
                break;

            case "verano":
                System.out.println("Es Verano.");
                break;

            case "otoño":
                System.out.println("Es otoño.");
                break;

            case "invierno":
                System.out.println("Es Invierno.");
                break;

            default:
                System.out.println("El valor de introducido no es una estacion del año.");
        }

    }

}