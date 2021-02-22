package StarCraft.view;

import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {
    private boolean running;
    private int height = 600;
    private int width = 800;
    private double fps_desired = 60;
    private double frameTime = fps_desired / 60.0;
    private long frameTimeMillis = (long) (frameTime * 1000.0);

    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private void gameUpdate(){
        if(!running) {

        }
    }

    private void gameRender() {
		
	}

    private void paintScreen() {
  	// use active rendering to put the buffered image on-screen
  	
  }
    

    @Override
    public void run() {
        // Repeatedly update, render, sleep
        running = true;
        Long frameStartTime;
        setVisible(true);
        
        setPreferredSize(new Dimension(width, height)); 
        while(running) {
            frameStartTime = System.currentTimeMillis();
            gameUpdate();
            
            paintScreen();

            try {
                long delayRemaining = frameTimeMillis - System.currentTimeMillis() - frameStartTime;
                if (delayRemaining > 0) {
                    wait(delayRemaining);
                }
            } catch (InterruptedException e) {
                
            }
        }

        System.exit(0);
    }
    
}
