package com.almacen.logic;

import com.almacen.dao.FichaDAO;
import com.almacen.entity.Ficha;

/**
 *
 * @author JorgePC
 */
public class FichaBL {

    private static FichaBL instance = null;

    private FichaBL() {

    }

    public static FichaBL getInstance() {
        if (instance == null) {
            instance = new FichaBL();
        }
        return instance;
    }
    
    
    public int insert(Ficha objFicha){
        try{
            return FichaDAO.getInstance().insert(objFicha);
        }catch(Exception ex){
            throw ex;
        }
    }
}
