/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JorgePC
 */
public class Ficha {
    
    private int idFicha;
    private TipoFicha objTipoFicha;
    private Proveedor objProveedor;
    private String serie;
    private String codigo;
    private Date fechaEmision;
    private Date fechaRegistro;
    private String tipoPago;
    private String documentoReferencia; // numero de serie y correlativo de la boleta o factura
    private float montoTotal;
    private boolean estado;
    private String movimiento; // solo para saber si es entrada o salida
    private List<DetalleFicha> lstDetalleFicha;
    
    public Ficha(){   
        lstDetalleFicha = new ArrayList<>();
    }
    
    public Ficha(int idFicha, TipoFicha objTipoFicha, Proveedor objProveedor, String serie, String codigo, Date fechaEmision,
            Date fechaRegistro, String tipoPago, String documentoReferencia, float montoTotal, boolean estado, String movimiento, List<DetalleFicha> lstDetalleFicha){
        this.idFicha = idFicha;
        this.objTipoFicha = objTipoFicha;
        this.objProveedor = objProveedor;
        this.serie = serie;
        this.codigo = codigo;
        this.fechaEmision = fechaEmision;
        this.fechaRegistro = fechaRegistro;
        this.tipoPago = tipoPago;
        this.documentoReferencia = documentoReferencia;
        this.montoTotal = montoTotal;
        this.estado = estado;
        this.movimiento = movimiento;
        this.lstDetalleFicha = lstDetalleFicha;
    }

    public Ficha(int idFicha, Proveedor objProveedor){
        this.idFicha = idFicha;
        this.objProveedor = objProveedor;
    }
    
    
    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public TipoFicha getObjTipoFicha() {
        return objTipoFicha;
    }

    public void setObjTipoFicha(TipoFicha objTipoFicha) {
        this.objTipoFicha = objTipoFicha;
    }

    public Proveedor getObjProveedor() {
        return objProveedor;
    }

    public void setObjProveedor(Proveedor objProveedor) {
        this.objProveedor = objProveedor;
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

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getDocumentoReferencia() {
        return documentoReferencia;
    }

    public void setDocumentoReferencia(String documentoReferencia) {
        this.documentoReferencia = documentoReferencia;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<DetalleFicha> getLstDetalleFicha() {
        return lstDetalleFicha;
    }

    public void setLstDetalleFicha(List<DetalleFicha> lstDetalleFicha) {
        this.lstDetalleFicha = lstDetalleFicha;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }
    
}
