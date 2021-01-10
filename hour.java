
package finalprojectfop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class Hour implements ActionListener{
    private static int hour = 0;
    private static boolean isRunning;
    
    Timer timer = new Timer(3000, new ActionListener() {
        
        @Override
        public void actionPerformed(ActionEvent e) {   
            hour += 3000;
        }
 });
    
        @Override
    public void actionPerformed(ActionEvent e) {
       start();
    }
   
       
    public void start() {
        timer.start();
        isRunning = true;
    }
    
    public void stop() {
        timer.stop();
        isRunning = false;
    }


    public static int getHour() {
        return hour/3000;
    }
    

    
    public void render(Graphics g) {
        Font fnt = new Font("consolas", Font.BOLD, 15);
        g.setFont(fnt);
        g.setColor(Color.white);
        g.drawString("hour: "+getHour(), 120, 12);
    }
    
    public void tick() {
    }


    
    

    
}
