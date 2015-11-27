/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.entity;

/**
 *
 * @author JorgePC
 */
public class UnidadMedida {
    
    private int idUnidadMedida;
    private String descripcion;
    private String simbolo;
    private boolean estado;

    
    public UnidadMedida(){
        
    }
    
    public UnidadMedida(int idUnidadMedida, String descripcion, String simbolo, boolean estado){
        this.idUnidadMedida = idUnidadMedida;
        this.descripcion = descripcion;
        this.simbolo = simbolo;
        this.estado = estado;
    }
    
    public int getIdUnidadMedida() {
        return idUnidadMedida;
    }

    public void setIdUnidadMedida(int idUnidadMedida) {
        this.idUnidadMedida = idUnidadMedida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
