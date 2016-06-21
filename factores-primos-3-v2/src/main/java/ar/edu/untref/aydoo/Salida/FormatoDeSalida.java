package ar.edu.untref.aydoo.Salida;

/**
 * Created by lucas on 13/06/16.
 */
public class FormatoDeSalida {

    public String salidaConFormato(String numero, String factoresPrimosOrdenados, String formato){

        String salida = null;

        if (formato.equals("pretty")){
            salida = "Factores primos "+ numero + ": " + factoresPrimosOrdenados;
        }
        else if (formato.equals("quiet")){
            salida = factoresPrimosOrdenados.replace(" ", "\n");
        }
        return salida;
    }
}