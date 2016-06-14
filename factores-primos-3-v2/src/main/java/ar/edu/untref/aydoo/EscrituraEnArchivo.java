package ar.edu.untref.aydoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by lucas on 14/06/16.
 */
public class EscrituraEnArchivo {

    public void escribirEnArchivo(String nombreArchivo, String contenido)throws IOException{

        File archivo = new File(nombreArchivo);
        BufferedWriter bw;

        bw = new BufferedWriter(new FileWriter(archivo));
        bw.write(contenido);

        bw.close();
    }
}
