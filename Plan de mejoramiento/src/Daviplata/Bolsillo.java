package Daviplata;

import java.util.Scanner;

public class Bolsillo {
    
    Scanner lectura = new Scanner(System.in);


    //Atributos

   
    private int contraseña, cedula;
    private long numTelefonico;

    //Método constructor vacio

    public  Bolsillo(){
    }

    //Método constructor con parametros

    public Bolsillo(int cedula, int contraseña, int numTelefonico){
        this.cedula = cedula;
        this.contraseña = contraseña;
        this.numTelefonico = numTelefonico;
    }


    //Getters and Setters

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public long getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(int numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    
    

    //Métodos

    int saldo = 0;
    int monto = 0;

    public void loguearse(){


    System.out.println("Bienvenido a tu bolsillo Daviplata, ingresa tus datos");
    
    System.out.println("--------------");
    
    System.out.println("Ingrese su cédula: ");
    cedula = lectura.nextInt();
    
    System.out.println("Ingrese su contraseña: ");
    contraseña = lectura.nextInt();

   

    if (cedula == 1033679469 && contraseña == 1234) {
        
  

    System.out.println("Bienvenido a su bolsillo Daviplata, cual de las siguientes opciones desea escoger: \n1. Insertar dinero. \n2. Retirar dinero \n3. Consultar saldo \n4. Recargas \n------------ \nRecuerde que tiene que escoger un numero");
    int menu = lectura.nextInt();

    System.out.println("--------------");

    switch (menu) {
        case 1:
        insertarDinero();        

            break;

        case 2: 
        retirarDinero();
            break;

        case 3: 
        consultarSaldo();
            break;

        case 4: 
        recargas();
            break;
    
        default:
        System.out.println("Inserto una opcion erronea");
            break;
    }

}

}


    public void insertarDinero(){

        System.out.println("¿Cuanto dinero desea ingresar?");
        int monto = lectura.nextInt();

        saldo+=monto;

        System.out.println("Su nuevo saldo es: "+saldo);

    }

    public void retirarDinero(){

        System.out.println("El dinero con el cual cuenta es el siguiente: "+saldo);
       
       
       
        System.out.println("¿Cuanto dinero desea retirar el dia de hoy?");
        int retiro = lectura.nextInt();

        if (retiro > saldo) {
            
            System.out.println("Esta queriendo retirar más de lo que tiene");
            

        } else{

            saldo = saldo - retiro;
            System.out.println("El saldo restante es: "+saldo);

        }

    }

    public void consultarSaldo(){

        System.out.println("Su saldo es: "+saldo);

    }

    public void recargas(){

        System.out.println("Bienvenido al apartado de recargas para celular, ingrese el numero de celular al cual le quiere hacer la recarga :D");
        numTelefonico = lectura.nextLong();

        System.out.println("Su saldo actual es: "+saldo);

        System.out.println("Valor de la recarga: ");
        int recarga = lectura.nextInt();

        if (recarga > saldo) {
            System.out.println("Saldo insuficiente");
        } else{

            saldo = saldo - recarga;

        System.out.println("¡RECARGA EXITOSA! \nEl valor de la recarga fue de "+recarga+"\nNúmero de telefono: "+numTelefonico+"\nSu saldo restante es de: "+saldo);
        }

    }

    



}
