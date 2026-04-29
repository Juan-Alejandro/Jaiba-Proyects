package domain.model;

import domain.enums.LineaProduccion;

public class Television extends Producto
{

    private final String pulgadas;
    private final String fabricante;

    public Television(String pulgadas, String fabricante, String numeroSerie, String sku, String modelo, LineaProduccion lineaProduccion)
    {
        super(numeroSerie, sku, modelo, lineaProduccion,precioBase);
        this.pulgadas = pulgadas;
        this.fabricante = fabricante;
    }

    public String getPulgadas()
    {
        return pulgadas;
    }

    public String getFabricante()
    {
        return fabricante;
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
        if(precioBase < 1000) {
            return 12;
        }

        return 32;
    }

}
