/*
 * Laboratoire : 02
 * Fichier     : BounceApp.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Application qui permet d'instancier des cercles et des carrés et de les déplacer dans un
 *               espace d'affichage graphique commun.
 */

import Display.SingletonFrame;
import Factories.EmptyBouncableFactory;
import Factories.FullBouncableFactory;
import Shapes.Bouncable;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;

public class BounceApp {

    private LinkedList<Bouncable> bouncers;
    private EmptyBouncableFactory emptyBouncableFactory;
    private FullBouncableFactory fullBouncableFactory;
    private SingletonFrame frame = SingletonFrame.getInstance();
    private static final int GENERATED_SHAPES = 10;

    BounceApp()
    {
        bouncers = new LinkedList<Bouncable>();
        emptyBouncableFactory = new EmptyBouncableFactory();
        fullBouncableFactory = new FullBouncableFactory();

        frame.addKeyListener(new KeyAdapter() { //KeyAdapter et non KeyListener pour ne pas avoir à impl toutes les methodes
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_E :{
                        erase();
                        break;
                    }
                    case KeyEvent.VK_B:{
                        generateEmpty(GENERATED_SHAPES);
                        break;
                    }
                    case KeyEvent.VK_F:{
                       generateFull(GENERATED_SHAPES);
                        break;
                    }
                    case KeyEvent.VK_Q:{
                        System.exit(0);
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

    private void generateEmpty(int n){
        for(int i=0; i<n; ++i)
        {
            bouncers.add(emptyBouncableFactory.createCircle());
            bouncers.add(emptyBouncableFactory.createRectangle());
        }
    }

    private void generateFull(int n){
        for(int i=0; i<n; ++i)
        {
            bouncers.add(fullBouncableFactory.createCircle());
            bouncers.add(fullBouncableFactory.createRectangle());
        }
    }

}
