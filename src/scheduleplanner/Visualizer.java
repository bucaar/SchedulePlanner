/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleplanner;

import javax.swing.JApplet;

/**
 *
 * @author Aaron
 */
public class Visualizer extends JApplet{
    
    public Visualizer(Schedule schedule){
        
        add(new Display(schedule));
        
    }
}
