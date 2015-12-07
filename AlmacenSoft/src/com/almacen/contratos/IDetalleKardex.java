/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacen.contratos;

import com.almacen.entity.ListaKardex;
import java.util.List;

/**
 *
 * @author JOSEPH
 */
public interface IDetalleKardex {
    // Listar Kardex de Salida y Entradas
    public List<ListaKardex> listKardexSalida(int idproducto, String desde, String hasta);
    public List<ListaKardex> listKardexEntrada(int idproducto, String desde, String hasta);
}
