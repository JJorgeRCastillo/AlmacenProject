/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.entity;

import java.sql.Date;

/**
 *
 * @author JOSEPH
 */
public class ListaKardex {
    private Date fechaRegistro ;
    private String tipoDocumento;
    private String serie;
    private String codigo;
    private String razonSocial;
    private int cantidad;
    private int stockActual;
    private double precio;

    public ListaKardex(Date fechaRegistro, String tipoDocumento, String serie, String codigo, String razonSocial, int cantidad, int stockActual, double precio) {
        this.fechaRegistro = fechaRegistro;
        this.tipoDocumento = tipoDocumento;
        this.serie = serie;
        this.codigo = codigo;
        this.razonSocial = razonSocial;
        this.cantidad = cantidad;
        this.stockActual = stockActual;
        this.precio = precio;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
