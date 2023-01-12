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
        Scanner sc = new Scanner(System.in);
        boolean correcto;
        double kW;
        do{
        correcto = false;
        System.out.println("Introduce los kW consumidos");
        kW = sc.nextDouble();
        if(kW >= 0){
            correcto = true;
        }else{
            System.out.println("Los kW no son correctos");
        }
        }while(!correcto);
        sc.close();
        return kW;
    }

    /*public static String calculaImporte(double kW, String fecha){ //no esta bien creo
        double importe = 0;
        String kWs = String.valueOf(kW);
        do {
            switch(kWs){
                case "2.30":
                    importe = kW * 7.29;
                    break;
                case "3.45":
                    importe = kW * 10.94;
                    break;
                case "4.60":
                    importe = kW * 14.58;
                    break;
                case "5.75":
                    importe = kW * 18.23;
                    break;
                case "6.90":
                    importe = kW * 21.87;
                    break;
                case "8.05":
                    importe = kW * 25.52;
                    break;
                default:
                    System.out.println("La potencia no es correcta");
                    break;
            }
        } while (kW != 2.30 || kW != 3.45 || kW != 4.60 || kW != 5.75 || kW != 6.90 || kW != 8.05);
        return String.valueOf(importe) + "€";
    }*/

    public static String calculaImporte(double kW, String fechaLecturaAnterior, String fechaLecturaActual, double potenciaContratada){
        int diaLecturaAnterior = Integer.parseInt(fechaLecturaAnterior.substring(0, 2));
        int mesLecturaAnterior = Integer.parseInt(fechaLecturaAnterior.substring(3, 5));
        int yearLecturaAnterior = Integer.parseInt(fechaLecturaAnterior.substring(6));
        int diaLecturaActual = Integer.parseInt(fechaLecturaActual.substring(0, 2));
        int mesLecturaActual = Integer.parseInt(fechaLecturaActual.substring(3, 5));
        int yearLecturaactual = Integer.parseInt(fechaLecturaActual.substring(6));
        double importe;
        double preciokWHora = 0.37204;
        double preciokWDia = preciokWHora  * 24;
        double preciokWSemana = preciokWDia * 7;
        String potenciaContratadaStr = String.valueOf(potenciaContratada);
        do {
            switch(potenciaContratadaStr){
                case "2.30":
                    importe = kW * 7.29;
                    break;
                case "3.45":
                    importe = kW * 10.94;
                    break;
                case "4.60":
                    importe = kW * 14.58;
                    break;
                case "5.75":
                    importe = kW * 18.23;
                    break;
                case "6.90":
                    importe = kW * 21.87;
                    break;
                case "8.05":
                    importe = kW * 25.52;
                    break;
                default:
                    System.out.println("La potencia no es correcta, introducela de nuevo");
                    break;
            }
        } while (kW != 2.30 || kW != 3.45 || kW != 4.60 || kW != 5.75 || kW != 6.90 || kW != 8.05);
    }
}