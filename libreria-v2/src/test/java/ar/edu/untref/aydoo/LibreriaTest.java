package ar.edu.untref.aydoo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lucas on 23/06/16.
 */
public class LibreriaTest {

    Libreria losAmigos = new Libreria("Los Amigos");

    Cliente carlosSuarez = new Cliente("Carlos", "Suarez", "Av. Cabildo 2135");
    Cliente lauraRamos = new Cliente("Laura", "Ramos", "Jeremias 333");
    Cliente ezequielVidela = new Cliente("Ezequiel", "Videla", "San Juan 210");

    ArticuloDeLibreria goma = new ArticuloDeLibreria("Dos banderas", 4, 2);
    ArticuloDeLibreria lapicera = new ArticuloDeLibreria("Bic", 5, 2);

    Libro elHobbit = new Libro("El Hobbit", 50);

    Periodico diarioClarin = new Periodico("Clarin", 13);
    Periodico diarioPagina12 = new Periodico("Pagina 12",12);

    Revista revistaCaras = new Revista("Caras", 40);
    Revista revistaBarcelona = new Revista("Barcelona", 20);
    Revista revistaElGrafico = new Revista("El Grafico", 30);

    Suscripcion suscripcionQuincenalBarcelona = new Suscripcion(revistaBarcelona, Frecuencia.QUINCENAL);
    Suscripcion suscripcionMensualElGrafico = new Suscripcion(revistaElGrafico, Frecuencia.MENSUAL);

    SuscripcionAnual suscripcionAnualBarcelona = new SuscripcionAnual(suscripcionQuincenalBarcelona);

    @Test
    public void obtieneNombreLibreria(){

        Assert.assertEquals("Los Amigos", losAmigos.getNombreLibreria());
    }

    @Test
    public void calculoMontoACobrarSinComprasEsCero(){

        losAmigos.agregarCliente(carlosSuarez);
        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.ABRIL, carlosSuarez);

