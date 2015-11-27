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
public class Categoria {
    
    private int idCategoria;
    private String descripcion;
    private boolean estado;

    public Categoria(){
        
    }
    
    public Categoria(int idCategoria, String descripcion, boolean estado){
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.estado = estado;
    }
    
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
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
