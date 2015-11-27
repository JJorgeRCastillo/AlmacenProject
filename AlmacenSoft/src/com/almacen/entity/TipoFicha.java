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
public class TipoFicha {
    
    private int idTipoFicha;
    private String descripcion;
    private boolean estado;

    
    public TipoFicha(){
        
    }
    
    public TipoFicha(int idTipoFicha, String descripcion, boolean estado){
        this.idTipoFicha = idTipoFicha;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    public int getIdTipoFicha() {
        return idTipoFicha;
    }

    public void setIdTipoFicha(int idTipoFicha) {
        this.idTipoFicha = idTipoFicha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
