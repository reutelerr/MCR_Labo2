import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;

public class BounceApp {

    private LinkedList<Bouncable> bouncers;
    private EmptyBouncableFactory emptyBouncableFactory;
    private FullBouncableFactory fullBouncableFactory;
    private SingletonFrame frame = SingletonFrame.getInstance();

    BounceApp()
    {
        bouncers = new LinkedList<Bouncable>();
        emptyBouncableFactory = new EmptyBouncableFactory();
        fullBouncableFactory = new FullBouncableFactory();

        //Formes de départ : 5 de chaque type (TEMPORAIRE : que des cercles)
        for(int i=0; i<5; ++i)
        {
            bouncers.add(emptyBouncableFactory.createCircle());
            bouncers.add(fullBouncableFactory.createCircle());
            bouncers.add(emptyBouncableFactory.createRectangle());
            bouncers.add(fullBouncableFactory.createRectangle());
        }


        frame.addKeyListener(new KeyAdapter() { //KeyAdapter et non KeyListener pour ne pas avoir à impl toutes les methodes
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_E :{
                        erase();
                        break;
                    }
                }
            }
        });
    }

    public void loop()
    {
        Timer clock = new Timer();
        clock.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                frame.createImage(frame.getWidth(), frame.getHeight());
                for(Bouncable b : bouncers)
                {
                    b.move();
                    b.draw();
                }
                frame.repaint();
            }
        },0, 10);
    }

    public static void main(String[] args) {
        new BounceApp().loop();
    }

    private void erase(){
        bouncers = new LinkedList<Bouncable>();
    }

}
