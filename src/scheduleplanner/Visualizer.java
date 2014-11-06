/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.Timer;

/**
 *
 * @author Aaron
 */
public class Visualizer extends JApplet{
    
    private Schedule schedule;
    Display display;
    
    public Visualizer(Schedule schedule){
        display = new Display(schedule);
        this.schedule = schedule;
        
        add(display);
        
        Timer animationTimer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                repaint();
            }
        });

        animationTimer.setRepeats(true);
        animationTimer.start();
    }
}
