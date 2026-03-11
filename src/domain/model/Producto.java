/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain.model;

import domain.enums.EstadoProduccion;
import domain.enums.LineaProduccion;
/**
 *
 * @author Usuario
 */
public class Producto {

    private final String numeroSerie;
    private final String sku;
    private final String modelo;
    private final LineaProduccion lineaProduccion;
    
    private EstadoProduccion estadoProduccion;
    private String motivoRechazo;
    
    //Construcctor
    public Producto (String numeroSerie, String sku, String modelo, LineaProduccion lineaProduccion) {
        this.numeroSerie = numeroSerie;
        this.sku = sku;
        this.modelo = modelo;
        this.lineaProduccion = lineaProduccion;
        
        this.estadoProduccion = EstadoProduccion.EN_LINEA;
        this.motivoRechazo = null;
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
    
    public void  iniciarPrueba() {
        asegurarEstado(EstadoProduccion.EN_LINEA, "iniciar prueba");
        this.estadoProduccion = EstadoProduccion.EN_PRUEBA;
    }
    
    public void aprobar() {
        asegurarEstado(EstadoProduccion.EN_PRUEBA, "aprobar");
        this.estadoProduccion = EstadoProduccion.APROBADO;
        this.motivoRechazo = null;
    }
    
    public void rechazar(String motivo) {
        asegurarEstado(EstadoProduccion.EN_PRUEBA, "rechazar");
        this.estadoProduccion = EstadoProduccion.RECHAZADO;
        this.motivoRechazo = motivo;
    }
    
    public void empaquetar() {
        
        asegurarEstado(EstadoProduccion.APROBADO, "empaquetar");
        this.estadoProduccion = EstadoProduccion.EMPAQUETADO;
        this.motivoRechazo = null;
        
    }
    
    private void asegurarEstado(EstadoProduccion esperado, String operacion) {
        if(this.estadoProduccion != esperado) {
            System.out.println("No se puede realizar " + 
                    operacion + 
                    " cuando estadoProduccion" + 
                    this.estadoProduccion + 
                    " esperado " +
                    esperado);
        }
    }
    
}
