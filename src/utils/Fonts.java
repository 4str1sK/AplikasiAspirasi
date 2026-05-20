/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Lenovo
 */
public class Fonts {
   private static Font agrandirBase;

    static {

        try {

            agrandirBase = Font.createFont(
                    Font.TRUETYPE_FONT,
                    Fonts.class.getResourceAsStream(
                            "/assets/Agrandir-Regular.otf"
                    )
            );

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void applyAgrandir(JComponent component) {

        Font current = component.getFont();

        component.setFont(
                agrandirBase.deriveFont(
                        current.getStyle(),
                        current.getSize()
                )
        );
    }
    }
