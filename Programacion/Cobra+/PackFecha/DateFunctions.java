package PackFecha;

public class DateFunctions {
    public static boolean esBisiesto(String fecha) {
        int year = Integer.parseInt(fecha.substring(6));
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esLogica(String fecha) {
        boolean bisiesto = esBisiesto(fecha);
        boolean formatoOk = formatoOk(fecha);
        if (!formatoOk) {
            return false;
        }
        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));
        int year = Integer.parseInt(fecha.substring(6));
        if (year < 0) {
            System.out.println("El año no puede ser negativo");
            return false;
        } else if (mes < 1 || mes > 12) {
            return false;
        } else if (dia < 1 || dia > 31) {
            return false;
        } else if (mes == 2 && dia > 28 && !bisiesto) {
            return false;
        } else if (mes == 2 && dia > 29 && bisiesto) {
            return false;
        } else if (mes == 4 && dia > 30) {
            return false;
        } else if (mes == 6 && dia > 30) {
            return false;
        } else if (mes == 9 && dia > 30) {
            return false;
        } else if (mes == 11 && dia > 30) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean formatoOk(String fecha) {
        boolean formatoOk;
        if (fecha.matches("\\d{2}[-]\\d{2}[-]\\d{4}")) {
            formatoOk = true;
        } else {
            formatoOk = false;
        }
        return formatoOk;
    }
}