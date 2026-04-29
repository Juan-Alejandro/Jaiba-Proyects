package domain.model;

import domain.enums.LineaProduccion;

public class Tablet extends Producto
{

    private final int megapixeles;
    private final boolean tieneStylus;

    public Tablet(int megapixeles, boolean tieneStylus, String numeroSerie, String sku, String modelo, LineaProduccion lineaProduccion)
    {
        super(numeroSerie, sku, modelo, lineaProduccion,precioBase);
        this.megapixeles = megapixeles;
        this.tieneStylus = tieneStylus;
    }

    public int getMegapixeles()
    {
        return megapixeles;
    }

    public boolean isTieneStylus()
    {
        return tieneStylus;
    }
    
    

    @Override
    public void realizarPruebaCalidad()
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        if(precioBase < 800) {
            return 24;
        }

        return 32;
    }

}
