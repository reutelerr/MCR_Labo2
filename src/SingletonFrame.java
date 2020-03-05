import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SingletonFrame extends JFrame implements Displayer
{
    private ArrayList<Image> Squares;
    private ArrayList<Image> Circles;

    private static class Instance
    {
        static final SingletonFrame instance = new SingletonFrame();
    }

    private SingletonFrame()
    {
        setTitle("Bouncers");
        this.setSize(500, 500);

        for(int i=0; i<20; ++i)
        {

        }
    }

    public static SingletonFrame getInstance()
    {
        return Instance.instance;
    }


    @Override
    public int getWidth() {
        return this.getWidth();
    }

    @Override
    public int getHeight() {
        return this.getHeight();
    }

    @Override
    public Graphics2D getGraphics() {
        return this.getGraphics();
    }

    @Override
    public void repaint() {
        this.repaint();
    }

    @Override
    public void setTitle(String s) {
        this.setTitle(s);
    }


}
