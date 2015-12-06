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
public enum OptionValues {

    INSERT("INSERT", 1), UPDATE("UPDATE", 2), DELETE("DELETE", 3);

    private final String key;
    private final int value;

    private OptionValues(String key, int value) {
        this.key = key;
        this.value = value;
    }
    
    
    public String getKey(){
        return this.key;
    }
    
    public int getValue(){
        return this.value;
    }
    
}
