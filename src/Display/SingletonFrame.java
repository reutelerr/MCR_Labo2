/*
 * Laboratoire : 02
 * Fichier     : SingletonFrame.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Affichage unique de notre application
 */

package Display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SingletonFrame implements Displayer
{
    private Image image;
    private JFrame frame;
    private static final int SIDE = 500;

    //Singleton
    private static class Instance
    {
        static SingletonFrame instance = new SingletonFrame();
    }

    private SingletonFrame()
    {
        frame = new JFrame("Bouncers");
        frame.setSize(SIDE, SIDE);
        frame.setVisible(true);
        image = frame.createImage(getWidth(), getHeight());

        frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }});
    }

    public static SingletonFrame getInstance()
    {
        if(Instance.instance == null)
        {
            Instance.instance = new SingletonFrame();
        }
        return Instance.instance;
    }

    /**
     * Refreshes blank image
     */
    public void createImage() {
        this.image = frame.createImage(frame.getWidth(), frame.getHeight());
    }

    @Override
    public int getWidth() {
        return frame.getWidth();
    }

    @Override
    public int getHeight() {
        return frame.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D)image.getGraphics();
    }

    @Override
    public void repaint() {
        frame.getGraphics().drawImage(image,0,0,null);
    }

    @Override
    public void setTitle(String s) {
        frame.setTitle(s);
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        frame.addKeyListener(ka);
    }
}
