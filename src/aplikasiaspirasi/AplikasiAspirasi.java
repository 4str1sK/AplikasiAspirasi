/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasiaspirasi;
import javax.swing.*;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;

/**
 *
 * @author Lenovo
 */
public class AplikasiAspirasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    aplikasiaspirasi.services.Database.connect();
    //Setup UI buat app javanya
    try {
        FlatLightLaf.setup();
    } catch (Exception e) {
       e.printStackTrace();
    }
    
    //Call main frame
    new NotLoginPage().setVisible(true);
        
        
    }
    
}
