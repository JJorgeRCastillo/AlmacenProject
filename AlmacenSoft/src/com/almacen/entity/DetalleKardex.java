/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.entity;

/**
 *
 * @author JOSEPH
 */
public class DetalleKardex {
    private int idDetalleKardex ;
    private Producto objProducto;
    private Ficha objFicha;
    private int entrada;
    private int salida;
    private int stockActual;
    private boolean estado;

    public DetalleKardex(int idDetalleKardex, Producto objProducto, Ficha objFicha, int entrada, int salida, int stockActual, boolean estado) {
        this.idDetalleKardex = idDetalleKardex;
        this.objProducto = objProducto;
        this.objFicha = objFicha;
        this.entrada = entrada;
        this.salida = salida;
        this.stockActual = stockActual;
        this.estado = estado;
    }

    public int getIdDetalleKardex() {
        return idDetalleKardex;
    }

    public void setIdDetalleKardex(int idDetalleKardex) {
        this.idDetalleKardex = idDetalleKardex;
    }

    public Producto getObjProducto() {
        return objProducto;
    }

    public void setObjProducto(Producto objProducto) {
        this.objProducto = objProducto;
    }

    public Ficha getObjFicha() {
        return objFicha;
    }

    public void setObjFicha(Ficha objFicha) {
        this.objFicha = objFicha;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
}
