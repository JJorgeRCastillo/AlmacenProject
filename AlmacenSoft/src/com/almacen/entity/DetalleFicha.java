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
public class DetalleFicha {

    private int idDetalleFicha;
    private Ficha objFicha;
    private Producto objProducto;
    private int cantidad;
    private float precio;

    public DetalleFicha() {
    }
    
    public DetalleFicha(int idDetalleFicha, Ficha objFicha, Producto objProducto, int cantidad, float precio){
        this.idDetalleFicha = idDetalleFicha;
        this.objFicha = objFicha;
        this.objProducto = objProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    

    public int getIdDetalleFicha() {
        return idDetalleFicha;
    }

    public void setIdDetalleFicha(int idDetalleFicha) {
        this.idDetalleFicha = idDetalleFicha;
    }

    public Ficha getObjFicha() {
        return objFicha;
    }

    public void setObjFicha(Ficha objFicha) {
        this.objFicha = objFicha;
    }

    public Producto getObjProducto() {
        return objProducto;
    }

    public void setObjProducto(Producto objProducto) {
        this.objProducto = objProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
