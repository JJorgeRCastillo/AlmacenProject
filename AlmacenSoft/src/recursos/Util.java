package recursos;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author JorgePC
 */
public class Util {

    
    private static Util instance = null;
    
    private Util(){        
    }
    
    public static Util getInstance(){
        if(instance == null){
            instance = new Util();
        }
        return instance;
    }

    
    // método para saber si un JInternalFrame ya fue creado
    public boolean isJInternalFrameOpen(Object obj, JDesktopPane dskContenedor) {
                
        JInternalFrame[] objActivos = dskContenedor.getAllFrames();
        boolean cerrado = false;
        for (JInternalFrame frame : objActivos) {
            if (frame.getClass() == obj.getClass()) {
                cerrado = true;
                break;
            }
        }
        return cerrado;
    }
}
