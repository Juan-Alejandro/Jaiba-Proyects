package domain.model;

import domain.enums.LineaProduccion;
import domain.util.interfaces.Conectable;

public class Telefono extends Producto implements Conectable {
    
    private final String imei;
    private final int ramGB;
    private final int almacenamientoGB;
    
    public Telefono (String numeroSerie, String sku, String modelo,
            String imei, int ramGB, int almacenamientoGB){
        super(numeroSerie, sku, modelo, LineaProduccion.TELEFONOS,precioBase);
        this.imei = imei;
        this.ramGB = ramGB;
        this.almacenamientoGB = almacenamientoGB;
    }

    public String getImei()
    {
        return imei;
    }

    public int getRamGB()
    {
        return ramGB;
    }

    public int getAlmacenamientoGB()
    {
        return almacenamientoGB;
    }

    @Override
    public void realizarPruebaCalidad()
    {
        System.out.println("Realizando prueba de calidad");
    }

    @Override
    public void conectarWifi()
    {
        System.out.println("Conectando a wi-fi");
    }

    @Override
    public void desconectarWifi()
    {
        System.out.println("Desconectado el wi-fi");
    }
    

    @Override 
    public int calcularGarantia(double precioBase)
    {
        if(precioBase < 500) {
            return 12;
        }

        return 24;
    }
    
}
