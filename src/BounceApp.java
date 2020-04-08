import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.*;

public class BounceApp {

    private List<Bouncable> bouncers;
    private EmptyBouncableFactory emptyBouncableFactory;
    private FullBouncableFactory fullBouncableFactory;
    private SingletonFrame frame = SingletonFrame.getInstance();

    BounceApp()
    {
        bouncers = new ArrayList<Bouncable>();
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
                    case KeyEvent.VK_B:{
                        generateEmpty(10);
                        break;
                    }
                    case KeyEvent.VK_F:{
                       generateFull(10);
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
                for(Bouncable b : new LinkedList<Bouncable>(bouncers))
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