        Assert.assertEquals(0.0, montoACobrar, 0.01);
    }

    @Test
    public void calculoMontoACobrarConClienteNoRegistradoEsperaExcepcion(){

        try {
            double montoACobrar = losAmigos.calcularMontoACobrar(Mes.ABRIL, lauraRamos);
        }catch (ExcepcionClienteDesconocido e){
        }
    }

    @Test
    public void calculoMontoACobrarEnEneroCompraDeUnaUnidad(){

        losAmigos.agregarCliente(carlosSuarez);

        Compra unaCompra = new Compra(Mes.ENERO);
        unaCompra.agregarProducto(elHobbit);

        carlosSuarez.ingresarCompra(unaCompra);

        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.ENERO,carlosSuarez);

        Assert.assertEquals(50, montoACobrar, 0.01);
    }

    @Test
    public void calculoMontoACobrarEnEneroCompraVariosProductos(){

        losAmigos.agregarCliente(carlosSuarez);

        Compra compraEnero = new Compra(Mes.ENERO);
        compraEnero.agregarProducto(elHobbit);
        compraEnero.agregarProducto(diarioClarin);
        compraEnero.agregarProducto(revistaBarcelona);

        carlosSuarez.ingresarCompra(compraEnero);

        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.ENERO,carlosSuarez);

        Assert.assertEquals(83, montoACobrar, 0.01);
    }

    @Test
    public void calculoMontoACobrarEnAbrilCompraVariosProductos(){

        losAmigos.agregarCliente(carlosSuarez);

        Compra compraAbril = new Compra(Mes.ABRIL);
        compraAbril.agregarProducto(elHobbit);
        compraAbril.agregarProducto(diarioClarin);
        compraAbril.agregarProducto(revistaBarcelona);
        compraAbril.agregarProducto(diarioPagina12);

        carlosSuarez.ingresarCompra(compraAbril);

        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.ABRIL,carlosSuarez);

        Assert.assertEquals(95, montoACobrar, 0.01);
    }

    @Test
    public void calculoMontoACobrarEnMayoConComprasEnVariosMeses(){

        losAmigos.agregarCliente(carlosSuarez);

        Compra compraSeptiembre = new Compra(Mes.SEPTIEMBRE);
        Compra compraMayo = new Compra(Mes.MAYO);

        compraSeptiembre.agregarProducto(elHobbit);
        compraSeptiembre.agregarProducto(diarioClarin);
        compraMayo.agregarProducto(revistaBarcelona);

        carlosSuarez.ingresarCompra(compraSeptiembre);
        carlosSuarez.ingresarCompra(compraMayo);

        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.MAYO,carlosSuarez);

        Assert.assertEquals(20, montoACobrar, 0.01);
    }

    @Test
    public void calculoMontoACobrarConVariasComprasEnUnMes(){

        losAmigos.agregarCliente(carlosSuarez);
        losAmigos.agregarCliente(ezequielVidela);

        Compra compraCarlosFebrero1 = new Compra(Mes.FEBRERO);
        Compra compraCarlosFebrero2 = new Compra(Mes.FEBRERO);

        compraCarlosFebrero2.agregarProducto(elHobbit);
        compraCarlosFebrero1.agregarProducto(diarioClarin);
        compraCarlosFebrero1.agregarProducto(revistaElGrafico);

        carlosSuarez.ingresarCompra(compraCarlosFebrero1);
        carlosSuarez.ingresarCompra(compraCarlosFebrero2);

        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.FEBRERO,carlosSuarez);

        Assert.assertEquals(93, montoACobrar, 0.01);
    }

    @Test
    public void calculoMontoACobrarConVariosClientes(){

        losAmigos.agregarCliente(carlosSuarez);
        losAmigos.agregarCliente(lauraRamos);
        losAmigos.agregarCliente(ezequielVidela);

        Compra compraCarlosOctubre = new Compra(Mes.OCTUBRE);
        Compra compraEzequielMayo = new Compra(Mes.MAYO);
        Compra compraLauraOctubre = new Compra(Mes.OCTUBRE);

        compraLauraOctubre.agregarProducto(revistaCaras);
        compraEzequielMayo.agregarProducto(revistaBarcelona);
        compraCarlosOctubre.agregarProducto(revistaElGrafico);
        compraLauraOctubre.agregarProducto(diarioClarin);

        carlosSuarez.ingresarCompra(compraCarlosOctubre);
        ezequielVidela.ingresarCompra(compraEzequielMayo);
        lauraRamos.ingresarCompra(compraLauraOctubre);

        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.OCTUBRE,lauraRamos);

        Assert.assertEquals(53, montoACobrar, 0.01);
    }

    @Test
    public void calculoMontoACobrarConSuscripcion(){

        losAmigos.agregarCliente(carlosSuarez);
        losAmigos.agregarCliente(ezequielVidela);

        Compra compraCarlosFebrero = new Compra(Mes.FEBRERO);
        Compra compraEzequielAgosto = new Compra(Mes.AGOSTO);

        compraEzequielAgosto.agregarProducto(suscripcionQuincenalBarcelona);
        compraCarlosFebrero.agregarProducto(revistaElGrafico);

        carlosSuarez.ingresarCompra(compraCarlosFebrero);
        ezequielVidela.ingresarCompra(compraEzequielAgosto);

        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.AGOSTO,ezequielVidela);

        Assert.assertEquals(40, montoACobrar, 0.01);
    }

    @Test
    public void calculoMontoACobrarConArticuloDeLibreriaLibroYSuscripcionRevista(){

        losAmigos.agregarCliente(carlosSuarez);

        Compra compraCarlosJulio = new Compra(Mes.JULIO);

        compraCarlosJulio.agregarProducto(goma);
        compraCarlosJulio.agregarProducto(diarioClarin);
        compraCarlosJulio.agregarProducto(elHobbit);
        compraCarlosJulio.agregarProducto(suscripcionMensualElGrafico);

        carlosSuarez.ingresarCompra(compraCarlosJulio);

        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.JULIO,carlosSuarez);

        Assert.assertEquals( 102.68, montoACobrar, 0.01);
    }

    @Test
    public void calculoMontoACobrarConEjemploCasoUno(){

        losAmigos.agregarCliente(carlosSuarez);

        Compra compraCarlosAgosto = new Compra(Mes.AGOSTO);

        compraCarlosAgosto.agregarProducto(elHobbit);
        compraCarlosAgosto.agregarProducto(lapicera);
        compraCarlosAgosto.agregarProducto(revistaElGrafico);

        carlosSuarez.ingresarCompra(compraCarlosAgosto);

        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.AGOSTO,carlosSuarez);

        Assert.assertEquals(92.1, montoACobrar, 0.01);
    }

    @Test
    public void calculoMontoACobrarConEjemploCasoDos(){

        losAmigos.agregarCliente(lauraRamos);

        Compra compraLauraAgosto = new Compra(Mes.AGOSTO);

        compraLauraAgosto.agregarProducto(suscripcionAnualBarcelona);
        compraLauraAgosto.agregarProducto(diarioPagina12);

        lauraRamos.ingresarCompra(compraLauraAgosto);

        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.AGOSTO,lauraRamos);

        Assert.assertEquals(44, montoACobrar, 0.01);
    }

    @Test
    public void calculoMontoACobrarEnMesQueNoHayCompras(){

        losAmigos.agregarCliente(lauraRamos);

        Compra compraLauraAgosto = new Compra(Mes.AGOSTO);

        compraLauraAgosto.agregarProducto(suscripcionAnualBarcelona);
        compraLauraAgosto.agregarProducto(diarioPagina12);

        lauraRamos.ingresarCompra(compraLauraAgosto);

        double montoACobrar = losAmigos.calcularMontoACobrar(Mes.ENERO,lauraRamos);

        Assert.assertEquals(0.0, montoACobrar, 0.01);
    }
}
