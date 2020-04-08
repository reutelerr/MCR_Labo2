import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class SingletonFrame implements Displayer
{
    private Image image;
    private JFrame frame;

    private static class Instance
    {
        static SingletonFrame instance = new SingletonFrame();
    }

    private SingletonFrame()
    {
        frame = new JFrame("Bouncers");
        frame.setSize(500, 500);
        frame.setVisible(true);
        image = frame.createImage(getWidth(), getHeight());


        frame.addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }});

        frame.addKeyListener(new KeyAdapter() { //KeyAdapter et non KeyListener pour ne pas avoir à impl toutes les methodes
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_E :{
                       System.out.println("Salut");
                       break;
                    }
                }
            }
        });
    }

    public static SingletonFrame getInstance()
    {
        if(Instance.instance == null)
        {
            Instance.instance = new SingletonFrame();
        }
        return Instance.instance;
    }

    public Image createImage(int width, int height) {
        this.image = frame.createImage(width, height);
        return image;
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
        //return (Graphics2D)getInstance().image.getGraphics();
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
