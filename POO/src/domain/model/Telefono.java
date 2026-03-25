package domain.model;

import domain.enums.LineaProduccion;
/**
 *
 * @author Usuario
 */
public class Telefono extends Producto{

    private final String imei;
    private final int ramGB;
    private final int almacenamientoGB;

    public Telefono(String numeroSerie,String sku,String modelo,String imei,
        int ramGB,int almacenamientoGB) {
        super(numeroSerie, sku, modelo, LineaProduccion.TELEFONOS);
        this.imei = imei;
        this.ramGB = ramGB;
        this.almacenamientoGB = almacenamientoGB;
    }

    public String getImei()
    {
        return imei;
    }

    public int getRamGR()
    {
        return ramGB;
    }

    public int getAlmacenamientoGB()
    {
        return almacenamientoGB;
    }
    
    
    

}
