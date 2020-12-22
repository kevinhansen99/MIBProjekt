import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work
 */
public class Validation {
    
    public static boolean textEmptyValidation(JTextField KontrollRuta)
    {
        boolean result = true;
        
        if(KontrollRuta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rutan får inte vara tom!");
            result = false;
        }
        return result;
    }
      
    public static boolean IsInt (JTextField KontrollRuta)
    {
    boolean result = true;
    
    try{
        String intText = KontrollRuta.getText();
        Integer.parseInt(intText);
    }
    catch(NumberFormatException IntException){
    
       JOptionPane.showMessageDialog(null, "Vänligen använd ett heltal!");
    
    }
    return result;
    }
}



