package domain.model;

import domain.enums.EstadoProduccion;
import domain.enums.LineaProduccion;

public abstract class Producto {
    
    private final String numeroSerie;
    private final String sku;
    private final String modelo;
    private final LineaProduccion lineaProduccion;
    private double precioBase;
    
    private EstadoProduccion estadoProduccion;
    private String motivoRechazo;


    public Producto(String numeroSerie, String sku, String modelo, LineaProduccion lineaProduccion,double precioBase)
    {
        this.numeroSerie = numeroSerie;
        this.sku = sku;
        this.modelo = modelo;
        this.lineaProduccion = lineaProduccion;
        
        this.estadoProduccion = EstadoProduccion.EN_LINEA;
        this.motivoRechazo = null; 
        this.precioBase = precioBase;

    }

    public String getNumeroSerie()
    {
        return numeroSerie;
    }

    public String getSku()
    {
        return sku;
    }

    public String getModelo()
    {
        return modelo;
    }

    public LineaProduccion getLineaProduccion()
    {
        return lineaProduccion;
    }

    public EstadoProduccion getEstadoProduccion()
    {
        return estadoProduccion;
    }

    public String getMotivoRechazo()
    {
        return motivoRechazo;
    }
    
    public void iniciarPrueba(){
        asegurarEstado(EstadoProduccion.EN_LINEA, "iniciar prueba");
        this.estadoProduccion = EstadoProduccion.EN_PRUEBA;
    }
    
    public void aprobar(){
        asegurarEstado(EstadoProduccion.EN_PRUEBA, "aprobar");
        this.estadoProduccion = EstadoProduccion.APROBADO;
        this.motivoRechazo = null;
    }
    
    public void rechazar(String motivo){
        asegurarEstado(EstadoProduccion.EN_PRUEBA, "rechazar");
        this.estadoProduccion = EstadoProduccion.RECHAZADO;
        this.motivoRechazo = motivo;
    }
    
    public void empaquetar(){
        asegurarEstado(EstadoProduccion.APROBADO, "empaquetar");
        this.estadoProduccion = EstadoProduccion.EMPAQUETADO;
    }
    
    private void asegurarEstado(EstadoProduccion esperado, String operacion){
        if(this.estadoProduccion != esperado){
            System.out.println("No se puede realizar " + operacion + 
                    "cuando estadoProduccion = " +
                    this.estadoProduccion + " esperado " +
                    esperado);
        }
    }

    public abstract void realizarPruebaCalidad();
    
    public abstract int calcularGarantia(precioBase);

    @Override 
    public String toString()
    {
        return "Producto{ \nSerie: "+ numeroSerie +
                "\nsku: " + sku +
                "\nmodelo: " + modelo +
                "\nliena: " + lineaProduccion +
                "\nestado: " + estadoProduccion + "\n}";
    }
    
    
}
