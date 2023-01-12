package PackCobra;

import java.util.Scanner;

public class PackCobra {
    public static String numContrato(){
        Scanner sc = new Scanner(System.in);
        boolean correcto;
        String nContrato;
        do{
        correcto = false;
        System.out.println("Introduce el numero de contrato");
        nContrato = sc.nextLine();
        if(nContrato.matches("\\d{3}[-]\\d{4}")){
            correcto = true;
        }else{
            System.out.println("El numero de contrato no es correcto");
        }
        }while(!correcto);
        sc.close();
        return nContrato;
    }

    public static double potenciaContratada(){
        Scanner sc = new Scanner(System.in);
        boolean correcto;
        double potencia;
        do{
        correcto = false;
        System.out.println("Introduce la potencia contratada");
        potencia = sc.nextDouble();
        if(potencia == 2.30 || potencia == 3.45 || potencia == 4.60 || potencia == 5.75 || potencia == 6.90 || potencia == 8.05){
            correcto = true;
        }else{
            System.out.println("La potencia no es correcta");
        }
        }while(!correcto);
        sc.close();
        return potencia;
    }

    public static double kWConsumidos(){
        Scanner sc = new Scanner(System.in)
    }
}