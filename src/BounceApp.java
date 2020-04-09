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
import Factories.BouncableFactory;
import Factories.EmptyBouncableFactory;
import Factories.FullBouncableFactory;
import Shapes.Bouncable;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

public class BounceApp {


    private LinkedList<Bouncable> bouncers;
    private final SingletonFrame frame;
    private static final int GENERATED_SHAPES = 10;
    private static final int REFRESH_PERIOD = 10;


    /**
     * Constructor initializes frame
     */
    BounceApp()
    {
        bouncers = new LinkedList<Bouncable>();
        EmptyBouncableFactory emptyBouncableFactory = EmptyBouncableFactory.getInstance();
        FullBouncableFactory fullBouncableFactory = FullBouncableFactory.getInstance();

        //Formes de départ : 5 de chaque type (TEMPORAIRE : que des cercles)
        for(int i=0; i<5; ++i)
        {
            bouncers.add(emptyBouncableFactory.createCircle());
            bouncers.add(fullBouncableFactory.createCircle());
            bouncers.add(emptyBouncableFactory.createSquare());
            bouncers.add(fullBouncableFactory.createSquare());
        }

        frame = SingletonFrame.getInstance();
        frame.addKeyListener(new KeyAdapter() { //KeyAdapter et non KeyListener pour ne pas avoir à impl toutes les methodes
            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_E :{
                        erase();
                        break;
                    }
                    case KeyEvent.VK_B:{
                        generateShapes(GENERATED_SHAPES, FullBouncableFactory.getInstance());
                        break;
                    }
                    case KeyEvent.VK_F:{
                        generateShapes(GENERATED_SHAPES, FullBouncableFactory.getInstance());
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

    /**
     * Execution of program : periodical shapes movement and rendering
     */
    public void loop()
    {
        Timer clock = new Timer();
        clock.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                frame.createImage();
                for(Bouncable b : new LinkedList<Bouncable>(bouncers))
                {
                    b.move();
                    b.draw();
                }
                frame.repaint();
            }
        },0, REFRESH_PERIOD);

    }

    /**
     * Main
     *
     * @param args
     */
    public static void main(String[] args) {
        new BounceApp().loop();
    }

    /**
     * Erases all bouncers
     */
    private void erase(){
        bouncers = new LinkedList<Bouncable>();
    }

    /**
     * Generates n shapes of each concrete shape kind
     * @param n
     */
    private void generateShapes(int n, BouncableFactory myFactory) {
        for (int i = 0; i < n; ++i) {
            bouncers.add(myFactory.createCircle());
            bouncers.add(myFactory.createSquare());
        }
    }

}
