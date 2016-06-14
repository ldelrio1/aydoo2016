package ar.edu.untref.aydoo;

/**
 * Created by lucas on 13/06/16.
 */
public class FormatoDeSalida {

    public String salidaConFormato(String numero, String factoresPrimosOrdenados, String formato){

        String salida = null;

        if (formato == "pretty"){
            salida = "Factores primos "+ numero + ":" + factoresPrimosOrdenados;
        }
        else if (formato == "quiet"){
            salida = factoresPrimosOrdenados.replace(" ", "\n");
        }
        return salida;
    }
}