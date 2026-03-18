/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import domain.model.Telefono;

/**
 *
 * @author Usuario
 */
public class POO {
    public static void main(String[] args) {
        Telefono t = new Telefono(
                "SM-90001",
                "SKU-A10",
                "Galaxy Demo",
                "35911111111111",
                8,
                256);
        
        System.out.println(t);
        
        t.iniciarPrueba();
        t.aprobar();
        t.empaquetar();
        System.out.println("");
        System.out.println(t);
    }
    
}
