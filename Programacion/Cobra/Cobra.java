import java.util.Scanner;
import PackCobra.PackCobra;
import PackFecha.DateFunctions;

public class Cobra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //double kWh = 0.37204;
        //String continuar;
        //PackCobra.numContrato();
        //System.out.println("Introduce el nombre del cliente");
        //String nombreCliente = sc.nextLine();
        //PackCobra.potenciaContratada();
        //System.out.println("Introduce la lectura anterior del contador y su fecha (dd-mm-aaaa)");
        //double lecturaAnterior = sc.nextDouble();
        //String fechaAnterior = sc.nextLine();
        System.out.println("Introduce la lectura actual del contador y su fecha (dd-mm-aaaa)");
        double lecturaActual = sc.nextDouble();
        String fechaActual = sc.nextLine();
        boolean fechaValida = PackFecha.DateFunctions.esLogica(fechaActual);
        if(!fechaValida){
            System.out.println("La fecha no es valida");
        }
        //double lecturaActual = sc.nextDouble();
        //String fechaActual = sc.nextLine();
        
    }
}
