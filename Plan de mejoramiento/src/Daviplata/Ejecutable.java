package Daviplata;

import java.util.Scanner;

public class Ejecutable {
    
    public static void main(String[] args) {


        Scanner lectura = new Scanner(System.in);


        int volver;
        
        Bolsillo bolsillito = new Bolsillo();

        do {
        
        bolsillito.loguearse();

        System.out.println("¿Quiere volver al menú principal? \n1. Si \n2. No \nRecuerde que si desea volver al menú principal tiene que volver a ingresar sus datos por medida de seguridad de nuestra compañia");
        volver = lectura.nextInt();    
            
        } while (volver == 1);
    
        System.out.println("Hasta luego, Daviplata le desea buena tarde!!");
    
        lectura.close();
    }

 
}
