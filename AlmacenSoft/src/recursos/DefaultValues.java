/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author JorgePC
 */
public class DefaultValues {
    
    private static DefaultValues instance = null;
    
    private DefaultValues(){
   
    }
    public static DefaultValues getInstance(){
        if(instance == null) {
            instance = new DefaultValues();
        }
        return instance;
    }
    
    public final int OPTION_INSERT = 1;
    public final int OPTION_UPDATE = 2;
    public final int OPTION_DELETE = 3;
    
}
