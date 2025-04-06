package cl.colegiomtn.sistpostulante.util;

public class RutValidador {

    public static boolean esRutValido(String rut) {
        rut = rut.toUpperCase().replace(".", "").replace("-", "");
        if (!rut.matches("\\d{7,8}[0-9K]")) return false;

        String cuerpo = rut.substring(0, rut.length() - 1);
        char dv = rut.charAt(rut.length() - 1);

        int suma = 0;
        int factor = 2;

        for (int i = cuerpo.length() - 1; i >= 0; i--) {
            suma += Character.getNumericValue(cuerpo.charAt(i)) * factor;
            factor = (factor == 7) ? 2 : factor + 1;
        }

        int resto = 11 - (suma % 11);
        char dvCalculado;

        if (resto == 11) {
            dvCalculado = '0';
        } else if (resto == 10) {
            dvCalculado = 'K';
        } else {
            dvCalculado = (char) ('0' + resto);
        }

        return dv == dvCalculado;
    }
}
