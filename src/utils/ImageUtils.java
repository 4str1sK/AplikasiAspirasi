package utils;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ImageUtils {

    public static void setImage(
            JLabel label,
            String path,
            int width,
            int height
    ) {

        try {

            ImageIcon icon = new ImageIcon(
                    ImageUtils.class.getResource(path)
            );

            Image scaled = icon.getImage().getScaledInstance(
                    width,
                    height,
                    Image.SCALE_SMOOTH
            );

            label.setOpaque(false);
            label.setIcon(new ImageIcon(scaled));

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void setImageFitLabel(
            JLabel label,
            String path
    ) {

        try {

            ImageIcon icon = new ImageIcon(
                    ImageUtils.class.getResource(path)
            );

            Image scaled = icon.getImage().getScaledInstance(
                    label.getWidth(),
                    label.getHeight(),
                    Image.SCALE_SMOOTH
            );

            label.setOpaque(false);
            label.setIcon(new ImageIcon(scaled));

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}