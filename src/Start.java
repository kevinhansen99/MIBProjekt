
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work
 */
public class Start {
    
        private static InfDB idb;

    public static void main(String[] args) {
               
        try{
          idb = new InfDB("C:\\db\\MIBDB.FDB");
        }
        catch(InfException ettUndantag){
            
        JOptionPane.showMessageDialog(null, "Sökväg till databasen hittades inte!");
        System.out.println("Internt felmeddelande" + ettUndantag.getMessage());
        }
        
        new StartWindow(idb).setVisible(true);
    }
    
}
