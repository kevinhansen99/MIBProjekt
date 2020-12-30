import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JComboBox;
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
    
    public static boolean isNotEmpty(JTextField... args) {
        boolean result = true;

        for (JTextField arg : args) {
            if (arg.getText().isEmpty()) {
                result = false;
            }
        }
        if (!result) {
            JOptionPane.showMessageDialog(null, "Fyll i alla fält!");
        }
        return result;
    }
    
    public static boolean isInteger(JTextField... args) {
        boolean result = true;

        for (JTextField arg : args) {
            //Försöker konvertera till int.
            try {
                String temp = arg.getText();
                Integer.parseInt(temp);
            } catch (NumberFormatException e) {
                result = false;
                arg.requestFocus();
            }
            if (!result) {
                JOptionPane.showMessageDialog(null, "Enbart numeriska värden är tillåtna!");
            }
        }
        return result;
    }
    
     public static boolean ifCBEmpty(JComboBox... args) {
        boolean result = true;

        for (JComboBox arg : args) {
            if (arg.getSelectedIndex() == -1) {
                result = false;
            }
        }
        if (!result) {
            JOptionPane.showMessageDialog(null, "Fyll i alla rullgardinsmenyer!");
        }
        return result;
    }
     
     public static boolean regexDate(String date) {
        boolean result = false;

        //Sträng med förbestämd "mall" om hur det inskicade strängvärdet ska se ut.
        String strDateRegEx = "\\d{4}-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|[3][01])";

        //Om det inskicade strängvärdet matchar regexsträngen ovan.
        if (date.matches(strDateRegEx)) {

            //Skapar nytt SimpleDateFormat objekt med formatet "yyyy-MM-dd".
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            try {
                sdf.parse(date);
                result = true;
            } catch (ParseException e) {
                //
            }
        }
        if (!result) {
            JOptionPane.showMessageDialog(null, "Fyll i datum enligt följande mall: \"YYYY-MM-DD\"");
        }
        return result;
    }
     
     
    
}



