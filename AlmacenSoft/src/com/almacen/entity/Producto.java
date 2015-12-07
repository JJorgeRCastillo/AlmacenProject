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
public class Producto {
    
    private int idProducto;
    private String nombre;
    private String codigo;
    private int stock;
    private int valorMaximo;
    private int valorMedio;
    private int valorMinimo;
    private UnidadMedida objUnidadMedida;
    private Categoria objCategoria;    
    private boolean estado;
    
    private float precio; // variable solo para la parte del registro de ficha
    
    public Producto(){
        
    }
    
    public Producto(int idProducto, String nombre, String codigo, int stock, int valorMaximo, int valorMedio, int valorMinimo, UnidadMedida objUnidadMedida, Categoria objCategoria, boolean  estado){
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
        this.valorMaximo = valorMaximo;
        this.valorMedio = valorMedio;
        this.valorMinimo = valorMinimo;
        this.objUnidadMedida = objUnidadMedida;
        this.objCategoria = objCategoria;
        this.estado = estado;
    }
    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }

    public void setValorMaximo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public int getValorMedio() {
        return valorMedio;
    }

    public void setValorMedio(int valorMedio) {
        this.valorMedio = valorMedio;
    }

    public int getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(int valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public UnidadMedida getObjUnidadMedida() {
        return objUnidadMedida;
    }

    public void setObjUnidadMedida(UnidadMedida objUnidadMedida) {
        this.objUnidadMedida = objUnidadMedida;
    }

    public Categoria getObjCategoria() {
        return objCategoria;
    }

    public void setObjCategoria(Categoria objCategoria) {
        this.objCategoria = objCategoria;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
    
}
